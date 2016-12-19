/**
 *
 */
public enum  GeoPoints {
    EPAM_SPB01("5 Voronezhskaya Street 191119 Saint-Petersburg, Russia", "30.315868 59.939095"),
    EPAM_SPB02("nab. Chyornoy rechki, 41к7, St Petersburg, 197342", "30.315868 59.939095"),
    ;

    String address;
    String geoPosition;

    private GeoPoints(String address, String geoPosition){
        this.address = address;
        this.geoPosition = geoPosition;
    }
}
