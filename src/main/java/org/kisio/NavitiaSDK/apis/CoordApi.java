/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.49.0
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
import org.kisio.NavitiaSDK.models.DictAddresses;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordApi {
    private ApiClient apiClient;

    public CoordApi(String token) throws Exception {
        if (token == null || token.trim().isEmpty()) {
          throw new Exception("Navitia token cannot be empty");
        }
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(token);
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCoordLonLat
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoordLonLatCall(BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coord/{lon};{lat}/"
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
    private com.squareup.okhttp.Call getCoordLonLatValidateBeforeCall(BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoordLonLat(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoordLonLat(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoordLonLatCall(lat, lon, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return DictAddresses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected DictAddresses getCoordLonLat(BigDecimal lat, BigDecimal lon) throws ApiException {
        ApiResponse<DictAddresses> resp = getCoordLonLatWithHttpInfo(lat, lon);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return ApiResponse&lt;DictAddresses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DictAddresses> getCoordLonLatWithHttpInfo(BigDecimal lat, BigDecimal lon) throws ApiException {
        com.squareup.okhttp.Call call = getCoordLonLatValidateBeforeCall(lat, lon, null, null);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected com.squareup.okhttp.Call getCoordLonLatAsync(BigDecimal lat, BigDecimal lon, final ApiCallback<DictAddresses> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoordLonLatValidateBeforeCall(lat, lon, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected com.squareup.okhttp.Call getCoordLonLatAsyncRaw(BigDecimal lat, BigDecimal lon, final ApiCallback<String > callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoordLonLatValidateBeforeCall(lat, lon, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoordLonLatRequestBuilder newCoordLonLatRequestBuilder() {
        return new CoordLonLatRequestBuilder(this);
    }

    public class CoordLonLatRequestBuilder {
        private CoordApi currentApi;
        private BigDecimal lat;
        private BigDecimal lon;

        public CoordLonLatRequestBuilder(CoordApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoordLonLatRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoordLonLatRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<DictAddresses > callback) throws ApiException {
            return currentApi.getCoordLonLatAsync(this.lat, this.lon, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoordLonLatAsyncRaw(this.lat, this.lon, callback);
        }
    }
    /**
     * Build call for getCoordsLonLat
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call getCoordsLonLatCall(BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/coords/{lon};{lat}/"
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
    private com.squareup.okhttp.Call getCoordsLonLatValidateBeforeCall(BigDecimal lat, BigDecimal lon, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getCoordsLonLat(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getCoordsLonLat(Async)");
        }
        

        com.squareup.okhttp.Call call = getCoordsLonLatCall(lat, lon, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return DictAddresses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    protected DictAddresses getCoordsLonLat(BigDecimal lat, BigDecimal lon) throws ApiException {
        ApiResponse<DictAddresses> resp = getCoordsLonLatWithHttpInfo(lat, lon);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param lat  The latitude of where the coord you want to query (required)
     * @param lon  The longitude of where the coord you want to query (required)
     * @return ApiResponse&lt;DictAddresses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<DictAddresses> getCoordsLonLatWithHttpInfo(BigDecimal lat, BigDecimal lon) throws ApiException {
        com.squareup.okhttp.Call call = getCoordsLonLatValidateBeforeCall(lat, lon, null, null);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected com.squareup.okhttp.Call getCoordsLonLatAsync(BigDecimal lat, BigDecimal lon, final ApiCallback<DictAddresses> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoordsLonLatValidateBeforeCall(lat, lon, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DictAddresses>(){}.getType();
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
    protected com.squareup.okhttp.Call getCoordsLonLatAsyncRaw(BigDecimal lat, BigDecimal lon, final ApiCallback<String > callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCoordsLonLatValidateBeforeCall(lat, lon, progressListener, progressRequestListener);
        apiClient.executeAsync(call, String.class, callback);
        return call;
    }

    public CoordsLonLatRequestBuilder newCoordsLonLatRequestBuilder() {
        return new CoordsLonLatRequestBuilder(this);
    }

    public class CoordsLonLatRequestBuilder {
        private CoordApi currentApi;
        private BigDecimal lat;
        private BigDecimal lon;

        public CoordsLonLatRequestBuilder(CoordApi currentApi) {
            this.currentApi = currentApi;
        }

        public CoordsLonLatRequestBuilder withLat(BigDecimal lat) {
            this.lat = lat;
            return this;
        }
        public CoordsLonLatRequestBuilder withLon(BigDecimal lon) {
            this.lon = lon;
            return this;
        }

        public com.squareup.okhttp.Call get(final ApiCallback<DictAddresses > callback) throws ApiException {
            return currentApi.getCoordsLonLatAsync(this.lat, this.lon, callback);
        }

        public com.squareup.okhttp.Call rawGet(final ApiCallback<String > callback) throws ApiException {
            return currentApi.getCoordsLonLatAsyncRaw(this.lat, this.lon, callback);
        }
    }
}