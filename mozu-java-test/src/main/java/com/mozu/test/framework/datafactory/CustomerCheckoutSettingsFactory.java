/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.settings.checkout.CustomerCheckoutSettingsResource;

/** <summary>
 * Settings for the checkout login. Choose whether or not shoppers must first login before a purchase can be processed. Choose the option for guests to purchase without logging in, prompt guests to login, or require them to login before a purchase can be completed.
 * </summary>
 */
public class CustomerCheckoutSettingsFactory
{

	public static com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings getCustomerCheckoutSettings(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings returnObj = new com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings();
		CustomerCheckoutSettingsResource resource = new CustomerCheckoutSettingsResource(apiContext);
		try
		{
			returnObj = resource.getCustomerCheckoutSettings();
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings updateCustomerCheckoutSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings returnObj = new com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings();
		CustomerCheckoutSettingsResource resource = new CustomerCheckoutSettingsResource(apiContext);
		try
		{
			returnObj = resource.updateCustomerCheckoutSettings( customerCheckoutSettings);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}



