/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.carts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The properties of an active shopping cart.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, this shopping cart is active.
	 */
	protected Boolean hasActiveCart;

	public Boolean getHasActiveCart() {
		return this.hasActiveCart;
	}

	public void setHasActiveCart(Boolean hasActiveCart) {
		this.hasActiveCart = hasActiveCart;
	}

	/**
	 * If true, the cart's period of inactivity is past its calculated expiration date and the cart is considered abandoned.
	 */
	protected Boolean isExpired;

	public Boolean getIsExpired() {
		return this.isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	/**
	 * The total number of line items in the cart. Each line item can have multiple quantities.
	 */
	protected Integer itemCount;

	public Integer getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	/**
	 * Total is used to indicate the monetary, estimated total amount of the cart or order, including items, sales tax, shipping costs, and other fees. Totals are not estimated for wish lists at this time.
	 */
	protected Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * The combined total quantity across all items in the cart.
	 */
	protected Integer totalQuantity;

	public Integer getTotalQuantity() {
		return this.totalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
