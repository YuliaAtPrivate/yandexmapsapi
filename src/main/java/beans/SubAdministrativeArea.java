
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SubAdministrativeArea {

    @SerializedName("SubAdministrativeAreaName")
    @Expose
    private String subAdministrativeAreaName;
    @SerializedName("Locality")
    @Expose
    private Locality locality;

    public String getSubAdministrativeAreaName() {
        return subAdministrativeAreaName;
    }

    public void setSubAdministrativeAreaName(String subAdministrativeAreaName) {
        this.subAdministrativeAreaName = subAdministrativeAreaName;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subAdministrativeAreaName).append(locality).toHashCode();
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
        return new EqualsBuilder().append(subAdministrativeAreaName, rhs.subAdministrativeAreaName).append(locality, rhs.locality).isEquals();
    }

}
