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
public class ErrIdUserInvalido extends Exception {
    public ErrIdUserInvalido(String example) {
        super(
            MessageFormat.format(
                "El ID ingresado no está dentro del rango numérico permitido. " +
                "Ingrese una opción válida e intente nuevamente. EJ: {0}",
                example
            )
        );
    }
}
