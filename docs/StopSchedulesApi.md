# StopSchedulesApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageLonLatUriStopSchedules**](StopSchedulesApi.md#getCoverageLonLatUriStopSchedules) | **GET** /coverage/{lon};{lat}/{uri}/stop_schedules | 
[**getCoverageRegionUriStopSchedules**](StopSchedulesApi.md#getCoverageRegionUriStopSchedules) | **GET** /coverage/{region}/{uri}/stop_schedules | 
[**getStopSchedules**](StopSchedulesApi.md#getStopSchedules) | **GET** /stop_schedules | 


<a name="getCoverageLonLatUriStopSchedules"></a>
# **getCoverageLonLatUriStopSchedules**
> StopSchedules getCoverageLonLatUriStopSchedules(lat, lon, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.StopSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StopSchedulesApi apiInstance = new StopSchedulesApi();
BigDecimal lat = new BigDecimal(); // BigDecimal |  The latitude of where the coord you want to query
BigDecimal lon = new BigDecimal(); // BigDecimal |  The longitude of where the coord you want to query
String uri = "uri_example"; // String | First part of the uri
String filter = "filter_example"; // String | 
DateTime fromDatetime = new DateTime(); // DateTime | The datetime from which you want the schedules
DateTime untilDatetime = new DateTime(); // DateTime | The datetime until which you want the schedules
Integer duration = 86400; // Integer | Maximum duration between datetime and the retrieved stop time
Integer depth = 2; // Integer | 
Integer count = 10; // Integer | Number of schedules per page
Integer startPage = 56; // Integer | The current page
Integer maxDateTimes = 56; // Integer | DEPRECATED, replaced by `items_per_schedule`
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String calendar = "calendar_example"; // String | Id of the calendar
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
Boolean showCodes = true; // Boolean | show more identification codes
String dataFreshness = "dataFreshness_example"; // String | freshness of the data. base_schedule is the long term planned schedule. adapted_schedule is for planned ahead disruptions (strikes, maintenances, ...). realtime is to have the freshest possible data
Integer itemsPerSchedule = 10000; // Integer | maximum number of date_times per schedule
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    StopSchedules result = apiInstance.getCoverageLonLatUriStopSchedules(lat, lon, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StopSchedulesApi#getCoverageLonLatUriStopSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **BigDecimal**|  The latitude of where the coord you want to query |
 **lon** | **BigDecimal**|  The longitude of where the coord you want to query |
 **uri** | **String**| First part of the uri |
 **filter** | **String**|  | [optional]
 **fromDatetime** | **DateTime**| The datetime from which you want the schedules | [optional]
 **untilDatetime** | **DateTime**| The datetime until which you want the schedules | [optional]
 **duration** | **Integer**| Maximum duration between datetime and the retrieved stop time | [optional] [default to 86400]
 **depth** | **Integer**|  | [optional] [default to 2]
 **count** | **Integer**| Number of schedules per page | [optional] [default to 10]
 **startPage** | **Integer**| The current page | [optional]
 **maxDateTimes** | **Integer**| DEPRECATED, replaced by &#x60;items_per_schedule&#x60; | [optional]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **calendar** | **String**| Id of the calendar | [optional]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **dataFreshness** | **String**| freshness of the data. base_schedule is the long term planned schedule. adapted_schedule is for planned ahead disruptions (strikes, maintenances, ...). realtime is to have the freshest possible data | [optional] [enum: base_schedule, adapted_schedule, realtime]
 **itemsPerSchedule** | **Integer**| maximum number of date_times per schedule | [optional] [default to 10000]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**StopSchedules**](StopSchedules.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriStopSchedules"></a>
# **getCoverageRegionUriStopSchedules**
> StopSchedules getCoverageRegionUriStopSchedules(region, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.StopSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StopSchedulesApi apiInstance = new StopSchedulesApi();
String region = "region_example"; // String |  The region you want to query
String uri = "uri_example"; // String | First part of the uri
String filter = "filter_example"; // String | 
DateTime fromDatetime = new DateTime(); // DateTime | The datetime from which you want the schedules
DateTime untilDatetime = new DateTime(); // DateTime | The datetime until which you want the schedules
Integer duration = 86400; // Integer | Maximum duration between datetime and the retrieved stop time
Integer depth = 2; // Integer | 
Integer count = 10; // Integer | Number of schedules per page
Integer startPage = 56; // Integer | The current page
Integer maxDateTimes = 56; // Integer | DEPRECATED, replaced by `items_per_schedule`
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String calendar = "calendar_example"; // String | Id of the calendar
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
Boolean showCodes = true; // Boolean | show more identification codes
String dataFreshness = "dataFreshness_example"; // String | freshness of the data. base_schedule is the long term planned schedule. adapted_schedule is for planned ahead disruptions (strikes, maintenances, ...). realtime is to have the freshest possible data
Integer itemsPerSchedule = 10000; // Integer | maximum number of date_times per schedule
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    StopSchedules result = apiInstance.getCoverageRegionUriStopSchedules(region, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StopSchedulesApi#getCoverageRegionUriStopSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
 **uri** | **String**| First part of the uri |
 **filter** | **String**|  | [optional]
 **fromDatetime** | **DateTime**| The datetime from which you want the schedules | [optional]
 **untilDatetime** | **DateTime**| The datetime until which you want the schedules | [optional]
 **duration** | **Integer**| Maximum duration between datetime and the retrieved stop time | [optional] [default to 86400]
 **depth** | **Integer**|  | [optional] [default to 2]
 **count** | **Integer**| Number of schedules per page | [optional] [default to 10]
 **startPage** | **Integer**| The current page | [optional]
 **maxDateTimes** | **Integer**| DEPRECATED, replaced by &#x60;items_per_schedule&#x60; | [optional]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **calendar** | **String**| Id of the calendar | [optional]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **dataFreshness** | **String**| freshness of the data. base_schedule is the long term planned schedule. adapted_schedule is for planned ahead disruptions (strikes, maintenances, ...). realtime is to have the freshest possible data | [optional] [enum: base_schedule, adapted_schedule, realtime]
 **itemsPerSchedule** | **Integer**| maximum number of date_times per schedule | [optional] [default to 10000]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**StopSchedules**](StopSchedules.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getStopSchedules"></a>
# **getStopSchedules**
> StopSchedules getStopSchedules(filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.StopSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StopSchedulesApi apiInstance = new StopSchedulesApi();
String filter = "filter_example"; // String | 
DateTime fromDatetime = new DateTime(); // DateTime | The datetime from which you want the schedules
DateTime untilDatetime = new DateTime(); // DateTime | The datetime until which you want the schedules
Integer duration = 86400; // Integer | Maximum duration between datetime and the retrieved stop time
Integer depth = 2; // Integer | 
Integer count = 10; // Integer | Number of schedules per page
Integer startPage = 56; // Integer | The current page
Integer maxDateTimes = 56; // Integer | DEPRECATED, replaced by `items_per_schedule`
List<String> forbiddenId = Arrays.asList("forbiddenId_example"); // List<String> | DEPRECATED, replaced by `forbidden_uris[]`
List<String> forbiddenUris = Arrays.asList("forbiddenUris_example"); // List<String> | forbidden uris
String calendar = "calendar_example"; // String | Id of the calendar
Integer distance = 200; // Integer | Distance range of the query. Used only if a coord is in the query
Boolean showCodes = true; // Boolean | show more identification codes
String dataFreshness = "dataFreshness_example"; // String | freshness of the data. base_schedule is the long term planned schedule. adapted_schedule is for planned ahead disruptions (strikes, maintenances, ...). realtime is to have the freshest possible data
Integer itemsPerSchedule = 10000; // Integer | maximum number of date_times per schedule
Boolean disableGeojson = true; // Boolean | remove geojson from the response
try {
    StopSchedules result = apiInstance.getStopSchedules(filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StopSchedulesApi#getStopSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **fromDatetime** | **DateTime**| The datetime from which you want the schedules | [optional]
 **untilDatetime** | **DateTime**| The datetime until which you want the schedules | [optional]
 **duration** | **Integer**| Maximum duration between datetime and the retrieved stop time | [optional] [default to 86400]
 **depth** | **Integer**|  | [optional] [default to 2]
 **count** | **Integer**| Number of schedules per page | [optional] [default to 10]
 **startPage** | **Integer**| The current page | [optional]
 **maxDateTimes** | **Integer**| DEPRECATED, replaced by &#x60;items_per_schedule&#x60; | [optional]
 **forbiddenId** | [**List&lt;String&gt;**](String.md)| DEPRECATED, replaced by &#x60;forbidden_uris[]&#x60; | [optional]
 **forbiddenUris** | [**List&lt;String&gt;**](String.md)| forbidden uris | [optional]
 **calendar** | **String**| Id of the calendar | [optional]
 **distance** | **Integer**| Distance range of the query. Used only if a coord is in the query | [optional] [default to 200]
 **showCodes** | **Boolean**| show more identification codes | [optional]
 **dataFreshness** | **String**| freshness of the data. base_schedule is the long term planned schedule. adapted_schedule is for planned ahead disruptions (strikes, maintenances, ...). realtime is to have the freshest possible data | [optional] [enum: base_schedule, adapted_schedule, realtime]
 **itemsPerSchedule** | **Integer**| maximum number of date_times per schedule | [optional] [default to 10000]
 **disableGeojson** | **Boolean**| remove geojson from the response | [optional]

### Return type

[**StopSchedules**](StopSchedules.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

