# CommercialModesApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageLonLatCommercialModes**](CommercialModesApi.md#getCoverageLonLatCommercialModes) | **GET** /coverage/{lon};{lat}/commercial_modes | 
[**getCoverageLonLatCommercialModesId**](CommercialModesApi.md#getCoverageLonLatCommercialModesId) | **GET** /coverage/{lon};{lat}/commercial_modes/{id} | 
[**getCoverageLonLatUriCommercialModes**](CommercialModesApi.md#getCoverageLonLatUriCommercialModes) | **GET** /coverage/{lon};{lat}/{uri}/commercial_modes | 
[**getCoverageLonLatUriCommercialModesId**](CommercialModesApi.md#getCoverageLonLatUriCommercialModesId) | **GET** /coverage/{lon};{lat}/{uri}/commercial_modes/{id} | 
[**getCoverageRegionCommercialModes**](CommercialModesApi.md#getCoverageRegionCommercialModes) | **GET** /coverage/{region}/commercial_modes | 
[**getCoverageRegionCommercialModesId**](CommercialModesApi.md#getCoverageRegionCommercialModesId) | **GET** /coverage/{region}/commercial_modes/{id} | 
[**getCoverageRegionUriCommercialModes**](CommercialModesApi.md#getCoverageRegionUriCommercialModes) | **GET** /coverage/{region}/{uri}/commercial_modes | 
[**getCoverageRegionUriCommercialModesId**](CommercialModesApi.md#getCoverageRegionUriCommercialModesId) | **GET** /coverage/{region}/{uri}/commercial_modes/{id} | 


<a name="getCoverageLonLatCommercialModes"></a>
# **getCoverageLonLatCommercialModes**
> CommercialModes getCoverageLonLatCommercialModes(lat, lon, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageLonLatCommercialModes(lat, lon, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageLonLatCommercialModes");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatCommercialModesId"></a>
# **getCoverageLonLatCommercialModesId**
> CommercialModes getCoverageLonLatCommercialModesId(lat, lon, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageLonLatCommercialModesId(lat, lon, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageLonLatCommercialModesId");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatUriCommercialModes"></a>
# **getCoverageLonLatUriCommercialModes**
> CommercialModes getCoverageLonLatUriCommercialModes(lat, lon, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageLonLatUriCommercialModes(lat, lon, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageLonLatUriCommercialModes");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatUriCommercialModesId"></a>
# **getCoverageLonLatUriCommercialModesId**
> CommercialModes getCoverageLonLatUriCommercialModesId(lat, lon, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageLonLatUriCommercialModesId(lat, lon, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageLonLatUriCommercialModesId");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionCommercialModes"></a>
# **getCoverageRegionCommercialModes**
> CommercialModes getCoverageRegionCommercialModes(region, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageRegionCommercialModes(region, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageRegionCommercialModes");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionCommercialModesId"></a>
# **getCoverageRegionCommercialModesId**
> CommercialModes getCoverageRegionCommercialModesId(region, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageRegionCommercialModesId(region, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageRegionCommercialModesId");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriCommercialModes"></a>
# **getCoverageRegionUriCommercialModes**
> CommercialModes getCoverageRegionUriCommercialModes(region, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageRegionUriCommercialModes(region, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageRegionUriCommercialModes");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriCommercialModesId"></a>
# **getCoverageRegionUriCommercialModesId**
> CommercialModes getCoverageRegionUriCommercialModesId(region, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.CommercialModesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CommercialModesApi apiInstance = new CommercialModesApi();
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
    CommercialModes result = apiInstance.getCoverageRegionUriCommercialModesId(region, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialModesApi#getCoverageRegionUriCommercialModesId");
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

[**CommercialModes**](CommercialModes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

