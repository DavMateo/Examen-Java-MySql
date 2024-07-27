/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.campus.filtrojava;

// Importando las clases y paquetes necesarios
import com.campus.filtrojava.personas.domain.service.PersonaService;
import com.campus.filtrojava.personas.application.useCase.PersonaUseCase;
import com.campus.filtrojava.personas.infrastructure.adapter.in.console.PersonaController;
import com.campus.filtrojava.personas.infrastructure.adapter.out.persistence.AppRepository;
import com.campus.filtrojava.Submenus;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author camper
 */
public class FiltroJava {
    
    public static void main(String args[]) {
        // Definiendo las instancias necesarias
        Scanner sc = new Scanner(System.in);
        
        
        // Definiendo las variables pertinentes
        int opUser = 0;
        
        
        // Mensaje de bienvenida al usuario
        System.out.println("========================================");
        System.out.println("== BIENVENIDO AL SOFTWARE DE PERSONAS ==");
        System.out.println("========================================\n");
        
        
        // Pidiendo al usuario que seleccione una opción del menú
        System.out.println("1. Personas");
        System.out.println("2. Habilidades");
        System.out.println("3. Salir");
        System.out.print("Elija una opción: ");
        opUser = sc.nextInt();
        sc.nextLine();  //Limpiando buffer
        
        
        // Redirigiendo a las opciones pertinentes
        try {
            switch (opUser) {
                case 1:
                    Submenus submenus = new Submenus();
                    submenus.submenu(opUser);
                    break;

                case 2:
                    break;
                
                case 3:
                    System.out.println("GRACIAS POR USAR NUESTRO SOFTWARE!");
                    System.exit(0);

                default:
                    throw new AssertionError();
            }  //Fin condicional switch-case
            
        } catch(AssertionError e) {
            e.getMessage();
            
        } catch(Exception ex) {
            ex.getMessage();
            
        }  //Fin bloque try-catch
    }
}