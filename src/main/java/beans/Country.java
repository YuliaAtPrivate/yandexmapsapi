
package beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Country {

    @SerializedName("AddressLine")
    @Expose
    private String AddressLine;
    @SerializedName("CountryNameCode")
    @Expose
    private String CountryNameCode;
    @SerializedName("CountryName")
    @Expose
    private String CountryName;
    @SerializedName("AdministrativeArea")
    @Expose
    private beans.AdministrativeArea AdministrativeArea;

    /**
     * 
     * @return
     *     The AddressLine
     */
    public String getAddressLine() {
        return AddressLine;
    }

    /**
     * 
     * @param AddressLine
     *     The AddressLine
     */
    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    /**
     * 
     * @return
     *     The CountryNameCode
     */
    public String getCountryNameCode() {
        return CountryNameCode;
    }

    /**
     * 
     * @param CountryNameCode
     *     The CountryNameCode
     */
    public void setCountryNameCode(String CountryNameCode) {
        this.CountryNameCode = CountryNameCode;
    }

    /**
     * 
     * @return
     *     The CountryName
     */
    public String getCountryName() {
        return CountryName;
    }

    /**
     * 
     * @param CountryName
     *     The CountryName
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     * 
     * @return
     *     The AdministrativeArea
     */
    public beans.AdministrativeArea getAdministrativeArea() {
        return AdministrativeArea;
    }

    /**
     * 
     * @param AdministrativeArea
     *     The AdministrativeArea
     */
    public void setAdministrativeArea(beans.AdministrativeArea AdministrativeArea) {
        this.AdministrativeArea = AdministrativeArea;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(AddressLine).append(CountryNameCode).append(CountryName).append(AdministrativeArea).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Country) == false) {
            return false;
        }
        Country rhs = ((Country) other);
        return new EqualsBuilder().append(AddressLine, rhs.AddressLine).append(CountryNameCode, rhs.CountryNameCode).append(CountryName, rhs.CountryName).append(AdministrativeArea, rhs.AdministrativeArea).isEquals();
    }

}
