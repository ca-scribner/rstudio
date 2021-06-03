/*
 * UriUtilsTests.java
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
package org.rstudio.core.client;

import com.google.gwt.junit.client.GWTTestCase;


public class URIUtilsTests extends GWTTestCase
{
   @Override
   public String getModuleName()
   {
      return "org.rstudio.studio.RStudioTests";
   }
   
   public void testLocalUrls()
   {
      // local URLs
      assertTrue(URIUtils.isLocalUrl("http://localhost:9432/")); //$NON-NLS-1$
      assertTrue(URIUtils.isLocalUrl("path/to/file.html")); //$NON-NLS-1$
      assertTrue(URIUtils.isLocalUrl("https://127.0.0.1/")); //$NON-NLS-1$

      // remote URLs
      assertFalse(URIUtils.isLocalUrl("https://example.com/")); //$NON-NLS-1$
      assertFalse(URIUtils.isLocalUrl("http://8.8.8.8/")); //$NON-NLS-1$
      assertFalse(URIUtils.isLocalUrl("http://eightyseven:8787/")); //$NON-NLS-1$
   }
}
