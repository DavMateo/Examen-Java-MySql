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
public class ErrEdadInvalida extends Exception {
    public ErrEdadInvalida(String example) {
        super(
            MessageFormat.format(
                "La edad ingresada no corresponde a una edad humana real. " +
                "Verifiquelo e intentelo de nuevo. EJ: {0}",
                example
            )
        );
    }
}
