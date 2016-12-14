
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class MetaDataProperty {

    @SerializedName("GeocoderResponseMetaData")
    @Expose
    private beans.GeocoderResponseMetaData GeocoderResponseMetaData;

    /**
     * 
     * @return
     *     The GeocoderResponseMetaData
     */
    public beans.GeocoderResponseMetaData getGeocoderResponseMetaData() {
        return GeocoderResponseMetaData;
    }

    /**
     * 
     * @param GeocoderResponseMetaData
     *     The GeocoderResponseMetaData
     */
    public void setGeocoderResponseMetaData(beans.GeocoderResponseMetaData GeocoderResponseMetaData) {
        this.GeocoderResponseMetaData = GeocoderResponseMetaData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(GeocoderResponseMetaData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaDataProperty) == false) {
            return false;
        }
        MetaDataProperty rhs = ((MetaDataProperty) other);
        return new EqualsBuilder().append(GeocoderResponseMetaData, rhs.GeocoderResponseMetaData).isEquals();
    }

}
