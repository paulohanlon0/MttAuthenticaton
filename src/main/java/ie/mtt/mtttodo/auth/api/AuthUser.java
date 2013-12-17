package ie.mtt.mtttodo.auth.api;

import java.io.Serializable;

public class AuthUser implements Serializable{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String surname;
	private int internalId;
	
	public AuthUser(int internalId, String firstName, String surname) {
		this.internalId = internalId;
		this.firstName = firstName;
		this.surname = surname;
	}
	
	public int getInternalId() {
		return this.internalId;
	}
	
	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
