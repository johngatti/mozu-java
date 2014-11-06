/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Customer Segments resource to manage the segments that enable a client to manage groups of customers and target discounts for these segments. After a customer segment is defined, you can associate any number of customer accounts with it.
 * </summary>
 */
public class CustomerSegmentClient {
	
	/**
	 * Retrieves a list of defined customer segments according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetSegmentsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getSegmentsClient() throws Exception
	{
		return getSegmentsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of defined customer segments according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetSegmentsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getSegmentsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.getSegmentsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegmentCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the customer segment specified in the request. This operation does not return a list of the customer accounts associated with the segment.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=GetSegmentClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> getSegmentClient(Integer id) throws Exception
	{
		return getSegmentClient( id,  null);
	}

	/**
	 * Retrieves the details of the customer segment specified in the request. This operation does not return a list of the customer accounts associated with the segment.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=GetSegmentClient( id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> getSegmentClient(Integer id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.getSegmentUrl(id, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new customer segments. New customer segments do not have any associated customer accounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=AddSegmentClient( segment);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param segment Properties of the customer segment to add.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> addSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment) throws Exception
	{
		return addSegmentClient( segment,  null);
	}

	/**
	 * Creates a new customer segments. New customer segments do not have any associated customer accounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=AddSegmentClient( segment,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param segment Properties of the customer segment to add.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> addSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.addSegmentUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(segment);
		return mozuClient;

	}

	/**
	 * Adds one or more customer accounts to a defined customer segment.
	 * <p><pre><code>
	 * MozuClient mozuClient=AddSegmentAccountsClient( accountIds,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment for which to add the associated customer accounts.
	 * @param accountIds List of customer account IDs to add to the customer segment specified in the request.
	 * @return Mozu.Api.MozuClient 
	 * @see int
	 */
	public static MozuClient addSegmentAccountsClient(List<Integer> accountIds, Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.addSegmentAccountsUrl(id);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(accountIds);
		return mozuClient;

	}

	/**
	 * Updates the details of the customer segment specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=UpdateSegmentClient( segment,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment.
	 * @param segment Properties of the customer segment to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> updateSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id) throws Exception
	{
		return updateSegmentClient( segment,  id,  null);
	}

	/**
	 * Updates the details of the customer segment specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=UpdateSegmentClient( segment,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param segment Properties of the customer segment to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> updateSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.updateSegmentUrl(id, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(segment);
		return mozuClient;

	}

	/**
	 * Deletes a customer segment specified by its unique identifier. Deleting a segment removes any customer account associations, but does not delete the customer account itself.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteSegmentClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteSegmentClient(Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.deleteSegmentUrl(id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveSegmentAccountClient( id,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId 
	 * @param id 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeSegmentAccountClient(Integer id, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.removeSegmentAccountUrl(accountId, id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



