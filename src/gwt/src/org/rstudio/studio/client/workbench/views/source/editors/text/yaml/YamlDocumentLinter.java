/*
 * YamlDiagnosticsManager.java
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

package org.rstudio.studio.client.workbench.views.source.editors.text.yaml;

import org.rstudio.core.client.CommandWithArg;
import org.rstudio.studio.client.workbench.views.output.lint.model.LintItem;
import org.rstudio.studio.client.workbench.views.source.editors.text.DocDisplay;
import org.rstudio.studio.client.workbench.views.source.editors.text.TextEditingTarget;

import com.google.gwt.core.client.JsArray;

import jsinterop.base.Js;

public class YamlDocumentLinter
{
   public YamlDocumentLinter(TextEditingTarget target, DocDisplay docDisplay)
   {
      target_ = target;
      docDisplay_ = docDisplay;
   }
   
   public void getLint(CommandWithArg<JsArray<LintItem>> ready)
   {
      // do we have a provider that can handle this context
      YamlEditorToolsProvider provider = providers_.getActiveProvider(
         target_.getPath(), target_.getExtendedFileType()
      );
      if (provider == null)
      {
         ready.execute(JsArray.createArray().cast());
      }
      
      // request lint
      YamlEditorContext editorContext = YamlEditorContext.fromDocDisplay(docDisplay_);
      provider.getLint(editorContext, (res) -> {
         if (res != null)
            ready.execute(Js.uncheckedCast(res));
         else
            ready.execute(JsArray.createArray().cast());
      });
         
   }
   
   private final YamlEditorToolsProviders providers_ = new YamlEditorToolsProviders();
   
   private final TextEditingTarget target_;
   private final DocDisplay docDisplay_;
}
