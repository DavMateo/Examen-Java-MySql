/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.filtrojava.personas.infrastructure.config;

// Importando las clases y paquetes necesarios
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author camper
 */
public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "campus2023";
    private static final String PASSWORD = "campus2023";
    
    
    public DatabaseConfig() {
        
    }
    
    
    public  Connection getConnectionSQL() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
