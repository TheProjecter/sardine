package com.googlecode.sardine.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 *   &lt;D:owner> 
          &lt;D:href>http://www.example.com/acl/users/gstein&lt;/D:href>        
        &lt;/D:owner> 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder={"principal","grant","deny","inherited"})
@XmlRootElement(name = "ace")
public class Ace {

	
	protected Principal principal;
	protected Grant grant;
	protected Deny deny;
	private Inherited inherited;
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public Grant getGrant() {
		return grant;
	}
	public void setGrant(Grant grant) {
		this.grant = grant;
	}
	public Deny getDeny() {
		return deny;
	}
	public void setDeny(Deny deny) {
		this.deny = deny;
	}
	public Inherited getInherited() {
		return inherited;
	}
	public void setInherited(Inherited inherited) {
		this.inherited = inherited;
	}
	
	
}
