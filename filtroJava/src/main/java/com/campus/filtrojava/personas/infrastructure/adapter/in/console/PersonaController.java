/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.infrastructure.adapter.in.console;

// Importando las clases y paquetes necesarios
import com.campus.filtrojava.personas.domain.exception.ErrNombreInvalido;
import com.campus.filtrojava.personas.domain.exception.ErrApellidoInvalido;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author camper
 */
public class PersonaController {
    // Definiendo los atributos necesarios
    private ArrayList<Object> lstInfoPersona = new ArrayList<>();
    
    
    // Definiendo los constructores de la clase
    public PersonaController() {
        // Vacío por razones de compatibilidad
    }
    
    public ArrayList<Object> PersonaController(
        String nombre, String apellido, String ciudad,
        String direccion, int edad, String email, String genero
    ) {
        this.lstInfoPersona.add(nombre);
        this.lstInfoPersona.add(apellido);
        this.lstInfoPersona.add(ciudad);
        this.lstInfoPersona.add(direccion);
        this.lstInfoPersona.add(edad);
        this.lstInfoPersona.add(email);
        this.lstInfoPersona.add(genero);
        
        return this.lstInfoPersona;
    }
    
    
    // Definiendo los getter y setter de "lstInfoPersona"
    public ArrayList<Object> getLstInfoPersona() {
        return lstInfoPersona;
    }
    public void setLstInfoPersona(String strInfo) {
        this.lstInfoPersona.add(strInfo);
    }
    public void setLstInfoPersona(int edad) {
        this.lstInfoPersona.add(edad);
    }
    
    
    
    // DECLARANDO LAS FUNCIONES NECESARIAS DE LA ENTIDAD
    public ArrayList<Object> obtenerInfoUser() {
        // Declarando las instancias
        Scanner sc = new Scanner(System.in);
        
        
        // Definiendo las variables necesarias
        String nombre = "";
        String apellido = "";
        String ciudad = "";
        String direccion = "";
        int edad = 0;
        String email = "";
        String genero = "";
        
        try {
            // Ingresando el nombre
            while(true) {
                System.out.print("Ingrese el nombre: ");
                nombre = sc.nextLine();
                
                if(nombre.length() < 2) {
                    throw new ErrNombreInvalido("David");
                    
                } else {
                    break;
                    
                }  //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando el apellido
            while(true) {
                System.out.print("Ingrese el apellido: ");
                apellido = sc.nextLine();
                
                if(apellido.length() < 2) {
                    throw new ErrApellidoInvalido("Carreño");
                    
                }   //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando la ciudad
            while(true) {
                System.out.print("Ingrese el nombre de la ciudad: ");
                ciudad = sc.nextLine();
                
                if(apellido.length() < 2) {
                    throw new ErrCiudadInvalido("Floridablanca");
                    
                }   //Fin condicional if
            }  //Fin bucle while
            
            
        } catch(ErrNombreInvalido e) {
            e.getMessage();
            
        }  catch(ErrApellidoInvalido e) {
            e.getMessage();
            
        } catch(ErrCiudadInvalido e) {
            e.getMessage();
            
        }
        
    }  //Fin función "obtenerInfoUser"
}  //Fin clase "PersonaController"


//Fin bloque principal try-catch