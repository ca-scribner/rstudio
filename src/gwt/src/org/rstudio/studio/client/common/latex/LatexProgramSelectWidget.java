/*
 * LatexProgramSelectWidget.java
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
package org.rstudio.studio.client.common.latex;

import com.google.gwt.core.client.GWT;
import org.rstudio.core.client.widget.HelpButton;
import org.rstudio.core.client.widget.SelectWidget;
import org.rstudio.studio.client.RStudioGinjector;
import org.rstudio.studio.client.workbench.prefs.views.CompiledPdfPreferencesPaneConstants;

public class LatexProgramSelectWidget extends SelectWidget
{
   public LatexProgramSelectWidget()
   {
      super(constants_.latexProgramSelectLabel(), latexProgramRegistry_.getTypeNames());
         
      HelpButton.addHelpButton(this, "latex_program", constants_.helpLaxtexButtonLabel());
   }
   
   
   public static final LatexProgramRegistry latexProgramRegistry_ = 
         RStudioGinjector.INSTANCE.getLatexProgramRegistry();
   private static final CompiledPdfPreferencesPaneConstants constants_ = GWT.create(CompiledPdfPreferencesPaneConstants.class);
}
