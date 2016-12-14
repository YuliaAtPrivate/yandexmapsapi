
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Thoroughfare {

    @SerializedName("ThoroughfareName")
    @Expose
    private String ThoroughfareName;
    @SerializedName("Premise")
    @Expose
    private beans.Premise Premise;

    /**
     * 
     * @return
     *     The ThoroughfareName
     */
    public String getThoroughfareName() {
        return ThoroughfareName;
    }

    /**
     * 
     * @param ThoroughfareName
     *     The ThoroughfareName
     */
    public void setThoroughfareName(String ThoroughfareName) {
        this.ThoroughfareName = ThoroughfareName;
    }

    /**
     * 
     * @return
     *     The Premise
     */
    public beans.Premise getPremise() {
        return Premise;
    }

    /**
     * 
     * @param Premise
     *     The Premise
     */
    public void setPremise(beans.Premise Premise) {
        this.Premise = Premise;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ThoroughfareName).append(Premise).toHashCode();
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
        return new EqualsBuilder().append(ThoroughfareName, rhs.ThoroughfareName).append(Premise, rhs.Premise).isEquals();
    }

}
