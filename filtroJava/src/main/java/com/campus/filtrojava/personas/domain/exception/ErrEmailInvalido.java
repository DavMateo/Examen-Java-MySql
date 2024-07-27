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
public class ErrEmailInvalido extends Exception {
    public ErrEmailInvalido(String example) {
        super(
            MessageFormat.format(
                "El correo electrónico ingresado no tiene un formato de email válido. " +
                "Ingrese un email válido e intente nuevamente. EJ: {0}",
                example
            )
        );
    }
}
