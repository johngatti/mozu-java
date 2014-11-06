/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.event.push;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class SubscriptionClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> mozuClient=GetSubscriptionsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SubscriptionCollection subscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.SubscriptionCollection>
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> getSubscriptionsClient() throws Exception
	{
		return getSubscriptionsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> mozuClient=GetSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SubscriptionCollection subscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.SubscriptionCollection>
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> getSubscriptionsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.push.SubscriptionUrl.getSubscriptionsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.SubscriptionCollection.class;
		MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.event.SubscriptionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



