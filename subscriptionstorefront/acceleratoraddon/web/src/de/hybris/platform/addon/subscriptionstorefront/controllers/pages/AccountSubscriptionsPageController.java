/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.addon.subscriptionstorefront.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import javax.annotation.Nonnull;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for home page.
 */
@Controller
@RequestMapping("/my-account/subscription")
public class AccountSubscriptionsPageController
{

	private static final String PAGE = "pages/account/accountSubscriptionPage";
	// CMS Pages
	private static final Logger LOG = Logger.getLogger(AccountSubscriptionsPageController.class);

    // handles the path as /my-account/subscription and returns view corresponding to identifier SUBSCRIPTIONS_CMS_PAGE ("subscriptions" - see the identifier in cms-content.impex)
	@RequestMapping(method = RequestMethod.GET)
	public String subscriptions(@Nonnull final Model model) throws CMSItemNotFoundException
	{
		System.out.println("Test");
		return PAGE;
	}

}
