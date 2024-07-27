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
public class ErrGeneroInvalido extends Exception {
    public ErrGeneroInvalido(String example) {
        super(
            MessageFormat.format(
                "El género ingresado no está dentro del rango numérico del menú. " +
                "Ingrese una opción válida e intente nuevamente. EJ: {0}",
                example
            )
        );
    }
}
