
package beans.ws.ocmc.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priorityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="priorityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityType", propOrder = {
    "priorityID",
    "priorityName",
    "priorityDesc"
})
public class PriorityType {

    protected int priorityID;
    protected String priorityName;
    protected String priorityDesc;

    /**
     * Gets the value of the priorityID property.
     * 
     */
    public int getPriorityID() {
        return priorityID;
    }

    /**
     * Sets the value of the priorityID property.
     * 
     */
    public void setPriorityID(int value) {
        this.priorityID = value;
    }

    /**
     * Gets the value of the priorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityName() {
        return priorityName;
    }

    /**
     * Sets the value of the priorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityName(String value) {
        this.priorityName = value;
    }

    /**
     * Gets the value of the priorityDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityDesc() {
        return priorityDesc;
    }

    /**
     * Sets the value of the priorityDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityDesc(String value) {
        this.priorityDesc = value;
    }

}
