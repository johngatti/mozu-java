/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.returns;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Return Packages subresource to manage physical packages used to ship return replacement items.
 * </summary>
 */
public class PackageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PackageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the package label image supplied by the carrier for a return replacement.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Stream stream = package.getPackageLabel( returnId,  packageId);
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package for which to retrieve the label.
	 * @param returnId Unique identifier of the return associated with the replacement package label to retrieve.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getPackageLabel(String returnId, String packageId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.returns.PackageClient.getPackageLabelClient( returnId,  packageId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a package of return replacement items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.getPackage( returnId,  packageId);
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to retrieve.
	 * @param returnId Unique identifier of the return associated with the replacement package to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(String returnId, String packageId) throws Exception
	{
		return getPackage( returnId,  packageId,  null);
	}

	/**
	 * Retrieves the details of a package of return replacement items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.getPackage( returnId,  packageId,  responseFields);
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the replacement package to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(String returnId, String packageId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.getPackageClient( returnId,  packageId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new physical package of return replacement items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createPackage( pkg,  returnId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return for which to create a replacement package.
	 * @param package Properties of the physical package for a return replacement.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId) throws Exception
	{
		return createPackage( pkg,  returnId,  null);
	}

	/**
	 * Creates a new physical package of return replacement items.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createPackage( pkg,  returnId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return for which to create a replacement package.
	 * @param package Properties of the physical package for a return replacement.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.createPackageClient( pkg,  returnId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a package associated with a return replacement.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.updatePackage( pkg,  returnId,  packageId);
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to update.
	 * @param returnId Unique identifier of the return associated with the replacement package to update.
	 * @param package Properties of the return replacement package to update.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String packageId) throws Exception
	{
		return updatePackage( pkg,  returnId,  packageId,  null);
	}

	/**
	 * Updates one or more properties of a package associated with a return replacement.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.updatePackage( pkg,  returnId,  packageId,  responseFields);
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the replacement package to update.
	 * @param package Properties of the return replacement package to update.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String packageId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.updatePackageClient( pkg,  returnId,  packageId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a package associated with a return replacement.
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	package.deletePackage( returnId,  packageId);
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to delete.
	 * @param returnId Unique identifier of the return associated with the replacement package to delete.
	 * @return 
	 */
	public void deletePackage(String returnId, String packageId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.returns.PackageClient.deletePackageClient( returnId,  packageId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



