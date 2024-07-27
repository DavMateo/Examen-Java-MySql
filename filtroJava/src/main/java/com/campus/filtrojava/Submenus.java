/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava;

// Importando las clases y paquetes necesarios
import com.campus.filtrojava.personas.infrastructure.adapter.in.console.PersonaController;
import java.util.Scanner;


/**
 *
 * @author camper
 */
public class Submenus {
    public Submenus() {
        
    }
    
    
    public void submenu(int opUser) {
        // Definiendo las instancias necesarias
        Scanner sc = new Scanner(System.in);


        // Definiendo las variables pertinentes
        int opUserMenu = 0;


        // Mensaje de bienvenida al usuario
        switch (opUser) {
            case 1:
                System.out.println("==========================");
                System.out.println("==== MENU DE PERSONAS ====");
                System.out.println("==========================\n");
                
                // Pidiendo al usuario que seleccione una opción del menú
                System.out.println("1. Registrar una persona");
                System.out.println("2. Actualizar datos de una persona");
                System.out.println("3. Eliminar a una persona");
                System.out.println("4. Regresar");
                System.out.print("Escoja una opción: ");
                opUserMenu = sc.nextInt();
                sc.nextLine();  //Limpiando buffer
                
                try {
                    switch (opUserMenu) {
                        case 1:
                            PersonaController consoleAdapter = new PersonaController();
                            consoleAdapter.start();
                            break;

                        case 2:
                            break;

                        case 3:
                            PersonaController consoleAdapterEliminar = new PersonaController();
                            consoleAdapterEliminar.eliminarUsuario();
                            break;

                        case 4:
                            return;

                        default:
                            throw new AssertionError();
                    }
                    
                } catch(AssertionError e) {
                    e.getMessage();

                } catch(Exception ex) {
                    ex.getMessage();

                }  //Fin bloque try-catch

                
                break;
            
            case 2:
                System.out.println("=============================");
                System.out.println("==== MENU DE HABILIDADES ====");
                System.out.println("=============================\n");
                
                // Pidiendo al usuario que seleccione una opción del menú
                System.out.println("1. Registrar una habilidad");
                System.out.println("2. Asignar una habilidad");
                System.out.println("3. Consultar por habilidades");
                System.out.println("4. Regresar");
                opUserMenu = sc.nextInt();
                sc.nextLine();  //Limpiando buffer
                
                try {
                    switch (opUserMenu) {
                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;

                        case 4:
                            return;

                        default:
                            throw new AssertionError();
                    }
                    
                } catch(AssertionError e) {
                    e.getMessage();

                } catch(Exception ex) {
                    ex.getMessage();

                }  //Fin bloque try-catch
                
                break;
            
            default:
                throw new AssertionError();
        }
    }
}
