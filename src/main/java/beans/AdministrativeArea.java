
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AdministrativeArea {

    @SerializedName("AdministrativeAreaName")
    @Expose
    private String AdministrativeAreaName;
    @SerializedName("SubAdministrativeArea")
    @Expose
    private beans.SubAdministrativeArea SubAdministrativeArea;

    /**
     * 
     * @return
     *     The AdministrativeAreaName
     */
    public String getAdministrativeAreaName() {
        return AdministrativeAreaName;
    }

    /**
     * 
     * @param AdministrativeAreaName
     *     The AdministrativeAreaName
     */
    public void setAdministrativeAreaName(String AdministrativeAreaName) {
        this.AdministrativeAreaName = AdministrativeAreaName;
    }

    /**
     * 
     * @return
     *     The SubAdministrativeArea
     */
    public beans.SubAdministrativeArea getSubAdministrativeArea() {
        return SubAdministrativeArea;
    }

    /**
     * 
     * @param SubAdministrativeArea
     *     The SubAdministrativeArea
     */
    public void setSubAdministrativeArea(beans.SubAdministrativeArea SubAdministrativeArea) {
        this.SubAdministrativeArea = SubAdministrativeArea;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(AdministrativeAreaName).append(SubAdministrativeArea).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdministrativeArea) == false) {
            return false;
        }
        AdministrativeArea rhs = ((AdministrativeArea) other);
        return new EqualsBuilder().append(AdministrativeAreaName, rhs.AdministrativeAreaName).append(SubAdministrativeArea, rhs.SubAdministrativeArea).isEquals();
    }

}
