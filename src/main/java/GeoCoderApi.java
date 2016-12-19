/**
 * Created by YA on 19.12.2016.
 */

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class GeoCoderApi {
    private static final String MAP_API_URI = "https://geocode-maps.yandex.ru/1.x/";
    private static final String PARAM_GEOCODE = "geocode";
    private static final String PARAM_FORMAT = "format";
    private static final String PARAM_RESULTS = "results";
    private static final String PARAM_LANG = "land";


    private GeoCoderApi() {
    }

    private Map<String, String> params = new HashMap<>();

    public static class ApiBuilder {
        GeoCoderApi geoCoderApi;

        private ApiBuilder(GeoCoderApi gcApi) {
            geoCoderApi = gcApi;
        }

        public ApiBuilder geocode(String geocode) {
            geoCoderApi.params.put(PARAM_GEOCODE, geocode);
            return this;
        }

        public ApiBuilder format(String format) {
            geoCoderApi.params.put(PARAM_FORMAT, format);
            return this;
        }

        public ApiBuilder results(String results) {
            geoCoderApi.params.put(PARAM_RESULTS, results);
            return this;
        }

        public ApiBuilder language(String language) {
            geoCoderApi.params.put(PARAM_LANG, language);
            return this;
        }

        public Response callApi() {
            return RestAssured.with()
                    .queryParams(geoCoderApi.params)
                    .log().all()
                    .get(MAP_API_URI);
        }
    }

    public static ApiBuilder with() {
        GeoCoderApi gcApi = new GeoCoderApi();
        return new ApiBuilder(gcApi);
    }
}
