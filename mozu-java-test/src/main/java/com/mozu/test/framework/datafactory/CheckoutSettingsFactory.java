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
import com.mozu.api.resources.commerce.settings.CheckoutSettingsResource;

/** <summary>
 * Use the Checkout Settings resource to specify the site-wide settings that define checkout and order processing behavior. This resource includes subresources for payment settings, customer checkout settings, and order processing settings.
 * </summary>
 */
public class CheckoutSettingsFactory
{

	public static com.mozu.api.contracts.sitesettings.order.CheckoutSettings getCheckoutSettings(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getCheckoutSettings(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.sitesettings.order.CheckoutSettings getCheckoutSettings(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.order.CheckoutSettings returnObj = new com.mozu.api.contracts.sitesettings.order.CheckoutSettings();
		CheckoutSettingsResource resource = new CheckoutSettingsResource(apiContext);
		try
		{
			returnObj = resource.getCheckoutSettings( responseFields);
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



