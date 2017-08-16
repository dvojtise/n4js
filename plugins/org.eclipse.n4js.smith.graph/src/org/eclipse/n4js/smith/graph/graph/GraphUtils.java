/**
 * Copyright (c) 2016 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.smith.graph.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Display;

/**
 * Some utility methods.
 */
@SuppressWarnings("javadoc")
public class GraphUtils {

	private static final Map<RGB, Color> colors = new HashMap<>();

	public static Color getColor(int red, int green, int blue) {
		return getColor(new RGB(red, green, blue));
	}

	public static Color getColor(RGB rgb) {
		if (!colors.containsKey(rgb)) {
			RGB rgbKey = new RGB(rgb.red, rgb.green, rgb.blue);
			Color rgbColor = new Color(Display.getCurrent(), rgb.red, rgb.green, rgb.blue);
			colors.put(rgbKey, rgbColor);
		}
		return colors.get(rgb);
	}

	public static Rectangle getClip(GC gc) {
		org.eclipse.swt.graphics.Rectangle clip = gc.getClipping();
		return new Rectangle(clip.x, clip.y, clip.width, clip.height);
	}

	public static void drawString(GC gc, String str, float x, float y) {
		drawString(gc, str, x, y, 0, 0, 255);
	}

	public static void drawString(GC gc, String str, float x, float y, float width, float height, int bgAlpha) {
		if (str == null)
			return;

		org.eclipse.swt.graphics.Point size = gc.stringExtent(str);
		int posX = Math.round(x + width / 2 - size.x / 2);
		int posY = Math.round(y + height / 2 - size.y / 2);

		if (bgAlpha >= 255) {
			gc.drawString(str, posX, posY);
		} else {
			gc.drawString(str, posX, posY, true);
			if (bgAlpha > 0) {
				gc.setAlpha(bgAlpha);
				gc.fillRectangle(posX, posY, size.x, size.y);
				gc.setAlpha(255);
			}
		}
	}

	public static List<Node> getNodesForElements(Collection<?> elements, List<? extends Node> allNodes) {
		List<Node> nodes = new LinkedList<>();
		for (Object elem : elements) {
			Node node = getNodeForElement(elem, allNodes);
			if (node != null) {
				nodes.add(node);
			}
		}
		return nodes;
	}

	public static Node getNodeForElement(Object element, List<? extends Node> allNodes) {
		for (Node currN : allNodes) {
			if (currN.getElement() == element) {
				return currN;
			}
		}
		return null;
	}

	public static Rectangle getBounds(Stream<Node> nodes) {
		final Iterator<Node> i = nodes.iterator();
		if (i.hasNext()) {
			float xMin = Float.MAX_VALUE;
			float xMax = Float.MIN_VALUE;
			float yMin = Float.MAX_VALUE;
			float yMax = Float.MIN_VALUE;
			while (i.hasNext()) {
				final Node n = i.next();
				xMin = Math.min(xMin, n.getX());
				yMin = Math.min(yMin, n.getY());
				xMax = Math.max(xMax, n.getX() + n.getWidth());
				yMax = Math.max(yMax, n.getY() + n.getHeight());
			}
			return new Rectangle(xMin, yMin, xMax - xMin, yMax - yMin);
		} else
			return Rectangle.EMPTY;
	}

	public static void drawLine(GC gc, Point p1, Point p2, boolean directed) {
		gc.drawLine(Math.round(p1.x), Math.round(p1.y), Math.round(p2.x), Math.round(p2.y));
		if (directed) {
			drawArrowHead(gc, p1, p2);
		}
	}

	public static void drawArc(GC gc, Point p1, Point p2, boolean directed) {
		gc.drawLine(Math.round(p1.x), Math.round(p1.y), Math.round(p2.x), Math.round(p2.y));
		if (directed) {
			drawArrowHead(gc, p1, p2);
		}
	}

	public static float[] arc(GC gc, Point ctr, Point src, Point tgt) {
		Path path = new Path(gc.getDevice());
		path.moveTo((int) src.x, (int) src.y);
		path.quadTo((int) ctr.x, (int) ctr.y, (int) tgt.x, (int) tgt.y);
		gc.drawPath(path);

		float[] pp = path.getPathData().points;
		return pp;
	}

	public static float[] arcReversed(GC gc, Point src, Point tgt) {
		Path path = new Path(gc.getDevice());
		int ydiff = (int) ((tgt.y - src.y) / 3);
		path.moveTo((int) src.x, (int) src.y);
		path.cubicTo((int) src.x, (int) src.y + ydiff, (int) tgt.x, (int) tgt.y - ydiff * 2, (int) tgt.x, (int) tgt.y);
		gc.drawPath(path);

		float[] pp = path.getPathData().points;
		return pp;
	}

	public static Point pointOnRect(float x, float y, float minX, float minY, float maxX, float maxY) {
		// assert minX <= maxX;
		// assert minY <= maxY;
		if ((minX < x && x < maxX) && (minY < y && y < maxY))
			return null;

		float midX = (minX + maxX) / 2;
		float midY = (minY + maxY) / 2;
		// if (midX - x == 0) -> m == ±Inf -> minYx/maxYx == x (because value / ±Inf = ±0)
		float m = (midY - y) / (midX - x);

		if (x <= midX) { // check "left" side
			float minXy = m * (minX - x) + y;
			if (minY <= minXy && minXy <= maxY)
				return new Point(minX, minXy);
		}

		if (x >= midX) { // check "right" side
			float maxXy = m * (maxX - x) + y;
			if (minY <= maxXy && maxXy <= maxY)
				return new Point(maxX, maxXy);
		}

		if (y <= midY) { // check "top" side
			float minYx = (minY - y) / m + x;
			if (minX <= minYx && minYx <= maxX)
				return new Point(minYx, minY);
		}

		if (y >= midY) { // check "bottom" side
			float maxYx = (maxY - y) / m + x;
			if (minX <= maxYx && maxYx <= maxX)
				return new Point(maxYx, maxY);
		}

		// edge case when finding midpoint intersection: m = 0/0 = NaN
		if (x == midX && y == midY)
			return new Point(x, y);

		return null;
	}

	// poor man's implementation of decorators
	public static void drawArrowHead(GC gc, Point referencePoint, Point p) {
		final double angle = Math.atan2(p.y - referencePoint.y, p.x - referencePoint.x) * 180.0 / Math.PI;
		final Transform tf = new Transform(gc.getDevice());
		tf.rotate(new Double(angle).floatValue());
		tf.scale(7, 3);
		final float[] pnts = new float[] { -1, 1, -1, -1 };
		tf.transform(pnts);
		gc.drawLine(Math.round(p.x), Math.round(p.y), Math.round(p.x + pnts[0]), Math.round(p.y + pnts[1]));
		gc.drawLine(Math.round(p.x), Math.round(p.y), Math.round(p.x + pnts[2]), Math.round(p.y + pnts[3]));
		tf.dispose();
	}

	public static void drawRectangle(GC gc, float x, float y, float width, float height) {
		gc.drawRectangle(Math.round(x), Math.round(y), Math.round(width), Math.round(height));
	}

	public static <T> List<T> concat(Collection<? extends T> coll1, Collection<? extends T> coll2) {
		final List<T> result = new ArrayList<>(coll1.size() + coll2.size());
		result.addAll(coll1);
		result.addAll(coll2);
		return result;
	}
}
