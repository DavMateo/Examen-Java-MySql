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
public class ErrDireccionInvalida extends Exception {
    public ErrDireccionInvalida(String example) {
        super(
            MessageFormat.format(
                "La dirección ingresada no corresponde a un formato válido. " +
                "Verifique la dirección e intentelo de nuevo. EJ: {0}",
                example
            )
        );
    }
}
