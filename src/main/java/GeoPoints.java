/**
 *
 */
public enum  GeoPoints {
    EPAM_SPB01("", ""),
    EPAM_SPB02("", ""),
    EPAM_SPB03("", "");

    String address;
    String geoPosition;

    private GeoPoints(String address, String geoPosition){
        this.address = address;
        this.geoPosition = geoPosition;
    }
}
