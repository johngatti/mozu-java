/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Customer Account Segments subresource to view the customer segments associated with a customer account.
 * </summary>
 */
public class CustomerSegmentClient {
	
	/**
	 * Retrieves the list of segments associated with a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetAccountSegmentsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getAccountSegmentsClient(Integer accountId) throws Exception
	{
		return getAccountSegmentsClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves the list of segments associated with a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetAccountSegmentsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getAccountSegmentsClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerSegmentUrl.getAccountSegmentsUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegmentCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



