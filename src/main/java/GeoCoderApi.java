/**
 * Created by YA on 19.12.2016.
 */

import beans.GeoCoderResponse;
import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.filter.log.RequestLoggingFilter.logRequestTo;

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

        @Step("step number one")
        public Response callApi() {
            Response response = RestAssured.with()
                    .queryParams(geoCoderApi.params)
                    .filter(logRequestTo(LogStream.logStream()))
                    .log().all()
                    .get(MAP_API_URI);

            log(response.prettyPrint());
            return response;
        }
    }

    @Step("Log")
    @Attachment(type = "application/json")
    private static String log(String text){return text;}

    public static ApiBuilder with() {
        GeoCoderApi gcApi = new GeoCoderApi();
        return new ApiBuilder(gcApi);
    }

    public static GeoCoderResponse getGeoCoderJsonFromResp(Response response){
        return new Gson().fromJson(response.asString(), GeoCoderResponse.class);
    }
}
