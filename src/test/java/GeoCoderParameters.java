import beans.GeoCoderResponse;
import org.junit.Test;

/**
 * Created by YA on 19.12.2016.
 * Sample of using geocoder api
 */
public class GeoCoderParameters {

    @Test
    public void tryCallMapApi() {
       GeoCoderResponse resp = GeoCoderApi.getGeoCoderJsonFromResp(GeoCoderApi.with()
               .geocode(GeoPoints.EPAM_SPB02.address)
               .language(Lang.ENGLISH.languageCode)
               .format("json")
               .callApi());

       System.out.println(resp.toString()); //todo: kill debug   :)

    }
}
