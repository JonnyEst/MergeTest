package com.bbva.cpqr.dto.datos;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The GrantingTicket class...
 */
public class GrantingTicket implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	/**
	 * The authentication attribute
	 */
	private Authentication authentication;

	/**
	 * The backendUserRequest attribute
	 */
	private BackendUserRequest backendUserRequest;



	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final GrantingTicket rhs = (GrantingTicket) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(authentication, rhs.authentication)
					.append(backendUserRequest, rhs.backendUserRequest)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.authentication)
			.append(this.backendUserRequest)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return "GrantingTicket{" +
				"authentication=" + authentication +
				", backendUserRequest=" + backendUserRequest +
				'}';
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}

	public BackendUserRequest getBackendUserRequest() {
		return backendUserRequest;
	}

	public void setBackendUserRequest(BackendUserRequest backendUserRequest) {
		this.backendUserRequest = backendUserRequest;
	}
}
