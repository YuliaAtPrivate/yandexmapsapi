/**
 * Created by YA on 19.12.2016.
 *
 */
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.Map;

public class GeoCoderApi {
    private static final String MAP_API_URI = "https://geocode-maps.yandex.ru/1.x/";
    public static final String PARAM_GEOCODE = "geocode";




//    @Step("Call geocoder api with parameters")
    public Response callWithParams(Map<String, String> params){
        return
                RestAssured.with().params(params)
                .get(MAP_API_URI);
    }

}
