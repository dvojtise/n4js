/**
 * Copyright (c) 2017 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.flowgraphs;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.n4js.flowgraphs.factories.ControlFlowGraphFactory;
import org.eclipse.n4js.flowgraphs.model.ComplexNode;
import org.eclipse.n4js.flowgraphs.model.FlowGraph;
import org.eclipse.n4js.n4JS.ControlFlowElement;
import org.eclipse.n4js.n4JS.Script;

import com.google.inject.Singleton;

/**
 *
 */
@Singleton
public class N4JSFlowAnalyses {
	private FlowGraph cfg;

	/**
	 *
	 */
	public void perform(Script script) {
		/*
		 * Protect ASTPostprocessing from failures of flow analyses.
		 */
		try {
			_perform(script);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void _perform(Script script) {
		cfg = ControlFlowGraphFactory.build(script);
	}

	/**
	 *
	 */
	public FlowGraph getControlFlowGraph() {
		return cfg;
	}

	/**
	 *
	 */
	public List<ControlFlowElement> getPredecessors(ControlFlowElement cfe) {
		ComplexNode cn = cfg.getComplexNode(cfe);
		List<ControlFlowElement> cfElems = cn.getExit().getPredecessors();
		return cfElems;
	}

	/**
	 *
	 */
	public List<ControlFlowElement> getSuccessors(ControlFlowElement cfe) {
		ComplexNode cn = cfg.getComplexNode(cfe);
		List<ControlFlowElement> cfElems = cn.getExit().getSuccessors();
		return cfElems;
	}

	/**
	 * @return collection of all non-control {@link ControlFlowElement}s covered by the control flow analyses
	 */
	public Collection<ControlFlowElement> getAllElements() {
		List<ControlFlowElement> allCFEs = new LinkedList<>();
		for (ComplexNode cn : cfg.getAllComplexNodes()) {
			if (!cn.isControlElement()) {
				allCFEs.add(cn.getCFE());
			}
		}
		return allCFEs;
	}

}
