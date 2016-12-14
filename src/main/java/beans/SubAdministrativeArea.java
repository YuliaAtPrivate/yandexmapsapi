
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SubAdministrativeArea {

    @SerializedName("SubAdministrativeAreaName")
    @Expose
    private String SubAdministrativeAreaName;
    @SerializedName("Locality")
    @Expose
    private beans.Locality Locality;

    /**
     * 
     * @return
     *     The SubAdministrativeAreaName
     */
    public String getSubAdministrativeAreaName() {
        return SubAdministrativeAreaName;
    }

    /**
     * 
     * @param SubAdministrativeAreaName
     *     The SubAdministrativeAreaName
     */
    public void setSubAdministrativeAreaName(String SubAdministrativeAreaName) {
        this.SubAdministrativeAreaName = SubAdministrativeAreaName;
    }

    /**
     * 
     * @return
     *     The Locality
     */
    public beans.Locality getLocality() {
        return Locality;
    }

    /**
     * 
     * @param Locality
     *     The Locality
     */
    public void setLocality(beans.Locality Locality) {
        this.Locality = Locality;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(SubAdministrativeAreaName).append(Locality).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubAdministrativeArea) == false) {
            return false;
        }
        SubAdministrativeArea rhs = ((SubAdministrativeArea) other);
        return new EqualsBuilder().append(SubAdministrativeAreaName, rhs.SubAdministrativeAreaName).append(Locality, rhs.Locality).isEquals();
    }

}
