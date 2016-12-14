
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class MetaDataProperty_ {

    @SerializedName("GeocoderMetaData")
    @Expose
    private beans.GeocoderMetaData GeocoderMetaData;

    /**
     * 
     * @return
     *     The GeocoderMetaData
     */
    public beans.GeocoderMetaData getGeocoderMetaData() {
        return GeocoderMetaData;
    }

    /**
     * 
     * @param GeocoderMetaData
     *     The GeocoderMetaData
     */
    public void setGeocoderMetaData(beans.GeocoderMetaData GeocoderMetaData) {
        this.GeocoderMetaData = GeocoderMetaData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(GeocoderMetaData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaDataProperty_) == false) {
            return false;
        }
        MetaDataProperty_ rhs = ((MetaDataProperty_) other);
        return new EqualsBuilder().append(GeocoderMetaData, rhs.GeocoderMetaData).isEquals();
    }

}
