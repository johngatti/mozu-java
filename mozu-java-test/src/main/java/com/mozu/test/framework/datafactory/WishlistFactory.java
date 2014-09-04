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
import com.mozu.api.resources.commerce.WishlistResource;

/** <summary>
 * Use the Wish Lists resource to manage the shopper wish lists of products associated with a customer account. Although customer accounts are managed at the tenant level, the system stores shopper wish lists at the site level. This enables the same customer to have wish lists for each of a merchant's sites. Use the Wish List Items resource to manage items in a wish list.
 * </summary>
 */
public class WishlistFactory
{

	public static com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection getWishlists(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getWishlists(apiContext,  null,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection getWishlists(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection returnObj = new com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection();
		WishlistResource resource = new WishlistResource(apiContext);
		try
		{
			returnObj = resource.getWishlists( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit);
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

	public static com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlist(ApiContext apiContext, String wishlistId, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.wishlists.Wishlist returnObj = new com.mozu.api.contracts.commerceruntime.wishlists.Wishlist();
		WishlistResource resource = new WishlistResource(apiContext);
		try
		{
			returnObj = resource.getWishlist( wishlistId);
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

	public static com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlistByName(ApiContext apiContext, Integer customerAccountId, String wishlistName, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.wishlists.Wishlist returnObj = new com.mozu.api.contracts.commerceruntime.wishlists.Wishlist();
		WishlistResource resource = new WishlistResource(apiContext);
		try
		{
			returnObj = resource.getWishlistByName( customerAccountId,  wishlistName);
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

	public static com.mozu.api.contracts.commerceruntime.wishlists.Wishlist createWishlist(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.wishlists.Wishlist returnObj = new com.mozu.api.contracts.commerceruntime.wishlists.Wishlist();
		WishlistResource resource = new WishlistResource(apiContext);
		try
		{
			returnObj = resource.createWishlist( wishlist);
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

	public static com.mozu.api.contracts.commerceruntime.wishlists.Wishlist updateWishlist(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String wishlistId, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.wishlists.Wishlist returnObj = new com.mozu.api.contracts.commerceruntime.wishlists.Wishlist();
		WishlistResource resource = new WishlistResource(apiContext);
		try
		{
			returnObj = resource.updateWishlist( wishlist,  wishlistId);
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

	public static void deleteWishlist(ApiContext apiContext, String wishlistId, int expectedCode, int successCode) throws Exception
	{
				WishlistResource resource = new WishlistResource(apiContext);
		try
		{
			resource.deleteWishlist( wishlistId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

}



