# NextArrivalsApi

All URIs are relative to *https://api.navitia.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoverageLonLatArrivals**](NextArrivalsApi.md#getCoverageLonLatArrivals) | **GET** /coverage/{lon};{lat}/arrivals | 
[**getCoverageLonLatUriArrivals**](NextArrivalsApi.md#getCoverageLonLatUriArrivals) | **GET** /coverage/{lon};{lat}/{uri}/arrivals | 
[**getCoverageRegionArrivals**](NextArrivalsApi.md#getCoverageRegionArrivals) | **GET** /coverage/{region}/arrivals | 
[**getCoverageRegionUriArrivals**](NextArrivalsApi.md#getCoverageRegionUriArrivals) | **GET** /coverage/{region}/{uri}/arrivals | 


<a name="getCoverageLonLatArrivals"></a>
# **getCoverageLonLatArrivals**
> Arrivals getCoverageLonLatArrivals(lat, lon, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.NextArrivalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NextArrivalsApi apiInstance = new NextArrivalsApi();
BigDecimal lat = new BigDecimal(); // BigDecimal |  The latitude of where the coord you want to query
BigDecimal lon = new BigDecimal(); // BigDecimal |  The longitude of where the coord you want to query
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
    Arrivals result = apiInstance.getCoverageLonLatArrivals(lat, lon, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NextArrivalsApi#getCoverageLonLatArrivals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **BigDecimal**|  The latitude of where the coord you want to query |
 **lon** | **BigDecimal**|  The longitude of where the coord you want to query |
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

[**Arrivals**](Arrivals.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageLonLatUriArrivals"></a>
# **getCoverageLonLatUriArrivals**
> Arrivals getCoverageLonLatUriArrivals(lat, lon, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.NextArrivalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NextArrivalsApi apiInstance = new NextArrivalsApi();
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
    Arrivals result = apiInstance.getCoverageLonLatUriArrivals(lat, lon, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NextArrivalsApi#getCoverageLonLatUriArrivals");
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

[**Arrivals**](Arrivals.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionArrivals"></a>
# **getCoverageRegionArrivals**
> Arrivals getCoverageRegionArrivals(region, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.NextArrivalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NextArrivalsApi apiInstance = new NextArrivalsApi();
String region = "region_example"; // String |  The region you want to query
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
    Arrivals result = apiInstance.getCoverageRegionArrivals(region, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NextArrivalsApi#getCoverageRegionArrivals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **String**|  The region you want to query |
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

[**Arrivals**](Arrivals.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

<a name="getCoverageRegionUriArrivals"></a>
# **getCoverageRegionUriArrivals**
> Arrivals getCoverageRegionUriArrivals(region, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson)



### Example
```java
// Import classes:
//import org.kisio.NavitiaSDK.invokers.ApiClient;
//import org.kisio.NavitiaSDK.invokers.ApiException;
//import org.kisio.NavitiaSDK.invokers.Configuration;
//import org.kisio.NavitiaSDK.invokers.auth.*;
//import org.kisio.NavitiaSDK.apis.NextArrivalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NextArrivalsApi apiInstance = new NextArrivalsApi();
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
    Arrivals result = apiInstance.getCoverageRegionUriArrivals(region, uri, filter, fromDatetime, untilDatetime, duration, depth, count, startPage, maxDateTimes, forbiddenId, forbiddenUris, calendar, distance, showCodes, dataFreshness, itemsPerSchedule, disableGeojson);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NextArrivalsApi#getCoverageRegionUriArrivals");
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

[**Arrivals**](Arrivals.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: application/json

