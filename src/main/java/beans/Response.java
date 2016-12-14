
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Response {

    @SerializedName("GeoObjectCollection")
    @Expose
    private beans.GeoObjectCollection GeoObjectCollection;

    /**
     * 
     * @return
     *     The GeoObjectCollection
     */
    public beans.GeoObjectCollection getGeoObjectCollection() {
        return GeoObjectCollection;
    }

    /**
     * 
     * @param GeoObjectCollection
     *     The GeoObjectCollection
     */
    public void setGeoObjectCollection(beans.GeoObjectCollection GeoObjectCollection) {
        this.GeoObjectCollection = GeoObjectCollection;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(GeoObjectCollection).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(GeoObjectCollection, rhs.GeoObjectCollection).isEquals();
    }

}
