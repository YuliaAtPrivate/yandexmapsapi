
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class YandexMapsJSON {

    @SerializedName("geoCoderResponse")
    @Expose
    private GeoCoderResponse geoCoderResponse;

    /**
     * 
     * @return
     *     The geoCoderResponse
     */
    public GeoCoderResponse getGeoCoderResponse() {
        return geoCoderResponse;
    }

    /**
     * 
     * @param geoCoderResponse
     *     The geoCoderResponse
     */
    public void setGeoCoderResponse(GeoCoderResponse geoCoderResponse) {
        this.geoCoderResponse = geoCoderResponse;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geoCoderResponse).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof YandexMapsJSON) == false) {
            return false;
        }
        YandexMapsJSON rhs = ((YandexMapsJSON) other);
        return new EqualsBuilder().append(geoCoderResponse, rhs.geoCoderResponse).isEquals();
    }

}
