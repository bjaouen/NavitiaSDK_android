/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.38.0
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
import org.kisio.NavitiaSDK.models.Coverages;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoverageApi {
    private ApiClient apiClient;

    public CoverageApi(String token) throws Exception {
        if (token == null || token.trim().isEmpty()) {
          throw new Exception("Navitia token cannot be empty");
        }
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(token);
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCoverage
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoverageCall(Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coverage/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (disableGeojson != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

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
    private com.squareup.okhttp.Call getCoverageValidateBeforeCall(Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCoverageCall(disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return Coverages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected Coverages getCoverage(Boolean disableGeojson) throws ApiException {
        ApiResponse<Coverages> resp = getCoverageWithHttpInfo(disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return ApiResponse&lt;Coverages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Coverages> getCoverageWithHttpInfo(Boolean disableGeojson) throws ApiException {
        com.squareup.okhttp.Call call = getCoverageValidateBeforeCall(disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageAsync(Boolean disableGeojson, final ApiCallback<Coverages> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoverageValidateBeforeCall(disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageAsyncRaw(Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoverageValidateBeforeCall(disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRequestBuilder newCoverageRequestBuilder() {
        return new CoverageRequestBuilder(this);
    }

    public class CoverageRequestBuilder {
        private CoverageApi currentApi;
        private Boolean disableGeojson;

        public CoverageRequestBuilder(CoverageApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<Coverages > callback) throws ApiException {
            return currentApi.getCoverageAsync(this.disableGeojson, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageAsyncRaw(this.disableGeojson, callback);
        }
    }
    /**
     * Build call for getCoverageLonLat
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoverageLonLatCall(BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coverage/{lon};{lat}/"
            .replaceAll("\\{" + "lat" + "\\}", apiClient.escapePathParam(lat.toString()))
            .replaceAll("\\{" + "lon" + "\\}", apiClient.escapePathParam(lon.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (disableGeojson != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

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
    private com.squareup.okhttp.Call getCoverageLonLatValidateBeforeCall(BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoverageLonLat(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoverageLonLat(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoverageLonLatCall(lat, lon, disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return Coverages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected Coverages getCoverageLonLat(BigDecimal lat, BigDecimal lon, Boolean disableGeojson) throws ApiException {
        ApiResponse<Coverages> resp = getCoverageLonLatWithHttpInfo(lat, lon, disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return ApiResponse&lt;Coverages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Coverages> getCoverageLonLatWithHttpInfo(BigDecimal lat, BigDecimal lon, Boolean disableGeojson) throws ApiException {
        com.squareup.okhttp.Call call = getCoverageLonLatValidateBeforeCall(lat, lon, disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageLonLatAsync(BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ApiCallback<Coverages> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoverageLonLatValidateBeforeCall(lat, lon, disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageLonLatAsyncRaw(BigDecimal lat, BigDecimal lon, Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoverageLonLatValidateBeforeCall(lat, lon, disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageLonLatRequestBuilder newCoverageLonLatRequestBuilder() {
        return new CoverageLonLatRequestBuilder(this);
    }

    public class CoverageLonLatRequestBuilder {
        private CoverageApi currentApi;
        private BigDecimal lat;
        private BigDecimal lon;
        private Boolean disableGeojson;

        public CoverageLonLatRequestBuilder(CoverageApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageLonLatRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoverageLonLatRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }
        public CoverageLonLatRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<Coverages > callback) throws ApiException {
            return currentApi.getCoverageLonLatAsync(this.lat, this.lon, this.disableGeojson, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageLonLatAsyncRaw(this.lat, this.lon, this.disableGeojson, callback);
        }
    }
    /**
     * Build call for getCoverageRegion
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoverageRegionCall(String region, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coverage/{region}/"
            .replaceAll("\\{" + "region" + "\\}", apiClient.escapePathParam(region.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (disableGeojson != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_geojson", disableGeojson));

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
    private com.squareup.okhttp.Call getCoverageRegionValidateBeforeCall(String region, Boolean disableGeojson, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCoverageRegion(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoverageRegionCall(region, disableGeojson, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return Coverages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected Coverages getCoverageRegion(String region, Boolean disableGeojson) throws ApiException {
        ApiResponse<Coverages> resp = getCoverageRegionWithHttpInfo(region, disableGeojson);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @return ApiResponse&lt;Coverages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Coverages> getCoverageRegionWithHttpInfo(String region, Boolean disableGeojson) throws ApiException {
        com.squareup.okhttp.Call call = getCoverageRegionValidateBeforeCall(region, disableGeojson, null, null);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionAsync(String region, Boolean disableGeojson, final ApiCallback<Coverages> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoverageRegionValidateBeforeCall(region, disableGeojson, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Coverages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     *  (asynchronously)
     * 
     * @param region  The region you want to query (required)
     * @param disableGeojson hide the coverage geojson to reduce response size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    protected com.squareup.okhttp.Call getCoverageRegionAsyncRaw(String region, Boolean disableGeojson, final ApiCallback<String > callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoverageRegionValidateBeforeCall(region, disableGeojson, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoverageRegionRequestBuilder newCoverageRegionRequestBuilder() {
        return new CoverageRegionRequestBuilder(this);
    }

    public class CoverageRegionRequestBuilder {
        private CoverageApi currentApi;
        private String region;
        private Boolean disableGeojson;

        public CoverageRegionRequestBuilder(CoverageApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoverageRegionRequestBuilder withRegion(String region) {
            this.region = region;
            return this;
        }
        public CoverageRegionRequestBuilder withDisableGeojson(Boolean disableGeojson) {
            this.disableGeojson = disableGeojson;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<Coverages > callback) throws ApiException {
            return currentApi.getCoverageRegionAsync(this.region, this.disableGeojson, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoverageRegionAsyncRaw(this.region, this.disableGeojson, callback);
        }
    }
}
