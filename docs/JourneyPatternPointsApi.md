# JourneyPatternPointsApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageLonLatJourneyPatternPoints**](JourneyPatternPointsApi.md#getCoverageLonLatJourneyPatternPoints) | **GET** /coverage/{lon};{lat}/journey_pattern_points | 
[**getCoverageLonLatJourneyPatternPointsId**](JourneyPatternPointsApi.md#getCoverageLonLatJourneyPatternPointsId) | **GET** /coverage/{lon};{lat}/journey_pattern_points/{id} | 
[**getCoverageLonLatUriJourneyPatternPoints**](JourneyPatternPointsApi.md#getCoverageLonLatUriJourneyPatternPoints) | **GET** /coverage/{lon};{lat}/{uri}/journey_pattern_points | 
[**getCoverageLonLatUriJourneyPatternPointsId**](JourneyPatternPointsApi.md#getCoverageLonLatUriJourneyPatternPointsId) | **GET** /coverage/{lon};{lat}/{uri}/journey_pattern_points/{id} | 
[**getCoverageRegionJourneyPatternPoints**](JourneyPatternPointsApi.md#getCoverageRegionJourneyPatternPoints) | **GET** /coverage/{region}/journey_pattern_points | 
[**getCoverageRegionJourneyPatternPointsId**](JourneyPatternPointsApi.md#getCoverageRegionJourneyPatternPointsId) | **GET** /coverage/{region}/journey_pattern_points/{id} | 
[**getCoverageRegionUriJourneyPatternPoints**](JourneyPatternPointsApi.md#getCoverageRegionUriJourneyPatternPoints) | **GET** /coverage/{region}/{uri}/journey_pattern_points | 
[**getCoverageRegionUriJourneyPatternPointsId**](JourneyPatternPointsApi.md#getCoverageRegionUriJourneyPatternPointsId) | **GET** /coverage/{region}/{uri}/journey_pattern_points/{id} | 


<a name="getCoverageLonLatJourneyPatternPoints"></a>
# **getCoverageLonLatJourneyPatternPoints**
> JourneyPatternPoints getCoverageLonLatJourneyPatternPoints(lat, lon, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageLonLatJourneyPatternPoints(lat, lon, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageLonLatJourneyPatternPoints");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatJourneyPatternPointsId"></a>
# **getCoverageLonLatJourneyPatternPointsId**
> JourneyPatternPoints getCoverageLonLatJourneyPatternPointsId(lat, lon, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageLonLatJourneyPatternPointsId(lat, lon, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageLonLatJourneyPatternPointsId");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatUriJourneyPatternPoints"></a>
# **getCoverageLonLatUriJourneyPatternPoints**
> JourneyPatternPoints getCoverageLonLatUriJourneyPatternPoints(lat, lon, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageLonLatUriJourneyPatternPoints(lat, lon, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageLonLatUriJourneyPatternPoints");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatUriJourneyPatternPointsId"></a>
# **getCoverageLonLatUriJourneyPatternPointsId**
> JourneyPatternPoints getCoverageLonLatUriJourneyPatternPointsId(lat, lon, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageLonLatUriJourneyPatternPointsId(lat, lon, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageLonLatUriJourneyPatternPointsId");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionJourneyPatternPoints"></a>
# **getCoverageRegionJourneyPatternPoints**
> JourneyPatternPoints getCoverageRegionJourneyPatternPoints(region, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageRegionJourneyPatternPoints(region, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageRegionJourneyPatternPoints");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionJourneyPatternPointsId"></a>
# **getCoverageRegionJourneyPatternPointsId**
> JourneyPatternPoints getCoverageRegionJourneyPatternPointsId(region, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageRegionJourneyPatternPointsId(region, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageRegionJourneyPatternPointsId");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriJourneyPatternPoints"></a>
# **getCoverageRegionUriJourneyPatternPoints**
> JourneyPatternPoints getCoverageRegionUriJourneyPatternPoints(region, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageRegionUriJourneyPatternPoints(region, uri, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageRegionUriJourneyPatternPoints");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriJourneyPatternPointsId"></a>
# **getCoverageRegionUriJourneyPatternPointsId**
> JourneyPatternPoints getCoverageRegionUriJourneyPatternPointsId(region, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.JourneyPatternPointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JourneyPatternPointsApi apiInstance = new JourneyPatternPointsApi();
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
    JourneyPatternPoints result = apiInstance.getCoverageRegionUriJourneyPatternPointsId(region, uri, id, startPage, count, depth, forbiddenId, forbiddenUris, externalCode, headsign, showCodes, odtLevel, distance, since, until, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyPatternPointsApi#getCoverageRegionUriJourneyPatternPointsId");
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

[**JourneyPatternPoints**](JourneyPatternPoints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

