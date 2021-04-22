/*
 * AboutDialog.java
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

package org.rstudio.studio.client.application.ui;
import com.google.gwt.aria.client.Roles;
import com.google.gwt.core.client.GWT;
import org.rstudio.core.client.ElementIds;
import org.rstudio.core.client.widget.ModalDialogBase;
import org.rstudio.core.client.widget.ThemedButton;
import org.rstudio.studio.client.RStudioGinjector;
import org.rstudio.studio.client.application.Desktop;
import org.rstudio.studio.client.application.model.ProductEditionInfo;
import org.rstudio.studio.client.application.model.ProductInfo;

import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class AboutDialog extends ModalDialogBase
{
   private AboutDialogConstants constants = GWT.create(AboutDialogConstants.class);
   private AboutDialogMessages messages = GWT.create(AboutDialogMessages.class);

   public AboutDialog(ProductInfo info)
   {
      super(Roles.getDialogRole());
      RStudioGinjector.INSTANCE.injectMembers(this);

      // DEBUG: TODO: Fix this for real
//      Modified to test i18n
//      setText("About " + editionInfo_.editionName());
      setText(messages.title(editionInfo_.editionName()));
//      ThemedButton OKButton = new ThemedButton("OK", (ClickEvent) -> closeDialog());
      ThemedButton OKButton = new ThemedButton(constants.okBtn(), (ClickEvent) -> closeDialog());
      addOkButton(OKButton);

      if (editionInfo_.proLicense() && Desktop.hasDesktopFrame())
      {
         ThemedButton licenseButton = new ThemedButton(constants.manageLicenseBtn(), (ClickEvent) ->  {
            closeDialog();
            editionInfo_.showLicense();
         });
         addLeftButton(licenseButton, ElementIds.ABOUT_MANAGE_LICENSE_BUTTON);
      }
      contents_ = new AboutDialogContents(info, editionInfo_);
      setARIADescribedBy(contents_.getDescriptionElement());
      setWidth("600px");
   }

   @Override
   protected Widget createMainWidget()
   {
      return contents_;
   }

   @Override
   protected void focusInitialControl()
   {
      focusOkButton();
   }

   @Inject
   private void initialize(ProductEditionInfo editionInfo)
   {
      editionInfo_ = editionInfo;
   }

   private AboutDialogContents contents_;
   private ProductEditionInfo editionInfo_;
}