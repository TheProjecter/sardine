//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/27/2009 06:09 PM(mockbuild)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.23 at 06:27:19 PM PST 
//


package com.googlecode.sardine.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{DAV:}lockscope"/>
 *         &lt;element ref="{DAV:}locktype"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lockscope",
    "locktype"
})
@XmlRootElement(name = "lockentry")
public class Lockentry {

    @XmlElement(required = true)
    private Lockscope lockscope;
    @XmlElement(required = true)
    private Locktype locktype;

    /**
     * Gets the value of the lockscope property.
     * 
     * @return
     *     possible object is
     *     {@link Lockscope }
     *     
     */
    public Lockscope getLockscope() {
        return lockscope;
    }

    /**
     * Sets the value of the lockscope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lockscope }
     *     
     */
    public void setLockscope(Lockscope value) {
        this.lockscope = value;
    }

    /**
     * Gets the value of the locktype property.
     * 
     * @return
     *     possible object is
     *     {@link Locktype }
     *     
     */
    public Locktype getLocktype() {
        return locktype;
    }

    /**
     * Sets the value of the locktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locktype }
     *     
     */
    public void setLocktype(Locktype value) {
        this.locktype = value;
    }

}
