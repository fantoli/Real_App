/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection cn = null;
    
    public Connection Entrar(){
        try {
            //cargamos drive en la clase Class en el metodo ForName
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=java_rst_db;user=sa;password=Inuyasha.96");
            //mensaje si conecta
            JOptionPane.showInternalMessageDialog(null, "Conexion realizada con éxito");
        } catch (Exception e) {
            
            //error
            JOptionPane.showConfirmDialog(null, "Error En :" + e);
        }
        return cn;
        
    }
    
}
