/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.campus.filtrojava.personas.domain.service;

// Importando las clases y paquetes necesarios
import com.campus.filtrojava.personas.domain.entity.Persona;


/**
 *
 * @author camper
 */
public interface PersonaService {
    void crearPersona(Persona persona);
    Persona findUserById(Long id);
    //void updateUser(User user);
    //void removeUser(Long id);
}
