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

/**
 *	Properties of an image or other media file associated with a product category.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryImage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Descriptive text associated with the image or video that appears on the web storefront. This text displays on a hover-over in the browser, providing further information on the content displayed. The alternate text should be plain alphanumeric text without special characters or HTML coding.
	 */
	protected String altText;

	public String getAltText() {
		return this.altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	/**
	 * The identifier of the image in the Mozu CMS. Supply a value for either the CMS ID or Image URL parameter.
	 */
	protected String cmsId;

	public String getCmsId() {
		return this.cmsId;
	}

	public void setCmsId(String cmsId) {
		this.cmsId = cmsId;
	}

	/**
	 * The localized title for an image that displays on the storefront. If localized, the displayed content is set per the locale code for the site.
	 */
	protected String imageLabel;

	public String getImageLabel() {
		return this.imageLabel;
	}

	public void setImageLabel(String imageLabel) {
		this.imageLabel = imageLabel;
	}

	/**
	 * The URL link for the image file associated with a product or category.
	 */
	protected String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Type of media specification required to successfully render the image, video, or other media content for products and categories.
	 */
	protected String mediaType;

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * The numeric order of objects, used by a vocabulary value defined for an extensible attribute, images, and categories.
	 */
	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * The URL of a video files for a product or category. The path name is set in the language specified by the LocaleCode.
	 */
	protected String videoUrl;

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}