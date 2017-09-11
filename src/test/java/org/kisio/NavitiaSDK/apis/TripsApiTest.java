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
import org.kisio.NavitiaSDK.models.Trips;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripsApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // TripsApi constructor
    @Test
    public void shouldInstantiateTripsApiGivenValidToken() throws Exception {
        TripsApi currentApi = new TripsApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateTripsApiGivenValidToken() throws Exception {
        TripsApi currentApi = null;

        try {
            currentApi = new TripsApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatTripsRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageLonLatTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatTripsRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
        @Test
public void CoverageLonLatTripsIdRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageLonLatTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatTripsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("JDR:TGV-Nantes-Paris-REG-1A5891"));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriTripsRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageLonLatUriTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatUriTripsRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriTripsIdRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageLonLatUriTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageLonLatUriTripsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("JDR:TGV-Nantes-Paris-REG-1A5891"));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
        @Test
public void CoverageRegionTripsRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageRegionTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionTripsRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
        @Test
public void CoverageRegionTripsIdRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageRegionTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionTripsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("JDR:TGV-Nantes-Paris-REG-1A5891"));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
        @Test
public void CoverageRegionUriTripsRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageRegionUriTripsRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionUriTripsRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
        @Test
public void CoverageRegionUriTripsIdRequestBuilder_get_Test() throws Exception {
    TripsApi.CoverageRegionUriTripsIdRequestBuilder requestBuilder = new TripsApi(testToken).newCoverageRegionUriTripsIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:TGV"));
    requestBuilder.withId(String.valueOf("JDR:TGV-Nantes-Paris-REG-1A5891"));

    final Trips[] asyncResult = new Trips[1];
    requestBuilder.get(new ApiCallback<Trips>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Trips result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getTrips().size() > 0);
    assertTrue(asyncResult[0].getTrips().get(0) != null);
}
    
}
