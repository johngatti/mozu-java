/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.orders.DigitalPackageResource;

/** <summary>
 * A digital package is a package in a digital format.
 * </summary>
 */
public class DigitalPackageFactory
{

	public static List<String> getAvailableDigitalPackageFulfillmentActions(ApiContext apiContext, String orderId, String digitalPackageId, int expectedCode) throws Exception
	{
		List<String> returnObj = new ArrayList<String>();
		DigitalPackageResource resource = new DigitalPackageResource(apiContext);
		try
		{
			returnObj = resource.getAvailableDigitalPackageFulfillmentActions( orderId,  digitalPackageId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage getDigitalPackage(ApiContext apiContext, String orderId, String digitalPackageId, int expectedCode) throws Exception
	{
		return getDigitalPackage(apiContext,  orderId,  digitalPackageId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage getDigitalPackage(ApiContext apiContext, String orderId, String digitalPackageId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage();
		DigitalPackageResource resource = new DigitalPackageResource(apiContext);
		try
		{
			returnObj = resource.getDigitalPackage( orderId,  digitalPackageId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage createDigitalPackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, int expectedCode) throws Exception
	{
		return createDigitalPackage(apiContext,  digitalPackage,  orderId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage createDigitalPackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage();
		DigitalPackageResource resource = new DigitalPackageResource(apiContext);
		try
		{
			returnObj = resource.createDigitalPackage( digitalPackage,  orderId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage updateDigitalPackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String digitalPackageId, int expectedCode) throws Exception
	{
		return updateDigitalPackage(apiContext,  digitalPackage,  orderId,  digitalPackageId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage updateDigitalPackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String digitalPackageId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage();
		DigitalPackageResource resource = new DigitalPackageResource(apiContext);
		try
		{
			returnObj = resource.updateDigitalPackage( digitalPackage,  orderId,  digitalPackageId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deleteDigitalPackage(ApiContext apiContext, String orderId, String digitalPackageId, int expectedCode) throws Exception
	{
		DigitalPackageResource resource = new DigitalPackageResource(apiContext);
		try
		{
			resource.deleteDigitalPackage( orderId,  digitalPackageId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



