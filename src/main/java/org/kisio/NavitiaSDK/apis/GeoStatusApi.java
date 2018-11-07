/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.64.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.kisio.NavitiaSDK.apis;

import org.kisio.NavitiaSDK.invokers.ApiCallback;
import org.kisio.NavitiaSDK.invokers.ApiClient;
import org.kisio.NavitiaSDK.invokers.ApiException;
import org.kisio.NavitiaSDK.invokers.ApiResponse;
import org.kisio.NavitiaSDK.invokers.Configuration;
import org.kisio.NavitiaSDK.invokers.Pair;
import org.kisio.NavitiaSDK.invokers.ProgressRequestBody;
import org.kisio.NavitiaSDK.invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import org.kisio.NavitiaSDK.models.GeoStatus1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeoStatusApi {
    private ApiClient apiClient;

    public GeoStatusApi(String token) throws Exception {
        if (token == null || token.trim().isEmpty()) {
          throw new Exception("Navitia token cannot be empty");
        }
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(token);
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCoverageLonLatGeoStatus
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoverageLonLatGeoStatusCall(BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coverage/{lon};{lat}/_geo_status"
            .replaceAll("\\{" + "lat" + "\\}", apiClient.escapePathParam(lat.toString()))
            .replaceAll("\\{" + "lon" + "\\}", apiClient.escapePathParam(lon.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            ""
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCoverageLonLatGeoStatusValidateBeforeCall(BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoverageLonLatGeoStatus(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoverageLonLatGeoStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoverageLonLatGeoStatusCall(lat, lon, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return GeoStatus1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected GeoStatus1 getCoverageLonLatGeoStatus(BigDecimal lat, BigDecimal lon) throws ApiException {
        ApiResponse<GeoStatus1> resp = getCoverageLonLatGeoStatusWithHttpInfo(lat, lon);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return ApiResponse&lt;GeoStatus1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<GeoStatus1> getCoverageLonLatGeoStatusWithHttpInfo(BigDecimal lat, BigDecimal lon) throws ApiException {
        com.squareup.okhttp.Call call = getCoverageLonLatGeoStatusValidateBeforeCall(lat, lon, null, null);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageLonLatGeoStatusAsync(BigDecimal lat, BigDecimal lon, final ApiCallback<GeoStatus1> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageLonLatGeoStatusValidateBeforeCall(lat, lon, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageLonLatGeoStatusAsyncRaw(BigDecimal lat, BigDecimal lon, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageLonLatGeoStatusValidateBeforeCall(lat, lon, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageLonLatGeoStatusRequestBuilder newCoverageLonLatGeoStatusRequestBuilder() {
        return new CoverageLonLatGeoStatusRequestBuilder(this);
    }

    public class CoverageLonLatGeoStatusRequestBuilder {
        private GeoStatusApi currentApi;
        private BigDecimal lat;
        private BigDecimal lon;

        public CoverageLonLatGeoStatusRequestBuilder(GeoStatusApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageLonLatGeoStatusRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoverageLonLatGeoStatusRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<GeoStatus1 > callback) throws ApiException {
            return currentApi.getCoverageLonLatGeoStatusAsync(this.lat, this.lon, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageLonLatGeoStatusAsyncRaw(this.lat, this.lon, callback);
        }
    }
    /**
     * Build call for getCoverageRegionGeoStatus
     * @param region  The region you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoverageRegionGeoStatusCall(String region, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coverage/{region}/_geo_status"
            .replaceAll("\\{" + "region" + "\\}", apiClient.escapePathParam(region.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            ""
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCoverageRegionGeoStatusValidateBeforeCall(String region, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCoverageRegionGeoStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoverageRegionGeoStatusCall(region, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @return GeoStatus1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected GeoStatus1 getCoverageRegionGeoStatus(String region) throws ApiException {
        ApiResponse<GeoStatus1> resp = getCoverageRegionGeoStatusWithHttpInfo(region);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @return ApiResponse&lt;GeoStatus1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<GeoStatus1> getCoverageRegionGeoStatusWithHttpInfo(String region) throws ApiException {
        com.squareup.okhttp.Call call = getCoverageRegionGeoStatusValidateBeforeCall(region, null, null);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionGeoStatusAsync(String region, final ApiCallback<GeoStatus1> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageRegionGeoStatusValidateBeforeCall(region, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoStatus1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionGeoStatusAsyncRaw(String region, final ApiCallback<String > callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCoverageRegionGeoStatusValidateBeforeCall(region, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRegionGeoStatusRequestBuilder newCoverageRegionGeoStatusRequestBuilder() {
        return new CoverageRegionGeoStatusRequestBuilder(this);
    }

    public class CoverageRegionGeoStatusRequestBuilder {
        private GeoStatusApi currentApi;
        private String region;

        public CoverageRegionGeoStatusRequestBuilder(GeoStatusApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRegionGeoStatusRequestBuilder withRegion(String region) {
            this.region = region;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<GeoStatus1 > callback) throws ApiException {
            return currentApi.getCoverageRegionGeoStatusAsync(this.region, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageRegionGeoStatusAsyncRaw(this.region, callback);
        }
    }
}
