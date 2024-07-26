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
public class ErrNombreInvalido extends Exception {
    public ErrNombreInvalido(String example) {
        super(
            MessageFormat.format(
                "El nombre ingresado debe tener más de dos caracteres. " +
                "Ingrese un nombre válido e intente nuevamente. EJ: {0}",
                example
            )
        );
    }
}
