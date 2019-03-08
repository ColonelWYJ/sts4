/*******************************************************************************
 * Copyright (c) 2018 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.vscode.boot.java.links;

import java.net.URI;

import org.springframework.ide.vscode.commons.java.IJavaProject;

public class EclipseJavaDocumentUriProvider implements JavaDocumentUriProvider {

	@Override
	public URI docUri(IJavaProject project, String fqName) {
		return EclipseSourceLinks.eclipseIntroUri(project, fqName);
	}
}
