/*
 * VcsHelpLink.java
 *
 * Copyright (C) 2021 by RStudio, PBC
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

package org.rstudio.studio.client.common.vcs;

import org.rstudio.studio.client.common.HelpLink;
import com.google.gwt.core.client.GWT;
import org.rstudio.studio.client.workbench.prefs.views.SourceControlPreferencesPaneConstants;

public class VcsHelpLink extends HelpLink
{
   public VcsHelpLink()
   {
      super(constants_.vCSHelpLink(), "using_version_control");
   }
   private static final SourceControlPreferencesPaneConstants constants_ = GWT.create(SourceControlPreferencesPaneConstants.class);

}
