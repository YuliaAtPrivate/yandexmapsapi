/**
 *
 */
public enum Languages {
    ENGLISH("en_US"),
    RUSSIAN("ru_RU"),
    TURKISH("tr_TR")
    ;
    String languageCode;

    private Languages(String languageCode){
        this.languageCode = languageCode;
    }
}
