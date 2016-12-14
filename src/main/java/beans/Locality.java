
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Locality {

    @SerializedName("LocalityName")
    @Expose
    private String LocalityName;
    @SerializedName("Thoroughfare")
    @Expose
    private beans.Thoroughfare Thoroughfare;

    /**
     * 
     * @return
     *     The LocalityName
     */
    public String getLocalityName() {
        return LocalityName;
    }

    /**
     * 
     * @param LocalityName
     *     The LocalityName
     */
    public void setLocalityName(String LocalityName) {
        this.LocalityName = LocalityName;
    }

    /**
     * 
     * @return
     *     The Thoroughfare
     */
    public beans.Thoroughfare getThoroughfare() {
        return Thoroughfare;
    }

    /**
     * 
     * @param Thoroughfare
     *     The Thoroughfare
     */
    public void setThoroughfare(beans.Thoroughfare Thoroughfare) {
        this.Thoroughfare = Thoroughfare;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(LocalityName).append(Thoroughfare).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Locality) == false) {
            return false;
        }
        Locality rhs = ((Locality) other);
        return new EqualsBuilder().append(LocalityName, rhs.LocalityName).append(Thoroughfare, rhs.Thoroughfare).isEquals();
    }

}
