/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class LocationUsageUrl
{

	/**
	 * Get Resource Url for GetLocationUsages
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationUsagesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/locationUsages/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLocationUsage
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationUsageUrl(String code, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/locationUsages/{code}?responseFields={responseFields}");
		formatter.formatUrl("code", code);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateLocationUsage
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateLocationUsageUrl(String code, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/locationUsages/{code}?responseFields={responseFields}");
		formatter.formatUrl("code", code);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
