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
import org.kisio.NavitiaSDK.invokers.ApiException;
import java.math.BigDecimal;
import org.kisio.NavitiaSDK.models.Routes;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutesApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // RoutesApi constructor
    @Test
    public void shouldInstantiateRoutesApiGivenValidToken() throws Exception {
        RoutesApi currentApi = new RoutesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateRoutesApiGivenValidToken() throws Exception {
        RoutesApi currentApi = null;

        try {
            currentApi = new RoutesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatRoutesRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageLonLatRoutesRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageLonLatRoutesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
public void CoverageLonLatRoutesIdRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageLonLatRoutesIdRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageLonLatRoutesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("route:JDR:TGV"));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriRoutesRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageLonLatUriRoutesRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageLonLatUriRoutesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriRoutesIdRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageLonLatUriRoutesIdRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageLonLatUriRoutesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("route:JDR:TGV"));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
public void CoverageRegionRoutesRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageRegionRoutesRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageRegionRoutesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
public void CoverageRegionRoutesIdRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageRegionRoutesIdRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageRegionRoutesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("route:JDR:TGV"));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
public void CoverageRegionUriRoutesRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageRegionUriRoutesRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageRegionUriRoutesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
public void CoverageRegionUriRoutesIdRequestBuilder_get_Test() throws Exception {
    RoutesApi.CoverageRegionUriRoutesIdRequestBuilder requestBuilder = new RoutesApi(testToken).newCoverageRegionUriRoutesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("route:JDR:TGV"));

    final Routes[] asyncResult = new Routes[1];
    requestBuilder.get(new ApiCallback<Routes>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Routes result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getRoutes().size() > 0);
    assertTrue(asyncResult[0].getRoutes().get(0) != null);
}
    
        @Test
@Ignore
public void RoutesRequestBuilder_get_Test() {}

    
}