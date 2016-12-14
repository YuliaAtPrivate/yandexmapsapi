
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GeoObjectCollection {

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty metaDataProperty;
    @SerializedName("featureMember")
    @Expose
    private List<FeatureMember> featureMember = new ArrayList<FeatureMember>();

    /**
     * 
     * @return
     *     The metaDataProperty
     */
    public MetaDataProperty getMetaDataProperty() {
        return metaDataProperty;
    }

    /**
     * 
     * @param metaDataProperty
     *     The metaDataProperty
     */
    public void setMetaDataProperty(MetaDataProperty metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    /**
     * 
     * @return
     *     The featureMember
     */
    public List<FeatureMember> getFeatureMember() {
        return featureMember;
    }

    /**
     * 
     * @param featureMember
     *     The featureMember
     */
    public void setFeatureMember(List<FeatureMember> featureMember) {
        this.featureMember = featureMember;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metaDataProperty).append(featureMember).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoObjectCollection) == false) {
            return false;
        }
        GeoObjectCollection rhs = ((GeoObjectCollection) other);
        return new EqualsBuilder().append(metaDataProperty, rhs.metaDataProperty).append(featureMember, rhs.featureMember).isEquals();
    }

}
