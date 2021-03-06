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
import org.kisio.NavitiaSDK.invokers.ApiException;
import java.math.BigDecimal;
import org.kisio.NavitiaSDK.models.Places;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlacesApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // PlacesApi constructor
    @Test
    public void shouldInstantiatePlacesApiGivenValidToken() throws Exception {
        PlacesApi currentApi = new PlacesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiatePlacesApiGivenValidToken() throws Exception {
        PlacesApi currentApi = null;

        try {
            currentApi = new PlacesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatPlacesRequestBuilder_get_Test() throws Exception {
    PlacesApi.CoverageLonLatPlacesRequestBuilder requestBuilder = new PlacesApi(testToken).newCoverageLonLatPlacesRequestBuilder();

    // Test case parameters
    requestBuilder.withQ(String.valueOf("gare"));
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final Places[] asyncResult = new Places[1];
    requestBuilder.get(new ApiCallback<Places>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Places result, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
               asyncResult[0] = result;
                asyncResult.notify();
            }
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) { }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) { }
    });

    synchronized (asyncResult) {
        asyncResult.wait();
    }

    assertTrue(asyncResult[0].getPlaces().size() > 0);
    assertTrue(asyncResult[0].getPlaces().get(0) != null);
}
    
        @Test
public void CoverageRegionPlacesRequestBuilder_get_Test() throws Exception {
    PlacesApi.CoverageRegionPlacesRequestBuilder requestBuilder = new PlacesApi(testToken).newCoverageRegionPlacesRequestBuilder();

    // Test case parameters
    requestBuilder.withQ(String.valueOf("gare"));
    requestBuilder.withRegion(String.valueOf("jdr"));

    final Places[] asyncResult = new Places[1];
    requestBuilder.get(new ApiCallback<Places>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Places result, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
               asyncResult[0] = result;
                asyncResult.notify();
            }
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) { }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) { }
    });

    synchronized (asyncResult) {
        asyncResult.wait();
    }

    assertTrue(asyncResult[0].getPlaces().size() > 0);
    assertTrue(asyncResult[0].getPlaces().get(0) != null);
}
    
        @Test
public void PlacesRequestBuilder_get_Test() throws Exception {
    PlacesApi.PlacesRequestBuilder requestBuilder = new PlacesApi(testToken).newPlacesRequestBuilder();

    // Test case parameters
    requestBuilder.withQ(String.valueOf("gare"));

    final Places[] asyncResult = new Places[1];
    requestBuilder.get(new ApiCallback<Places>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Places result, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
               asyncResult[0] = result;
                asyncResult.notify();
            }
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) { }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) { }
    });

    synchronized (asyncResult) {
        asyncResult.wait();
    }

    assertTrue(asyncResult[0].getPlaces().size() > 0);
    assertTrue(asyncResult[0].getPlaces().get(0) != null);
}
    
}
