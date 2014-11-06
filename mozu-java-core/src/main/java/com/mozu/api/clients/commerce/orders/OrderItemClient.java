/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use this subresource to retrieve details about items in an active order.
 * </summary>
 */
public class OrderItemClient {
	
	/**
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemClient( orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order item to retrieve.
	 * @param orderItemId Unique identifier of the order item details to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemClient(String orderId, String orderItemId) throws Exception
	{
		return getOrderItemClient( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemClient( orderId,  orderItemId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of this order item, which might include uncommitted changes to the order item, the order, or other order components.
	 * @param orderId Unique identifier of the order item to retrieve.
	 * @param orderItemId Unique identifier of the order item details to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemClient(String orderId, String orderItemId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.getOrderItemUrl(draft, orderId, orderItemId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient=GetOrderItemsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItemCollection orderItemCollection = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order items to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> getOrderItemsClient(String orderId) throws Exception
	{
		return getOrderItemsClient( orderId,  null,  null);
	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient=GetOrderItemsClient( orderId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItemCollection orderItemCollection = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order's items, which might include uncommitted changes to one or more order items, the order itself, or other order components.
	 * @param orderId Unique identifier of the order items to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> getOrderItemsClient(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.getOrderItemsUrl(draft, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds a new item to a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderItemClient( orderItem,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to add the item.
	 * @param orderItem The properties of the item to create in the existing order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId) throws Exception
	{
		return createOrderItemClient( orderItem,  orderId,  null,  null,  null,  null);
	}

	/**
	 * Adds a new item to a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderItemClient( orderItem,  orderId,  updateMode,  version,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to add the item.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param skipInventoryCheck If true, do not validate the product inventory when adding this item to the order.
	 * @param updateMode Specifies whether to add the item by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param orderItem The properties of the item to create in the existing order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String updateMode, String version, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.createOrderItemUrl(orderId, responseFields, skipInventoryCheck, updateMode, version);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderItem);
		return mozuClient;

	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order associated with the item discount.
	 * @param orderItemId Unique identifier of the item in the order.
	 * @param discount Properties of the discount to modify for the order item.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderItemDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId) throws Exception
	{
		return updateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId,  null,  null,  null);
	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order associated with the item discount.
	 * @param orderItemId Unique identifier of the item in the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to change the item discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param discount Properties of the discount to modify for the order item.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderItemDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateOrderItemDiscountUrl(discountId, orderId, orderItemId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		return mozuClient;

	}

	/**
	 * Updates the item fulfillment information for the order specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemFulfillmentClient( orderItem,  orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item in the order.
	 * @param orderItem Properties of the order item to update for fulfillment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemFulfillmentClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId) throws Exception
	{
		return updateItemFulfillmentClient( orderItem,  orderId,  orderItemId,  null,  null,  null);
	}

	/**
	 * Updates the item fulfillment information for the order specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemFulfillmentClient( orderItem,  orderId,  orderItemId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item in the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to apply the coupon by updating the original order, updating the order in draft mode, or updating the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param orderItem Properties of the order item to update for fulfillment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemFulfillmentClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemFulfillmentUrl(orderId, orderItemId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderItem);
		return mozuClient;

	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemProductPriceClient( orderId,  orderItemId,  price);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to price override.
	 * @param orderItemId Unique identifier of the item in the order to price override.
	 * @param price The override price to specify for this item in the specified order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemProductPriceClient(String orderId, String orderItemId, Double price) throws Exception
	{
		return updateItemProductPriceClient( orderId,  orderItemId,  price,  null,  null,  null);
	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemProductPriceClient( orderId,  orderItemId,  price,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to price override.
	 * @param orderItemId Unique identifier of the item in the order to price override.
	 * @param price The override price to specify for this item in the specified order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to change the product price by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemProductPriceClient(String orderId, String orderItemId, Double price, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemProductPriceUrl(orderId, orderItemId, price, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemQuantityClient( orderId,  orderItemId,  quantity);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to update quantity.
	 * @param orderItemId Unique identifier of the item in the order to update quantity.
	 * @param quantity The quantity of the item in the order to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemQuantityClient(String orderId, String orderItemId, Integer quantity) throws Exception
	{
		return updateItemQuantityClient( orderId,  orderItemId,  quantity,  null,  null,  null);
	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemQuantityClient( orderId,  orderItemId,  quantity,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to update quantity.
	 * @param orderItemId Unique identifier of the item in the order to update quantity.
	 * @param quantity The quantity of the item in the order to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to change the item quantity by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemQuantityClient(String orderId, String orderItemId, Integer quantity, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemQuantityUrl(orderId, orderItemId, quantity, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes a previously added item from a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=DeleteOrderItemClient( orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the item to remove.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> deleteOrderItemClient(String orderId, String orderItemId) throws Exception
	{
		return deleteOrderItemClient( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Removes a previously added item from a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=DeleteOrderItemClient( orderId,  orderItemId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the item to remove.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param updateMode Specifies whether to remove the item by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> deleteOrderItemClient(String orderId, String orderItemId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.deleteOrderItemUrl(orderId, orderItemId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



