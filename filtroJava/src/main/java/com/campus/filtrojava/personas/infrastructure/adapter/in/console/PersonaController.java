/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.infrastructure.adapter.in.console;

// Importando las clases y paquetes necesarios
import com.campus.filtrojava.personas.domain.exception.ErrCiudadInvalido;
import com.campus.filtrojava.personas.domain.exception.ErrNombreInvalido;
import com.campus.filtrojava.personas.domain.exception.ErrApellidoInvalido;
import com.campus.filtrojava.personas.domain.exception.ErrDireccionInvalida;
import com.campus.filtrojava.personas.domain.exception.ErrEdadInvalida;
import com.campus.filtrojava.personas.domain.exception.ErrEmailInvalido;
import com.campus.filtrojava.personas.domain.exception.ErrGeneroInvalido;
import com.campus.filtrojava.personas.domain.exception.ErrIdUserInvalido;
import com.campus.filtrojava.personas.domain.entity.Persona;
import com.campus.filtrojava.personas.infrastructure.adapter.out.persistence.AppRepository;
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
    public ArrayList<Object> start() {
        // Declarando las instancias
        int genOp = 0;
        Scanner sc = new Scanner(System.in);
        
        
        // Definiendo las variables necesarias
        String nombre = "";
        String apellido = "";
        String ciudad = "";
        String direccion = "";
        int edad = 0;
        String email = "";
        String genero = "";
        ArrayList<Object> lstInfoPersonaSignUp = new ArrayList<>();
        
        
        // Realizando la captura de datos por el usuario
        try {
            // Ingresando el nombre
            while(true) {
                System.out.print("Ingrese el nombre: ");
                nombre = sc.nextLine();
                
                if(nombre.length() < 2) {
                    throw new ErrNombreInvalido("David");
                    
                } else {
                    lstInfoPersonaSignUp.add(nombre);
                    break;
                    
                }  //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando el apellido
            while(true) {
                System.out.print("Ingrese el apellido: ");
                apellido = sc.nextLine();
                
                if(apellido.length() < 2) {
                    throw new ErrApellidoInvalido("Carreño");
                    
                } else {
                    lstInfoPersonaSignUp.add(apellido);
                    break;
                    
                }  //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando la ciudad
            while(true) {
                System.out.print("Ingrese el nombre de la ciudad: ");
                ciudad = sc.nextLine();
                
                if(ciudad.length() < 2) {
                    throw new ErrCiudadInvalido("Floridablanca");
                    
                } else {
                    lstInfoPersonaSignUp.add(ciudad);
                    break;
                    
                }  //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando la dirección
            while(true) {
                System.out.print("Ingrese su dirección de residencia: ");
                direccion = sc.nextLine();
                
                if(direccion.length() < 10) {
                    throw new ErrDireccionInvalida("Calle 41b #12-41a");
                    
                } else {
                    lstInfoPersonaSignUp.add(direccion);
                    break;
                    
                }  //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando la edad
            while(true) {
                System.out.print("Ingrese su edad: ");
                edad = sc.nextInt();
                sc.nextLine();  //Limpiando buffer
                
                if(edad < 0 || edad > 120) {
                    throw new ErrEdadInvalida("18");
                    
                } else {
                    lstInfoPersonaSignUp.add(edad);
                    break;
                    
                }  //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando el email
            while(true) {
                System.out.print("Ingrese su correo electrónico: ");
                email = sc.nextLine();
                
                if(!email.contains("@") && email.length() < 6) {
                    throw new ErrEmailInvalido("davmateo@gmail.com");
                    
                } else {
                    lstInfoPersonaSignUp.add(email);
                    break;
                    
                }  //Fin condicional if
            }  //Fin bucle while
            
            
            // Ingresando el género
            while(true) {
                // Checkear si pasó por el default o no
                int state = 0;
                
                System.out.println(
                    "\n\nEscoga un género: \n" +
                    "1. Masculino\n" +
                    "2. Femenino\n" +
                    "3. No binario\n" +
                    "4. Prefiero no decirlo\n" +
                    "5. Otro\n\n"
                );
                System.out.print("Ingrese el número según el género con el que se identifica: ");
                int generoSelect = sc.nextInt();
                genOp = generoSelect;
                sc.nextLine();
                
                
                switch(generoSelect) {
                        case 1:
                            lstInfoPersonaSignUp.add("Masculino");
                            break;
                        
                        case 2:
                            lstInfoPersonaSignUp.add("Femenino");
                            break;
                        
                        case 3:
                            lstInfoPersonaSignUp.add("No binario");
                            break;
                        
                        case 4:
                            lstInfoPersonaSignUp.add("Prefiero no decirlo");
                            break;
                        
                        case 5:
                            lstInfoPersonaSignUp.add("Otro");
                            break;
                            
                        default:
                            state = 1;
                            throw new ErrGeneroInvalido("Opción numérica");
                            
                }  //Fin estructura de control switch-case
                
                if(state == 0) {
                    break;
                } else {
                    continue;
                }
                
            }  //Fin bucle while
            
        } catch(ErrNombreInvalido | ErrApellidoInvalido | ErrCiudadInvalido | ErrDireccionInvalida | ErrEdadInvalida | ErrEmailInvalido | ErrGeneroInvalido e) {
            // Excepciones personalizadas
            e.getMessage();
            
        } catch(Exception e) {
            // Excepciones del sistema
            e.getMessage();
            
        }  //Fin bloque try-catch principal
        
        
        // Construyendo la clase de Persona
        Persona persona = new Persona(lstInfoPersonaSignUp);
        AppRepository appRepository = new AppRepository();
        appRepository.crearPersona(persona, genOp);
        
        return lstInfoPersonaSignUp;
    }  //Fin función "obtenerInfoUser"
    
    
    public void eliminarUsuario() {
        // Declarando las instancias necesarias
        int idSelect = 0;
        Scanner sc = new Scanner(System.in);
        
        try {
            while(true) {
                System.out.print("\nIngrese el id del usuario a eliminar: ");
                idSelect = sc.nextInt();
                
                if(idSelect < 1) {
                    throw new ErrIdUserInvalido("10");
                } else {
                    break;
                }
            }
            
        } catch(ErrIdUserInvalido e) {
            e.getMessage();
            
        } catch(Exception ex) {
            ex.getMessage();
        }  //Fin bloque principal try-catch
        
        
        AppRepository appRepository = new AppRepository();
        appRepository.eliminarPersona(idSelect);
        
    }
    
}  //Fin clase "PersonaController"


//Fin bloque principal try-catch