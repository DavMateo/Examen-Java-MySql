/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.infrastructure.adapter.out.persistence;

// Importando las clases y paquetes necesarios
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
public class BuscarCiudad {
    // Definiendo los constructores de la clase
    public BuscarCiudad() {
        
    }
    
    
    // Definiendo las funciones pertinentes
    public int matchCiudadDB(String ciudad) {
        int numIdCity = 0;
        String sql = "SELECT id FROM city WHERE name = ?";
        
        
        try (Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, ciudad);
            try(ResultSet resultSet = statement.executeQuery()) {
                if(resultSet.next()) {
                   return numIdCity = (int) resultSet.getLong("id");
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return numIdCity;
    }
}
