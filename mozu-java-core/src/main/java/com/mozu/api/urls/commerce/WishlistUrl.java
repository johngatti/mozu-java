/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class WishlistUrl
{

	/**
	 * Get Resource Url for GetWishlists
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of search terms to use in the query when searching across wish list name. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields 
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistsUrl(String filter, Integer pageSize, String q, Integer qLimit, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&q={q}&qLimit={qLimit}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetWishlist
	 * @param responseFields 
	 * @param wishlistId Unique identifier of the shopper wish list to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistUrl(String responseFields, String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetWishlistByName
	 * @param customerAccountId 
	 * @param responseFields 
	 * @param wishlistName 
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistByNameUrl(Integer customerAccountId, String responseFields, String wishlistName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/customers/{customerAccountId}/{wishlistName}?responseFields={responseFields}");
		formatter.formatUrl("customerAccountId", customerAccountId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistName", wishlistName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateWishlist
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createWishlistUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateWishlist
	 * @param responseFields 
	 * @param wishlistId Unique identifier of the shopper wish list to update.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateWishlistUrl(String responseFields, String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteWishlist
	 * @param wishlistId Unique identifier of the wish list to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteWishlistUrl(String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}");
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

