import beans.GeoCoderResponse;
import java.util.logging.*;

import org.junit.Assert;
import org.junit.Test;
import sun.rmi.runtime.Log;

/**
 * Created by YA on 19.12.2016.
 * Sample of using geocoder api
 */
public class GeoCoderParameters {

    @Test
    public void tryCallMapApiSuccess() {
       GeoCoderResponse coderAnswer = GeoCoderApi.getGeoCoderJsonFromResp(GeoCoderApi.with()
               .geocode(GeoPoints.EPAM_SPB02.address)
               .language(Lang.ENGLISH.languageCode)
               .format("json")
               .callApi());

//       String desc= coderAnswer.getGeoObjectCollection().getFeatureMember().get(0).getGeoObject().getDescription();
        Logger log = Logger.getAnonymousLogger();
        log.info("forth try");
       //todo: kill debug   :)

    }
    @Test
    public void tryCallMapApiFail() {
       String resp = GeoCoderApi.with()
               .geocode(GeoPoints.EPAM_SPB02.address)
               .language(Lang.ENGLISH.languageCode)
               .format("json")
               .callApi().asString();

//       String desc= coderAnswer.getGeoObjectCollection().getFeatureMember().get(0).getGeoObject().getDescription();
        Logger log = Logger.getAnonymousLogger();
        log.warning("log warning");
        Assert.assertTrue("IMAGINE ERROR" + resp, false);


    }
}
