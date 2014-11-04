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
import com.mozu.api.resources.commerce.returns.PackageResource;

/** <summary>
 * Use the Return Packages subresource to manage physical packages used to ship return replacement items.
 * </summary>
 */
public class PackageFactory
{

	public static java.io.InputStream getPackageLabel(ApiContext apiContext, String returnId, String packageId, int expectedCode, int successCode) throws Exception
	{
		java.io.InputStream returnObj;
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.getPackageLabel( returnId,  packageId);
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

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(ApiContext apiContext, String returnId, String packageId, int expectedCode, int successCode) throws Exception
	{
		return getPackage(apiContext,  returnId,  packageId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(ApiContext apiContext, String returnId, String packageId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Package returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.getPackage( returnId,  packageId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, int expectedCode, int successCode) throws Exception
	{
		return createPackage(apiContext,  pkg,  returnId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Package returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.createPackage( pkg,  returnId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String packageId, int expectedCode, int successCode) throws Exception
	{
		return updatePackage(apiContext,  pkg,  returnId,  packageId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String packageId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Package returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.updatePackage( pkg,  returnId,  packageId,  responseFields);
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

	public static void deletePackage(ApiContext apiContext, String returnId, String packageId, int expectedCode, int successCode) throws Exception
	{
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			resource.deletePackage( returnId,  packageId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

}



