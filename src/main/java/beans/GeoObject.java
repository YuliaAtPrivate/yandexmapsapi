
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GeoObject {

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty_ metaDataProperty;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy boundedBy;
    @SerializedName("Point")
    @Expose
    private beans.Point Point;

    /**
     * 
     * @return
     *     The metaDataProperty
     */
    public MetaDataProperty_ getMetaDataProperty() {
        return metaDataProperty;
    }

    /**
     * 
     * @param metaDataProperty
     *     The metaDataProperty
     */
    public void setMetaDataProperty(MetaDataProperty_ metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The boundedBy
     */
    public BoundedBy getBoundedBy() {
        return boundedBy;
    }

    /**
     * 
     * @param boundedBy
     *     The boundedBy
     */
    public void setBoundedBy(BoundedBy boundedBy) {
        this.boundedBy = boundedBy;
    }

    /**
     * 
     * @return
     *     The Point
     */
    public beans.Point getPoint() {
        return Point;
    }

    /**
     * 
     * @param Point
     *     The Point
     */
    public void setPoint(beans.Point Point) {
        this.Point = Point;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metaDataProperty).append(description).append(name).append(boundedBy).append(Point).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoObject) == false) {
            return false;
        }
        GeoObject rhs = ((GeoObject) other);
        return new EqualsBuilder().append(metaDataProperty, rhs.metaDataProperty).append(description, rhs.description).append(name, rhs.name).append(boundedBy, rhs.boundedBy).append(Point, rhs.Point).isEquals();
    }

}
