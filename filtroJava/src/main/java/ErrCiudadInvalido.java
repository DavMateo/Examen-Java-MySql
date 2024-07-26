
import java.text.MessageFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camper
 */
public class ErrCiudadInvalido extends Exception {
    public ErrCiudadInvalido(String example) {
        super(
            MessageFormat.format(
                "La ciudad ingresada debe ser válida. " +
                "Ingrese un apellido válido e intente nuevamente. EJ: {0}",
                example
            )
        );
    }
}
