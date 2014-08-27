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
import com.mozu.api.resources.commerce.LocationResource;

/** <summary>
 * 
 * </summary>
 */
public class CommerceLocationFactory
{

	public static com.mozu.api.contracts.location.Location getLocation(ApiContext apiContext, String code, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getLocation( code);
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

	public static com.mozu.api.contracts.location.Location getLocationInUsageType(ApiContext apiContext, String locationUsageType, String code, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getLocationInUsageType( locationUsageType,  code);
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

	public static com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(ApiContext apiContext, String locationUsageType, int expectedCode, int successCode) throws Exception
	{
		return getLocationsInUsageType(apiContext,  locationUsageType,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(ApiContext apiContext, String locationUsageType, Integer startIndex, Integer pageSize, String sortBy, String filter, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationCollection returnObj = new com.mozu.api.contracts.location.LocationCollection();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getLocationsInUsageType( locationUsageType,  startIndex,  pageSize,  sortBy,  filter);
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

	public static com.mozu.api.contracts.location.Location getDirectShipLocation(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getDirectShipLocation();
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

	public static com.mozu.api.contracts.location.Location getInStorePickupLocation(ApiContext apiContext, String code, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getInStorePickupLocation( code);
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

	public static com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getInStorePickupLocations(apiContext,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationCollection returnObj = new com.mozu.api.contracts.location.LocationCollection();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getInStorePickupLocations( startIndex,  pageSize,  sortBy,  filter);
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


