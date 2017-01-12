
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Premise {

    @SerializedName("PremiseNumber")
    @Expose
    private String premiseNumber;

    public String getPremiseNumber() {
        return premiseNumber;
    }

    public void setPremiseNumber(String premiseNumber) {
        this.premiseNumber = premiseNumber;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(premiseNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Premise) == false) {
            return false;
        }
        Premise rhs = ((Premise) other);
        return new EqualsBuilder().append(premiseNumber, rhs.premiseNumber).isEquals();
    }

}
