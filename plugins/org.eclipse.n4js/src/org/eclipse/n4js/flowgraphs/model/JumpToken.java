/**
 * Copyright (c) 2017 Marcus Mews.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Marcus Mews - Initial API and implementation
 */
package org.eclipse.n4js.flowgraphs.model;

public class JumpToken {
	final public JumpType type;
	final public Object id;

	public JumpToken(JumpType type) {
		this(type, null);
	}

	public JumpToken(JumpType type, Object id) {
		this.type = type;
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof JumpToken))
			return false;
		JumpToken jt = (JumpToken) o;

		boolean equals = true;
		equals &= type == jt.type;
		equals &= id == jt.id;
		return equals;
	}

	@Override
	public String toString() {
		String s = type.name();
		if (id != null)
			s += " " + id;
		return s;
	}

}