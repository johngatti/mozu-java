/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * commerce/orders/extendedproperties related resources. DOCUMENT_HERE 
 * </summary>
 */
public class ExtendedPropertyResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ExtendedPropertyResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * orders-extendedproperties Get GetExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.getExtendedProperties( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> getExtendedProperties(String orderId) throws Exception
	{
		return getExtendedProperties( orderId,  null);
	}

	/**
	 * orders-extendedproperties Get GetExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.getExtendedProperties( orderId,  draft);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> getExtendedProperties(String orderId, Boolean draft) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.getExtendedPropertiesClient( orderId,  draft);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * orders-extendedproperties Post AddExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.addExtendedProperties( extendedProperties,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> addExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return addExtendedProperties( extendedProperties,  orderId,  null,  null);
	}

	/**
	 * orders-extendedproperties Post AddExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.addExtendedProperties( extendedProperties,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> addExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.addExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * orders-extendedproperties Put UpdateExtendedProperty description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key) throws Exception
	{
		return updateExtendedProperty( extendedProperty,  orderId,  key,  null,  null,  null,  null);
	}

	/**
	 * orders-extendedproperties Put UpdateExtendedProperty description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert 
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key, String updateMode, String version, Boolean upsert, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertyClient( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * orders-extendedproperties Put UpdateExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return updateExtendedProperties( extendedProperties,  orderId,  null,  null,  null);
	}

	/**
	 * orders-extendedproperties Put UpdateExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties,  orderId,  updateMode,  version,  upsert);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert 
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version, Boolean upsert) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version,  upsert);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * orders-extendedproperties Delete DeleteExtendedProperty description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperty( orderId,  key);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @return 
	 */
	public void deleteExtendedProperty(String orderId, String key) throws Exception
	{
		deleteExtendedProperty( orderId,  key,  null,  null);
	}

	/**
	 * orders-extendedproperties Delete DeleteExtendedProperty description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperty( orderId,  key,  updateMode,  version);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return 
	 */
	public void deleteExtendedProperty(String orderId, String key, String updateMode, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.deleteExtendedPropertyClient( orderId,  key,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * orders-extendedproperties Delete DeleteExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperties( keys,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param keys 
	 * @return 
	 * @see string
	 */
	public void deleteExtendedProperties(List<String> keys, String orderId) throws Exception
	{
		deleteExtendedProperties( keys,  orderId,  null,  null);
	}

	/**
	 * orders-extendedproperties Delete DeleteExtendedProperties description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperties( keys,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param keys 
	 * @return 
	 * @see string
	 */
	public void deleteExtendedProperties(List<String> keys, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.deleteExtendedPropertiesClient( keys,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



