/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.carts;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Cart Messages resource to retrieve messages for live carts that the system logs when a product's price or inventory level changes.
 * </summary>
 */
public class ChangeMessageClient {
	
	/**
	 * Retrieves the messages associated with the current shopper's cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> mozuClient=GetMessagesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartChangeMessageCollection cartChangeMessageCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> getMessagesClient() throws Exception
	{
		return getMessagesClient( null);
	}

	/**
	 * Retrieves the messages associated with the current shopper's cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> mozuClient=GetMessagesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartChangeMessageCollection cartChangeMessageCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> getMessagesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ChangeMessageUrl.getMessagesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Deletes all messages associated with the cart of the current shopper.
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveAllMessagesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeAllMessagesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ChangeMessageUrl.removeAllMessagesUrl();
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes a single message associated with the cart of the current shopper.
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveMessageClient( messageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param messageId Identifier of the message to remove from the cart.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeMessageClient(String messageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ChangeMessageUrl.removeMessageUrl(messageId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



