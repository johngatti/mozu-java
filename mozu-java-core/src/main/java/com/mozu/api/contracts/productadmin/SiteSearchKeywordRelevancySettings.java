/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSearchKeywordRelevancySettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer attributesWeight;

	public Integer getAttributesWeight() {
		return this.attributesWeight;
	}

	public void setAttributesWeight(Integer attributesWeight) {
		this.attributesWeight = attributesWeight;
	}

	protected Integer descriptionWeight;

	public Integer getDescriptionWeight() {
		return this.descriptionWeight;
	}

	public void setDescriptionWeight(Integer descriptionWeight) {
		this.descriptionWeight = descriptionWeight;
	}

	protected Integer keywordsWeight;

	public Integer getKeywordsWeight() {
		return this.keywordsWeight;
	}

	public void setKeywordsWeight(Integer keywordsWeight) {
		this.keywordsWeight = keywordsWeight;
	}

	protected Integer mpnWeight;

	public Integer getMpnWeight() {
		return this.mpnWeight;
	}

	public void setMpnWeight(Integer mpnWeight) {
		this.mpnWeight = mpnWeight;
	}

	protected Integer nameWeight;

	public Integer getNameWeight() {
		return this.nameWeight;
	}

	public void setNameWeight(Integer nameWeight) {
		this.nameWeight = nameWeight;
	}

	protected Integer productCodeLooseWeight;

	public Integer getProductCodeLooseWeight() {
		return this.productCodeLooseWeight;
	}

	public void setProductCodeLooseWeight(Integer productCodeLooseWeight) {
		this.productCodeLooseWeight = productCodeLooseWeight;
	}

	protected Integer productCodeWeight;

	public Integer getProductCodeWeight() {
		return this.productCodeWeight;
	}

	public void setProductCodeWeight(Integer productCodeWeight) {
		this.productCodeWeight = productCodeWeight;
	}

	protected Integer upcWeight;

	public Integer getUpcWeight() {
		return this.upcWeight;
	}

	public void setUpcWeight(Integer upcWeight) {
		this.upcWeight = upcWeight;
	}

}