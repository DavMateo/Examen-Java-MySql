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
    private static final String URL = "jdbc:mysql://localhost:3306/sgpzf";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    
    
    public DatabaseConfig() {
        
    }
    
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}