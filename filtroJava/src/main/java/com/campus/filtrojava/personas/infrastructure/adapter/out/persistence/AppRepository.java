/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.infrastructure.adapter.out.persistence;

// Importando las clases y paquetes necesarios
import com.campus.filtrojava.personas.infrastructure.adapter.out.persistence.BuscarCiudad;
import com.campus.filtrojava.personas.domain.entity.Persona;
import com.campus.filtrojava.personas.domain.service.PersonaService;
import com.campus.filtrojava.personas.infrastructure.config.DatabaseConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author camper
 */
public class AppRepository {
    // Declarando los constructores de la clase
    public AppRepository() {
        
    }
    
    
    public void crearPersona(Persona persona, int opGen) {
        BuscarCiudad buscarCiudad = new BuscarCiudad();
        String sql = "INSERT INTO persons(name, lastname, idcity, address, age, email, idgender) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        
        try (Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, persona.getNombre());
            statement.setString(2, persona.getApellido());
            statement.setInt(3, buscarCiudad.matchCiudadDB(persona.getCiudad()));
            statement.setString(4, persona.getDireccion());
            statement.setInt(5, persona.getEdad());
            statement.setString(6, persona.getEmail());
            statement.setInt(7, opGen);
            statement.executeUpdate();

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    persona.setId(generatedKeys.getLong(1));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Persona findPersonaId(int id, int opGen) {
        BuscarCiudad buscarCiudad = new BuscarCiudad();
        String sql = "INSERT INTO persons(name, lastname, idcity, address, age, email, idgender) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Persona persona = null;

        try (Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    statement.setString(1, persona.getNombre());
                    statement.setString(2, persona.getApellido());
                    statement.setInt(3, buscarCiudad.matchCiudadDB(persona.getCiudad()));
                    statement.setString(4, persona.getDireccion());
                    statement.setInt(5, persona.getEdad());
                    statement.setString(6, persona.getEmail());
                    statement.setInt(7, opGen);
                    statement.executeUpdate();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persona;
    }
    
    public void eliminarPersona(int id) {
        String sql = "DELETE FROM persons WHERE id = ?";

        try (Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}