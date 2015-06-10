/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
import java.util.concurrent.CountDownLatch;

/** <summary>
 * Use the Locations resource to manage each physical location associated with a tenant. Locations enable tenants to associate a physical address with product inventory, provide a store finder for in-store pickup, or both. Locations that support inventory can use both direct ship and in-store pickup fulfillment types.
 * </summary>
 */
public class LocationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.getLocations();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations() throws Exception
	{
		return getLocations( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocations( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public CountDownLatch getLocationsAsync( AsyncCallback<com.mozu.api.contracts.location.LocationCollection> callback) throws Exception
	{
		return getLocationsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.getLocations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocations( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public CountDownLatch getLocationsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.location.LocationCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.getLocation( locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String locationCode) throws Exception
	{
		return getLocation( locationCode,  null);
	}

	/**
	 * Retrieves the details of the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocation( locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch getLocationAsync(String locationCode, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		return getLocationAsync( locationCode,  null, callback);
	}

	/**
	 * Retrieves the details of the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.getLocation( locationCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String locationCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationClient( locationCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocation( locationCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch getLocationAsync(String locationCode, String responseFields, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationClient( locationCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new physical location for the tenant specified in the request header.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.addLocation( location);
	 * </code></pre></p>
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location addLocation(com.mozu.api.contracts.location.Location location) throws Exception
	{
		return addLocation( location,  null);
	}

	/**
	 * Creates a new physical location for the tenant specified in the request header.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.addLocation( location, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch addLocationAsync(com.mozu.api.contracts.location.Location location, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		return addLocationAsync( location,  null, callback);
	}

	/**
	 * Creates a new physical location for the tenant specified in the request header.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.addLocation( location,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location addLocation(com.mozu.api.contracts.location.Location location, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.addLocationClient( location,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new physical location for the tenant specified in the request header.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.addLocation( location,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch addLocationAsync(com.mozu.api.contracts.location.Location location, String responseFields, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.addLocationClient( location,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one or more details of a the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.updateLocation( location,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location updateLocation(com.mozu.api.contracts.location.Location location, String locationCode) throws Exception
	{
		return updateLocation( location,  locationCode,  null);
	}

	/**
	 * Updates one or more details of a the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.updateLocation( location,  locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch updateLocationAsync(com.mozu.api.contracts.location.Location location, String locationCode, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		return updateLocationAsync( location,  locationCode,  null, callback);
	}

	/**
	 * Updates one or more details of a the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.updateLocation( location,  locationCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location updateLocation(com.mozu.api.contracts.location.Location location, String locationCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.updateLocationClient( location,  locationCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more details of a the location specified in the request by location code.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.updateLocation( location,  locationCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch updateLocationAsync(com.mozu.api.contracts.location.Location location, String locationCode, String responseFields, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.updateLocationClient( location,  locationCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the location specified in the request.
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	location.deleteLocation( locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @return 
	 */
	public void deleteLocation(String locationCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.admin.LocationClient.deleteLocationClient( locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}


