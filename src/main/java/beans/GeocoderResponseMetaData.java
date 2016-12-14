
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GeocoderResponseMetaData {

    @SerializedName("request")
    @Expose
    private String request;
    @SerializedName("found")
    @Expose
    private String found;
    @SerializedName("results")
    @Expose
    private String results;

    /**
     * 
     * @return
     *     The request
     */
    public String getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The found
     */
    public String getFound() {
        return found;
    }

    /**
     * 
     * @param found
     *     The found
     */
    public void setFound(String found) {
        this.found = found;
    }

    /**
     * 
     * @return
     *     The results
     */
    public String getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(String results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(request).append(found).append(results).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeocoderResponseMetaData) == false) {
            return false;
        }
        GeocoderResponseMetaData rhs = ((GeocoderResponseMetaData) other);
        return new EqualsBuilder().append(request, rhs.request).append(found, rhs.found).append(results, rhs.results).isEquals();
    }

}
