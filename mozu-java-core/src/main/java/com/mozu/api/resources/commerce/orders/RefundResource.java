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
 * commerce/orders/orderrefunds related resources. DOCUMENT_HERE 
 * </summary>
 */
public class RefundResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public RefundResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * orders-orderrefunds Post CreateRefund description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	Refund refund = refund.createRefund( refund,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refund Mozu.CommerceRuntime.Contracts.Refunds.Refund ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public com.mozu.api.contracts.commerceruntime.refunds.Refund createRefund(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId) throws Exception
	{
		return createRefund( refund,  orderId,  null);
	}

	/**
	 * orders-orderrefunds Post CreateRefund description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	Refund refund = refund.createRefund( refund,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param refund Mozu.CommerceRuntime.Contracts.Refunds.Refund ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public com.mozu.api.contracts.commerceruntime.refunds.Refund createRefund(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> client = com.mozu.api.clients.commerce.orders.RefundClient.createRefundClient( refund,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * orders-orderrefunds Put ResendRefundEmail description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	refund.resendRefundEmail( orderId,  refundId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refundId 
	 * @return 
	 */
	public void resendRefundEmail(String orderId, String refundId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.RefundClient.resendRefundEmailClient( orderId,  refundId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



