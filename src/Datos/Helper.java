/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author fantoli
 */
public class Helper extends Conexion{
    
    public DefaultComboBoxModel getValues()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            Connection cn = this.getConexion();
            String sql = "SELECT type FROM property";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
            cn.close();
            rs.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
    }
    
}
