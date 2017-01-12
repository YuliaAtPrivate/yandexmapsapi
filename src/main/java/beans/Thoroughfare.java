
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Thoroughfare {

    @SerializedName("ThoroughfareName")
    @Expose
    private String thoroughfareName;
    @SerializedName("Premise")
    @Expose
    private Premise premise;

    public String getThoroughfareName() {
        return thoroughfareName;
    }

    public void setThoroughfareName(String thoroughfareName) {
        this.thoroughfareName = thoroughfareName;
    }

    public Premise getPremise() {
        return premise;
    }

    public void setPremise(Premise premise) {
        this.premise = premise;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(thoroughfareName).append(premise).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thoroughfare) == false) {
            return false;
        }
        Thoroughfare rhs = ((Thoroughfare) other);
        return new EqualsBuilder().append(thoroughfareName, rhs.thoroughfareName).append(premise, rhs.premise).isEquals();
    }

}
