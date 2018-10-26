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
import org.kisio.NavitiaSDK.models.Companies;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompaniesApiTest {
    private final String testToken = "47e2c935-7635-42ec-934c-cc582eaa04b6";

    // CompaniesApi constructor
    @Test
    public void shouldInstantiateCompaniesApiGivenValidToken() throws Exception {
        CompaniesApi currentApi = new CompaniesApi(testToken);

        assertNotNull(currentApi);
    }

    @Test
    public void shouldNotInstantiateCompaniesApiGivenValidToken() throws Exception {
        CompaniesApi currentApi = null;

        try {
            currentApi = new CompaniesApi("");
        } catch (Exception e) {
            assertEquals("Navitia token cannot be empty", e.getMessage());
        }

        assertNull(currentApi);
    }
    
        @Test
public void CoverageLonLatCompaniesRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageLonLatCompaniesRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageLonLatCompaniesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
        @Test
public void CoverageLonLatCompaniesIdRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageLonLatCompaniesIdRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageLonLatCompaniesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withId(String.valueOf("company:JDR:1"));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriCompaniesRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageLonLatUriCompaniesRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageLonLatUriCompaniesRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:Ter"));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
        @Test
public void CoverageLonLatUriCompaniesIdRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageLonLatUriCompaniesIdRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageLonLatUriCompaniesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withLat(BigDecimal.valueOf(48.8459388));
    requestBuilder.withLon(BigDecimal.valueOf(2.3709227));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:Ter"));
    requestBuilder.withId(String.valueOf("company:JDR:1"));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
        @Test
public void CoverageRegionCompaniesRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageRegionCompaniesRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageRegionCompaniesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
        @Test
public void CoverageRegionCompaniesIdRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageRegionCompaniesIdRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageRegionCompaniesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withId(String.valueOf("company:JDR:1"));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
        @Test
public void CoverageRegionUriCompaniesRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageRegionUriCompaniesRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageRegionUriCompaniesRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:Ter"));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
        @Test
public void CoverageRegionUriCompaniesIdRequestBuilder_get_Test() throws Exception {
    CompaniesApi.CoverageRegionUriCompaniesIdRequestBuilder requestBuilder = new CompaniesApi(testToken).newCoverageRegionUriCompaniesIdRequestBuilder();

    // Test case parameters
    requestBuilder.withRegion(String.valueOf("jdr"));
    requestBuilder.withUri(String.valueOf("lines/line:JDR:Ter"));
    requestBuilder.withId(String.valueOf("company:JDR:1"));

    final Companies[] asyncResult = new Companies[1];
    requestBuilder.get(new ApiCallback<Companies>() {
        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            synchronized (asyncResult) {
                asyncResult.notify();
            }
        }

        @Override
        public void onSuccess(Companies result, int statusCode, Map<String, List<String>> responseHeaders) {
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

    assertTrue(asyncResult[0].getCompanies().size() > 0);
    assertTrue(asyncResult[0].getCompanies().get(0) != null);
}
    
}
