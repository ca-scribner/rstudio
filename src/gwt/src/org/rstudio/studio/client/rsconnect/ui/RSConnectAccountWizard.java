/*
 * RSConnectAccountWizard.java
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
package org.rstudio.studio.client.rsconnect.ui;

import java.util.ArrayList;

import com.google.gwt.aria.client.Roles;
import com.google.gwt.core.client.GWT;
import org.rstudio.core.client.resources.ImageResource2x;
import org.rstudio.core.client.widget.OperationWithInput;
import org.rstudio.core.client.widget.ProgressOperationWithInput;
import org.rstudio.core.client.widget.Wizard;
import org.rstudio.core.client.widget.WizardNavigationPage;
import org.rstudio.core.client.widget.WizardPage;
import org.rstudio.studio.client.common.GlobalDisplay;
import org.rstudio.studio.client.rsconnect.model.NewRSConnectAccountInput;
import org.rstudio.studio.client.rsconnect.model.NewRSConnectAccountResult;
import org.rstudio.studio.client.rsconnect.model.RSConnectServerOperations;
import org.rstudio.studio.client.workbench.prefs.views.PublishingPreferencesPaneConstants;

public class RSConnectAccountWizard 
   extends Wizard<NewRSConnectAccountInput,NewRSConnectAccountResult>
{
   public RSConnectAccountWizard(
         RSConnectServerOperations server,
         GlobalDisplay display,
         boolean forFirstAccount,
         boolean showCloudPage,
         ProgressOperationWithInput<NewRSConnectAccountResult> operation)
   {
      super(constants_.connectAccountCaption(), constants_.connectAccountOkCaption(), Roles.getDialogRole(),
            new NewRSConnectAccountInput(server, display), 
            forFirstAccount ? 
               createIntroPage(showCloudPage) : 
               createSelectorPage(showCloudPage),
            operation);
      initAuthPage(getFirstPage());
   }
   
   private void initAuthPage(WizardPage<NewRSConnectAccountInput,
                                         NewRSConnectAccountResult> page)
   {
      if (page instanceof NewRSConnectAuthPage)
      {
         NewRSConnectAuthPage localPage = (NewRSConnectAuthPage) page;
         localPage.setOkButtonVisible(new OperationWithInput<Boolean>()
         {
            @Override
            public void execute(Boolean input)
            {
               setOkButtonVisible(input);
            }
         });
         return;
      }

      ArrayList<WizardPage<NewRSConnectAccountInput,
                           NewRSConnectAccountResult>> subPages = 
                           page.getSubPages();
      if (subPages != null)
      {
         for (int i = 0; i < subPages.size(); i++)
         {
            initAuthPage(subPages.get(i));
         }
      }
   }
   
   
   protected static WizardPage<NewRSConnectAccountInput,
                               NewRSConnectAccountResult> createIntroPage(
                                     boolean showCloudPage)
   {
      return new NewRSConnectAccountPage(constants_.newRSConnectAccountPageTitle(),
            constants_.newRSConnectAccountPageSubTitle(), constants_.newRSConnectAccountPageCaption(),
            new ImageResource2x(RSConnectResources.INSTANCE.publishIcon2x()),
            new ImageResource2x(RSConnectResources.INSTANCE.publishIconLarge2x()),
            createSelectorPage(showCloudPage));
   }
   
   protected static WizardPage<NewRSConnectAccountInput,
                               NewRSConnectAccountResult> createSelectorPage(
                                     boolean showCloudPage)
   {
      if (showCloudPage)
      {
         return new WizardNavigationPage<>(
                  constants_.wizardNavigationPageTitle(),
                  constants_.wizardNavigationPageSubTitle(),
                  constants_.wizardNavigationPageCaption(),
                  null, 
                  null, 
                  createPages());
      }
      return new NewRSConnectLocalPage();
   }
   
   protected static ArrayList<WizardPage<NewRSConnectAccountInput, 
                                         NewRSConnectAccountResult>> createPages()
   {
      ArrayList<WizardPage<NewRSConnectAccountInput, 
                           NewRSConnectAccountResult>> pages = new ArrayList<>();

      pages.add(new NewRSConnectCloudPage());
      pages.add(new NewRSConnectLocalPage());
      return pages;
   }
   private static final PublishingPreferencesPaneConstants constants_ = GWT.create(PublishingPreferencesPaneConstants.class);
   public static final String SERVICE_NAME =  "RStudio Connect";
   public static final String SERVICE_DESCRIPTION =
           constants_.serviceDescription() +
           constants_.serviceMessageDescription();

}
