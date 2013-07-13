
package com.ocmc.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import beans.ws.ocmc.com.PriorityCollectionType;


/**
 * <p>Java class for GetAllPrioritiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllPrioritiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{com.ocmc.ws.beans}PriorityCollectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllPrioritiesResponse", propOrder = {
    "_return"
})
public class GetAllPrioritiesResponse {

    @XmlElement(name = "return")
    protected PriorityCollectionType _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityCollectionType }
     *     
     */
    public PriorityCollectionType getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityCollectionType }
     *     
     */
    public void setReturn(PriorityCollectionType value) {
        this._return = value;
    }

}
