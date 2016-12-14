
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Premise {

    @SerializedName("PremiseNumber")
    @Expose
    private String PremiseNumber;

    /**
     * 
     * @return
     *     The PremiseNumber
     */
    public String getPremiseNumber() {
        return PremiseNumber;
    }

    /**
     * 
     * @param PremiseNumber
     *     The PremiseNumber
     */
    public void setPremiseNumber(String PremiseNumber) {
        this.PremiseNumber = PremiseNumber;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(PremiseNumber).toHashCode();
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
        return new EqualsBuilder().append(PremiseNumber, rhs.PremiseNumber).isEquals();
    }

}
