/**
 *
 */
public enum Lang {
    ENGLISH("en_US"),
    RUSSIAN("ru_RU"),
    TURKISH("tr_TR")
    ;
    String languageCode;

    private Lang(String languageCode){
        this.languageCode = languageCode;
    }
}
