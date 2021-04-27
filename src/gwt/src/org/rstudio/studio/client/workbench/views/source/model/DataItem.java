/*
 * DataItem.java
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
package org.rstudio.studio.client.workbench.views.source.model;

import com.google.gwt.core.client.JavaScriptObject;
import org.rstudio.core.client.js.JsObject;

import java.util.HashMap;

public class DataItem extends JavaScriptObject
{
   public static final String URI_PREFIX = "data://"; //$NON-NLS-1$
   
   protected DataItem()
   {
   }

   public static final native DataItem create(String caption,
                                              String expression,
                                              int totalObservations,
                                              int displayedObservations,
                                              int variables,
                                              String contentUrl,
                                              int preview) /*-{
      var dataItem = new Object();
      dataItem.caption = caption;
      dataItem.expression = expression;
      dataItem.totalObservations = totalObservations;
      dataItem.displayedObservations = displayedObservations;
      dataItem.variables = variables;
      dataItem.contentUrl = contentUrl;
      dataItem.preview = preview;
      return dataItem;
   }-*/;

   public final String getURI()
   {
      return URI_PREFIX + getCaption();
   }
   
   public native final String getCaption() /*-{
      return this.caption;
   }-*/;
   
   public native final String getExpression() /*-{
      return this.expression;
   }-*/;
   
   public native final int getTotalObservations() /*-{
      // This will sometimes be a number, sometimes a string. Ugh
      return this.totalObservations - 0;
   }-*/;
   
   public native final int getDisplayedObservations() /*-{
      // This will sometimes be a number, sometimes a string. Ugh
      return this.displayedObservations - 0;
   }-*/;
   
   public native final int getVariables() /*-{
      // This will sometimes be a number, sometimes a string. Ugh
      return this.variables - 0;
   }-*/;
   
   public native final String getContentUrl() /*-{
      return this.contentUrl;
   }-*/;
   
   public native final String getCacheKey() /*-{
      return this.cacheKey;
   }-*/;

   public native final String getObject() /*-{
      return this.object;
   }-*/;

   public native final String getEnvironment() /*-{
      return this.environment;
   }-*/;
   
   public native final boolean isPreview() /*-{
      // This will sometimes be a number, sometimes a string. Ugh
      if (this.preview !== undefined)
         return (this.preview - 0) === 1;
      else
         return false;
   }-*/;

   public final void fillProperties(HashMap<String, String> properties)
   {
      // This has the unfortunate side-effect of converting the numeric values
      // to strings. Can't be helped without refactoring
      // SourceServerOperations#modifyDocumentProperties to take a less typesafe
      // container type.
      properties.put("caption", getCaption()); //$NON-NLS-1$
      properties.put("expression", getExpression()); //$NON-NLS-1$
      properties.put("totalObservations", getTotalObservations() + ""); //$NON-NLS-1$
      properties.put("displayedObservations", getDisplayedObservations() + ""); //$NON-NLS-1$
      properties.put("variables", getVariables() + ""); //$NON-NLS-1$
      properties.put("contentUrl", getContentUrl()); //$NON-NLS-1$
      properties.put("cacheKey", getCacheKey()); //$NON-NLS-1$
      properties.put("object", getObject()); //$NON-NLS-1$
      properties.put("environment", getEnvironment()); //$NON-NLS-1$
      properties.put("preview", (isPreview() ? 1 : 0) + ""); //$NON-NLS-1$
   }

   public final void fillProperties(JsObject properties)
   {
      properties.setString("caption", getCaption()); //$NON-NLS-1$
      properties.setString("expression", getExpression()); //$NON-NLS-1$
      properties.setInteger("totalObservations", getTotalObservations()); //$NON-NLS-1$
      properties.setInteger("displayedObservations", getDisplayedObservations()); //$NON-NLS-1$
      properties.setInteger("variables", getVariables()); //$NON-NLS-1$
      properties.setString("contentUrl", getContentUrl()); //$NON-NLS-1$
      properties.setString("cacheKey", getCacheKey()); //$NON-NLS-1$
      properties.setString("object", getObject()); //$NON-NLS-1$
      properties.setString("environment", getEnvironment()); //$NON-NLS-1$
      properties.setInteger("properties", isPreview() ? 1 : 0); //$NON-NLS-1$
   }
}
