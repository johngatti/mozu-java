/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of an application's behavior.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Behavior implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of a category. 
	 */
	protected Integer categoryId;

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * If true, this application behavior is not part of the public Mozu API.
	 */
	protected Boolean isPrivate;

	public Boolean getIsPrivate() {
		return this.isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * For validation purposes, the integer value must be a list of behavior IDs.
	 */
	protected List<Integer> requiresBehaviorIds;
	public List<Integer> getRequiresBehaviorIds() {
		return this.requiresBehaviorIds;
	}
	public void setRequiresBehaviorIds(List<Integer> requiresBehaviorIds) {
		this.requiresBehaviorIds = requiresBehaviorIds;
	}

	/**
	 * Provides a list of system roles for a specified behavior.
	 */
	protected List<String> systemRoles;
	public List<String> getSystemRoles() {
		return this.systemRoles;
	}
	public void setSystemRoles(List<String> systemRoles) {
		this.systemRoles = systemRoles;
	}

	/**
	 * The user types that are valid for this behavior.
	 */
	protected List<String> validUserTypes;
	public List<String> getValidUserTypes() {
		return this.validUserTypes;
	}
	public void setValidUserTypes(List<String> validUserTypes) {
		this.validUserTypes = validUserTypes;
	}

}