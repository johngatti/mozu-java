/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.mzdb;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.mzdb.IndexedProperty;
import com.mozu.api.contracts.mzdb.ListView;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityList implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String contextLevel;

	public String getContextLevel() {
		return this.contextLevel;
	}

	public void setContextLevel(String contextLevel) {
		this.contextLevel = contextLevel;
	}

	protected DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	protected Boolean isLocaleSpecific;

	public Boolean getIsLocaleSpecific() {
		return this.isLocaleSpecific;
	}

	public void setIsLocaleSpecific(Boolean isLocaleSpecific) {
		this.isLocaleSpecific = isLocaleSpecific;
	}

	protected Boolean isSandboxDataCloningSupported;

	public Boolean getIsSandboxDataCloningSupported() {
		return this.isSandboxDataCloningSupported;
	}

	public void setIsSandboxDataCloningSupported(Boolean isSandboxDataCloningSupported) {
		this.isSandboxDataCloningSupported = isSandboxDataCloningSupported;
	}

	protected Boolean isShopperSpecific;

	public Boolean getIsShopperSpecific() {
		return this.isShopperSpecific;
	}

	public void setIsShopperSpecific(Boolean isShopperSpecific) {
		this.isShopperSpecific = isShopperSpecific;
	}

	protected Boolean isVisibleInStorefront;

	public Boolean getIsVisibleInStorefront() {
		return this.isVisibleInStorefront;
	}

	public void setIsVisibleInStorefront(Boolean isVisibleInStorefront) {
		this.isVisibleInStorefront = isVisibleInStorefront;
	}

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String nameSpace;

	public String getNameSpace() {
		return this.nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	protected Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	protected DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	protected Boolean useSystemAssignedId;

	public Boolean getUseSystemAssignedId() {
		return this.useSystemAssignedId;
	}

	public void setUseSystemAssignedId(Boolean useSystemAssignedId) {
		this.useSystemAssignedId = useSystemAssignedId;
	}

	protected IndexedProperty idProperty;

	public IndexedProperty getIdProperty() {
		return this.idProperty;
	}

	public void setIdProperty(IndexedProperty idProperty) {
		this.idProperty = idProperty;
	}

	protected IndexedProperty indexA;

	public IndexedProperty getIndexA() {
		return this.indexA;
	}

	public void setIndexA(IndexedProperty indexA) {
		this.indexA = indexA;
	}

	protected IndexedProperty indexB;

	public IndexedProperty getIndexB() {
		return this.indexB;
	}

	public void setIndexB(IndexedProperty indexB) {
		this.indexB = indexB;
	}

	protected IndexedProperty indexC;

	public IndexedProperty getIndexC() {
		return this.indexC;
	}

	public void setIndexC(IndexedProperty indexC) {
		this.indexC = indexC;
	}

	protected IndexedProperty indexD;

	public IndexedProperty getIndexD() {
		return this.indexD;
	}

	public void setIndexD(IndexedProperty indexD) {
		this.indexD = indexD;
	}

	protected com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	protected List<ListView> views;
	public List<ListView> getViews() {
		return this.views;
	}
	public void setViews(List<ListView> views) {
		this.views = views;
	}

}
