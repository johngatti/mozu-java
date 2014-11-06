/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class SiteDataUrl
{

	/**
	 * Get Resource Url for GetDBValue
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDBValueUrl(String dbEntryQuery, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/sitedata/{*dbEntryQuery}?responseFields={responseFields}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDBValue
	 * @param dbEntryQuery The database entry string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl createDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/sitedata/{*dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDBValue
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/sitedata/{*dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDBValue
	 * @param dbEntryQuery The database entry string to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/sitedata/{*dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

