/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.domain.entity;

// Importando las clases y paquetes necesarios
import java.util.ArrayList;


/**
 *
 * @author camper
 */
public class Persona {
    // Definiendo los atributos necesarios
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private int edad;
    private String email;
    private String genero;
    
    
    // Definiendo los constructores de la clase
    public Persona() {
        // Constructor vacío por compatibilidad
    }
    
    public Persona(ArrayList<Object> lstInfoUser) {
        this.nombre = (String) lstInfoUser.get(0);
        this.apellido = (String) lstInfoUser.get(1);
        this.ciudad = (String) lstInfoUser.get(2);
        this.direccion = (String) lstInfoUser.get(3);
        this.edad = (int) lstInfoUser.get(4);
        this.email = (String) lstInfoUser.get(5);
        this.genero = (String) lstInfoUser.get(6);
    }
    
    
    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    // Definiendo los getter y setter de "apellido"
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    // Definiendo los getter y setter de "ciudad"
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    // Definiendo los getter y setter de "direccion"
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    // Definiendo los getter y setter de "edad"
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    // Definiendo los getter y setter de "email"
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    // Definiendo los getter y setter de "genero"
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
