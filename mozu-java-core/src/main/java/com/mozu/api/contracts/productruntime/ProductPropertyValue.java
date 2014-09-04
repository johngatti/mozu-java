/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.AttributeVocabularyValueDisplayInfo;

/**
 *	Values of a product property attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPropertyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Property string value in the language specified in the locale code for the product storefront.
	 */
	protected String stringValue;

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	/**
	 * Value of the product property.
	 */
	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	protected AttributeVocabularyValueDisplayInfo displayInfo;

	public AttributeVocabularyValueDisplayInfo getDisplayInfo() {
		return this.displayInfo;
	}

	public void setDisplayInfo(AttributeVocabularyValueDisplayInfo displayInfo) {
		this.displayInfo = displayInfo;
	}

}
