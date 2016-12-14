
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AddressDetails {

    @SerializedName("Country")
    @Expose
    private beans.Country Country;

    /**
     * 
     * @return
     *     The Country
     */
    public beans.Country getCountry() {
        return Country;
    }

    /**
     * 
     * @param Country
     *     The Country
     */
    public void setCountry(beans.Country Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Country).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressDetails) == false) {
            return false;
        }
        AddressDetails rhs = ((AddressDetails) other);
        return new EqualsBuilder().append(Country, rhs.Country).isEquals();
    }

}
