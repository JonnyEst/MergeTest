package com.bbva.cpqr.dto.datos.datos;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The DatosPersona class...
 */
public class DatosPersona implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	public static final String cabecera= ("nombre"+","+"Apellido"+","+"edad"+","+"telefono"+","+"cedula"+","+"fecha nacimiento");
	/* Attributes section for the DTO */

	/**
	 * The name attribute
	 */
	private String name;

	/**
	 * The surname attribute
	 */
	private String surname;

	private int edad;

	private String telefono;
	private String cedula;
	private Date fechaNacimiento;

	/**
	 * Get the name attribute
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the name attribute
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get the surname attribute
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Set the surname attribute
	 */
	public void setSurname(final String surname) {
		this.surname = surname;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



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
		final DatosPersona rhs = (DatosPersona) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(name, rhs.name)
					.append(surname, rhs.surname)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.name)
			.append(this.surname)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return "DatosPersona{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", edad=" + edad +
				", telefono='" + telefono + '\'' +
				", cedula='" + cedula + '\'' +
				", fechaNacimiento=" + fechaNacimiento +
				'}';
	}

	public String imprimirComas() {
		return name + ',' +
			   surname + ',' +
			   edad + ',' +
			   telefono + ',' +
			   cedula + ',' +
			   fechaNacimiento;
	}
}
