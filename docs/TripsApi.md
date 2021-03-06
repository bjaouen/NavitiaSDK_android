# TripsApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageLonLatTrips**](TripsApi.md#getCoverageLonLatTrips) | **GET** /coverage/{lon};{lat}/trips | 
[**getCoverageLonLatTripsId**](TripsApi.md#getCoverageLonLatTripsId) | **GET** /coverage/{lon};{lat}/trips/{id} | 
[**getCoverageLonLatUriTrips**](TripsApi.md#getCoverageLonLatUriTrips) | **GET** /coverage/{lon};{lat}/{uri}/trips | 
[**getCoverageLonLatUriTripsId**](TripsApi.md#getCoverageLonLatUriTripsId) | **GET** /coverage/{lon};{lat}/{uri}/trips/{id} | 
[**getCoverageRegionTrips**](TripsApi.md#getCoverageRegionTrips) | **GET** /coverage/{region}/trips | 
[**getCoverageRegionTripsId**](TripsApi.md#getCoverageRegionTripsId) | **GET** /coverage/{region}/trips/{id} | 
[**getCoverageRegionUriTrips**](TripsApi.md#getCoverageRegionUriTrips) | **GET** /coverage/{region}/{uri}/trips | 
[**getCoverageRegionUriTripsId**](TripsApi.md#getCoverageRegionUriTripsId) | **GET** /coverage/{region}/{uri}/trips/{id} | 


<a name="getCoverageLonLatTrips"></a>
# **getCoverageLonLatTrips**
> Trips getCoverageLonLatTrips(lat, lon, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
BigDecimal lat = new BigDecimal(); // BigDecimal |  The latitude of where the coord you want to query
BigDecimal lon = new BigDecimal(); // BigDecimal |  The longitude of where the coord you want to query
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
String filter = "filter_example"; // String | The filter parameter
try {
    Trips result = apiInstance.getCoverageLonLatTrips(lat, lon, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageLonLatTrips");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **BigDecimal**|  The latitude of where the coord you want to query |
 **lon** | **BigDecimal**|  The longitude of where the coord you want to query |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]
 **filter** | **String**| The filter parameter | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatTripsId"></a>
# **getCoverageLonLatTripsId**
> Trips getCoverageLonLatTripsId(lat, lon, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
BigDecimal lat = new BigDecimal(); // BigDecimal |  The latitude of where the coord you want to query
BigDecimal lon = new BigDecimal(); // BigDecimal |  The longitude of where the coord you want to query
String id = "id_example"; // String | Id of the object you want to query
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    Trips result = apiInstance.getCoverageLonLatTripsId(lat, lon, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageLonLatTripsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **BigDecimal**|  The latitude of where the coord you want to query |
 **lon** | **BigDecimal**|  The longitude of where the coord you want to query |
 **id** | **String**| Id of the object you want to query |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatUriTrips"></a>
# **getCoverageLonLatUriTrips**
> Trips getCoverageLonLatUriTrips(lat, lon, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
BigDecimal lat = new BigDecimal(); // BigDecimal |  The latitude of where the coord you want to query
BigDecimal lon = new BigDecimal(); // BigDecimal |  The longitude of where the coord you want to query
String uri = "uri_example"; // String | First part of the uri
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
String filter = "filter_example"; // String | The filter parameter
try {
    Trips result = apiInstance.getCoverageLonLatUriTrips(lat, lon, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageLonLatUriTrips");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **BigDecimal**|  The latitude of where the coord you want to query |
 **lon** | **BigDecimal**|  The longitude of where the coord you want to query |
 **uri** | **String**| First part of the uri |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]
 **filter** | **String**| The filter parameter | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatUriTripsId"></a>
# **getCoverageLonLatUriTripsId**
> Trips getCoverageLonLatUriTripsId(lat, lon, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
BigDecimal lat = new BigDecimal(); // BigDecimal |  The latitude of where the coord you want to query
BigDecimal lon = new BigDecimal(); // BigDecimal |  The longitude of where the coord you want to query
String uri = "uri_example"; // String | First part of the uri
String id = "id_example"; // String | Id of the object you want to query
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    Trips result = apiInstance.getCoverageLonLatUriTripsId(lat, lon, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageLonLatUriTripsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **BigDecimal**|  The latitude of where the coord you want to query |
 **lon** | **BigDecimal**|  The longitude of where the coord you want to query |
 **uri** | **String**| First part of the uri |
 **id** | **String**| Id of the object you want to query |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionTrips"></a>
# **getCoverageRegionTrips**
> Trips getCoverageRegionTrips(region, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
String region = "region_example"; // String |  The region you want to query
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
String filter = "filter_example"; // String | The filter parameter
try {
    Trips result = apiInstance.getCoverageRegionTrips(region, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageRegionTrips");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]
 **filter** | **String**| The filter parameter | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionTripsId"></a>
# **getCoverageRegionTripsId**
> Trips getCoverageRegionTripsId(region, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
String region = "region_example"; // String |  The region you want to query
String id = "id_example"; // String | Id of the object you want to query
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    Trips result = apiInstance.getCoverageRegionTripsId(region, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageRegionTripsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **id** | **String**| Id of the object you want to query |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriTrips"></a>
# **getCoverageRegionUriTrips**
> Trips getCoverageRegionUriTrips(region, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
String region = "region_example"; // String |  The region you want to query
String uri = "uri_example"; // String | First part of the uri
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
String filter = "filter_example"; // String | The filter parameter
try {
    Trips result = apiInstance.getCoverageRegionUriTrips(region, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageRegionUriTrips");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **uri** | **String**| First part of the uri |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]
 **filter** | **String**| The filter parameter | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriTripsId"></a>
# **getCoverageRegionUriTripsId**
> Trips getCoverageRegionUriTripsId(region, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.TripsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TripsApi apiInstance = new TripsApi();
String region = "region_example"; // String |  The region you want to query
String uri = "uri_example"; // String | First part of the uri
String id = "id_example"; // String | Id of the object you want to query
Integer startPage = 56; // Integer | The page where you want to start
Integer count = 25; // Integer | Number of objects you want on a page
Integer depth = 1; // Integer | The depth of your object
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String externalCode = "externalCode_example"; // String | An external code to query
String headsign = "headsign_example"; // String | filter vehicle journeys on headsign
Boolean showCodes = true; // Boolean | show more identification codes
String odtLevel = "all"; // String | odt level
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
DateTime since = new DateTime(); // DateTime | filters objects not valid before this date
DateTime until = new DateTime(); // DateTime | filters objects not valid after this date
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    Trips result = apiInstance.getCoverageRegionUriTripsId(region, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripsApi#getCoverageRegionUriTripsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **uri** | **String**| First part of the uri |
 **id** | **String**| Id of the object you want to query |
 **startPage** | **Integer**| The page where you want to start | [optional]
 **count** | **Integer**| Number of objects you want on a page | [optional] [default to 25]
 **depth** | **Integer**| The depth of your object | [optional] [default to 1]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **externalCode** | **String**| An external code to query | [optional]
 **headsign** | **String**| filter vehicle journeys on headsign | [optional]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **odtLevel** | **String**| odt level | [optional] [default to all] [enum: scheduled, all, zonal, with_stops]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **since** | **DateTime**| filters objects not valid before this date | [optional]
 **until** | **DateTime**| filters objects not valid after this date | [optional]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**Trips**](Trips.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

