
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class BoundedBy {

    @SerializedName("Envelope")
    @Expose
    private beans.Envelope Envelope;

    /**
     * 
     * @return
     *     The Envelope
     */
    public beans.Envelope getEnvelope() {
        return Envelope;
    }

    /**
     * 
     * @param Envelope
     *     The Envelope
     */
    public void setEnvelope(beans.Envelope Envelope) {
        this.Envelope = Envelope;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Envelope).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoundedBy) == false) {
            return false;
        }
        BoundedBy rhs = ((BoundedBy) other);
        return new EqualsBuilder().append(Envelope, rhs.Envelope).isEquals();
    }

}
