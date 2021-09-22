/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    
    public static Connection getConexion(){
        
        //cargamos drive en la clase Class en el metodo ForName
           String url = "jdbc:sqlserver://localhost:1433;databaseName=java_rst_db;user=sa;password=Inuyasha.96";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }
        
        
    }
    
}
