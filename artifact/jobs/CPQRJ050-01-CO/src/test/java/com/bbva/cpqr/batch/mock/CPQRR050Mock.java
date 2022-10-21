package com.bbva.cpqr.batch.mock;
import com.bbva.cpqr.dto.datos.datos.DatosPersona;
import com.bbva.cpqr.lib.r050.CPQRR050;

import java.util.Date;


public class CPQRR050Mock implements CPQRR050{

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
