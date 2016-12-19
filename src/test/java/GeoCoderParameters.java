import com.jayway.restassured.response.Response;
import org.junit.Test;

/**
 * Created by YA on 19.12.2016.
 * Sample of using geocoder api
 */
public class GeoCoderParameters {

    @Test
    public void tryCallMapApi() {
       Response res = GeoCoderApi.with()
               .geocode(GeoPoints.EPAM_SPB02.address)
               .language(Languages.ENGLISH.languageCode)
               .callApi();
    }
}
