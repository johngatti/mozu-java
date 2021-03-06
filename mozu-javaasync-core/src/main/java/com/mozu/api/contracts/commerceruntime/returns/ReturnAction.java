/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of an action a user can perform for a return.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnAction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The name of the fulfillment action to perform for the purchased product. Options include "Ship" or "PickUp" (in-store pick-up).
	 */
	protected String actionName;

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * The list of returns for which to perform the action.
	 */
	protected List<String> returnIds;
	public List<String> getReturnIds() {
		return this.returnIds;
	}
	public void setReturnIds(List<String> returnIds) {
		this.returnIds = returnIds;
	}

}
