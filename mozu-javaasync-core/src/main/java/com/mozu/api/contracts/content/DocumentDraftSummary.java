/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Summary properties of an unpublished document draft.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDraftSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Detailed information of the date and time for the active update date for the document draft summary. This data is associated to document and content data.
	 */
	protected DateTime activeUpdateDate;

	public DateTime getActiveUpdateDate() {
		return this.activeUpdateDate;
	}

	public void setActiveUpdateDate(DateTime activeUpdateDate) {
		this.activeUpdateDate = activeUpdateDate;
	}

	/**
	 * Fully qualified name of the document type. 
	 */
	protected String documentTypeFQN;

	public String getDocumentTypeFQN() {
		return this.documentTypeFQN;
	}

	public void setDocumentTypeFQN(String documentTypeFQN) {
		this.documentTypeFQN = documentTypeFQN;
	}

	/**
	 * Detailed information of the date and time for the draft update date for the document draft summary. This data is associated to document and content data.
	 */
	protected DateTime draftUpdateDate;

	public DateTime getDraftUpdateDate() {
		return this.draftUpdateDate;
	}

	public void setDraftUpdateDate(DateTime draftUpdateDate) {
		this.draftUpdateDate = draftUpdateDate;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The fully qualified name of the document list.
	 */
	protected String listFQN;

	public String getListFQN() {
		return this.listFQN;
	}

	public void setListFQN(String listFQN) {
		this.listFQN = listFQN;
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
	 * Whether the draft has been published.
	 */
	protected String publishType;

	public String getPublishType() {
		return this.publishType;
	}

	public void setPublishType(String publishType) {
		this.publishType = publishType;
	}

	/**
	 * Unique identifier of the user who last modified the item. This value is system-supplied and read-only.
	 */
	protected String updatedBy;

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}