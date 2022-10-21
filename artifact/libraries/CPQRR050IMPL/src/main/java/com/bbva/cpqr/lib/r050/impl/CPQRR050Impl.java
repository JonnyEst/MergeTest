package com.bbva.cpqr.lib.r050.impl;

import com.bbva.cpqr.dto.datos.datos.DatosPersona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * The CPQRR050Impl class...
 */
public class CPQRR050Impl extends CPQRR050Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CPQRR050Impl.class);

	/**
	 * The execute method...
	 */
	@Override
	public DatosPersona execute() {

		DatosPersona datosPersona = new DatosPersona();
		datosPersona.setName("Cristian");
		datosPersona.setSurname("Sanchez");
		datosPersona.setCedula("123748536");
		datosPersona.setEdad(25);
		datosPersona.setTelefono("3212554562");
		datosPersona.setFechaNacimiento(new Date("13/04/1998"));

		return datosPersona;
	}



}
