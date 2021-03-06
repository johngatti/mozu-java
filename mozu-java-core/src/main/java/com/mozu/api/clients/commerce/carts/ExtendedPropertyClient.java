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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * commerce/carts/cartextendedproperties related resources. DOCUMENT_HERE 
 * </summary>
 */
public class ExtendedPropertyClient {
	
	/**
	 * carts-cartextendedproperties Get GetExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=GetExtendedPropertiesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> getExtendedPropertiesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.getExtendedPropertiesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * carts-cartextendedproperties Post AddExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=AddExtendedPropertiesClient( extendedProperties);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> addExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.addExtendedPropertiesUrl();
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extendedProperties);
		return mozuClient;

	}

	/**
	 * carts-cartextendedproperties Put UpdateExtendedProperty description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key 
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key) throws Exception
	{
		return updateExtendedPropertyClient( extendedProperty,  key,  null,  null);
	}

	/**
	 * carts-cartextendedproperties Put UpdateExtendedProperty description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  key,  upsert,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key 
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param upsert 
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key, Boolean upsert, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.updateExtendedPropertyUrl(key, responseFields, upsert);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extendedProperty);
		return mozuClient;

	}

	/**
	 * carts-cartextendedproperties Put UpdateExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties) throws Exception
	{
		return updateExtendedPropertiesClient( extendedProperties,  null);
	}

	/**
	 * carts-cartextendedproperties Put UpdateExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties,  upsert);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param upsert 
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, Boolean upsert) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.updateExtendedPropertiesUrl(upsert);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extendedProperties);
		return mozuClient;

	}

	/**
	 * carts-cartextendedproperties Delete DeleteExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertiesClient( keys);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param keys 
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteExtendedPropertiesClient(List<String> keys) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.deleteExtendedPropertiesUrl();
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(keys);
		return mozuClient;

	}

	/**
	 * carts-cartextendedproperties Delete DeleteExtendedProperty description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertyClient( key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param key 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtendedPropertyClient(String key) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.deleteExtendedPropertyUrl(key);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



