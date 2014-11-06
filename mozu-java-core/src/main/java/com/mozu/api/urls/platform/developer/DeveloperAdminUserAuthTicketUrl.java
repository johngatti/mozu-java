/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.developer;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class DeveloperAdminUserAuthTicketUrl
{

	/**
	 * Get Resource Url for CreateDeveloperUserAuthTicket
	 * @param developerAccountId Unique identifier of the developer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createDeveloperUserAuthTicketUrl(Integer developerAccountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/authtickets/?developerAccountId={developerAccountId}&responseFields={responseFields}");
		formatter.formatUrl("developerAccountId", developerAccountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for RefreshDeveloperAuthTicket
	 * @param developerAccountId Unique identifier of the developer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl refreshDeveloperAuthTicketUrl(Integer developerAccountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/authtickets/?developerAccountId={developerAccountId}&responseFields={responseFields}");
		formatter.formatUrl("developerAccountId", developerAccountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for DeleteUserAuthTicket
	 * @param refreshToken Refresh token string associated with the developer account authentication ticket.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteUserAuthTicketUrl(String refreshToken)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/authtickets/?refreshToken={refreshToken}");
		formatter.formatUrl("refreshToken", refreshToken);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

