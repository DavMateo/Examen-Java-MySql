/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.domain.exception;

// Importando las clases y paquetes necesarios
import java.text.MessageFormat;


/**
 *
 * @author camper
 */
public class ErrCiudadInvalido extends Exception {
    public ErrCiudadInvalido(String example) {
        super(
            MessageFormat.format(
                "La ciudad ingresada debe ser válida. " +
                "Ingrese una ciudad válida e intente nuevamente. EJ: {0}",
                example
            )
        );
    }
}
