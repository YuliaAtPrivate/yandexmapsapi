import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YA on 19.12.2016.
 * Sample of using geocoder api
 */
public class GeoCoderParameters {
    private Map<String, String> geoCoderParams = new HashMap<>();

    @Test
    public void tryCallMapApi() {
        geoCoderParams.put(GeoCoderApi.PARAM_GEOCODE, GeoPoints.EPAM_SPB02.address);
        Response res = new GeoCoderApi().callWithParams(geoCoderParams);
    }
}
