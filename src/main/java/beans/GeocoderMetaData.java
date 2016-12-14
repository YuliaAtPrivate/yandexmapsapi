
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GeocoderMetaData {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("precision")
    @Expose
    private String precision;
    @SerializedName("AddressDetails")
    @Expose
    private beans.AddressDetails AddressDetails;

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The precision
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * 
     * @param precision
     *     The precision
     */
    public void setPrecision(String precision) {
        this.precision = precision;
    }

    /**
     * 
     * @return
     *     The AddressDetails
     */
    public beans.AddressDetails getAddressDetails() {
        return AddressDetails;
    }

    /**
     * 
     * @param AddressDetails
     *     The AddressDetails
     */
    public void setAddressDetails(beans.AddressDetails AddressDetails) {
        this.AddressDetails = AddressDetails;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kind).append(text).append(precision).append(AddressDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeocoderMetaData) == false) {
            return false;
        }
        GeocoderMetaData rhs = ((GeocoderMetaData) other);
        return new EqualsBuilder().append(kind, rhs.kind).append(text, rhs.text).append(precision, rhs.precision).append(AddressDetails, rhs.AddressDetails).isEquals();
    }

}
