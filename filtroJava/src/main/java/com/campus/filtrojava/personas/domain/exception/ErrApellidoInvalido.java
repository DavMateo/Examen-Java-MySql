/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.domain.exception;

import java.text.MessageFormat;

/**
 *
 * @author camper
 */
public class ErrApellidoInvalido extends Exception {
    public ErrApellidoInvalido(String example) {
        super(
            MessageFormat.format(
                "El apellido ingresado debe tener más de dos caracteres. " +
                "Ingrese un apellido válido e intente nuevamente. EJ: {0}",
                example
            )
        );
    }
}
