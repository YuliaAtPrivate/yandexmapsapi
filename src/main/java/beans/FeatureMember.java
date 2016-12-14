
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FeatureMember {

    @SerializedName("GeoObject")
    @Expose
    private beans.GeoObject GeoObject;

    /**
     * 
     * @return
     *     The GeoObject
     */
    public beans.GeoObject getGeoObject() {
        return GeoObject;
    }

    /**
     * 
     * @param GeoObject
     *     The GeoObject
     */
    public void setGeoObject(beans.GeoObject GeoObject) {
        this.GeoObject = GeoObject;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(GeoObject).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeatureMember) == false) {
            return false;
        }
        FeatureMember rhs = ((FeatureMember) other);
        return new EqualsBuilder().append(GeoObject, rhs.GeoObject).isEquals();
    }

}
