/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.System.Logger;
import java.lang.System.Logger.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author fantoli
 */
public class P_TYPE {
    
    private int id;
    private String name;
    private String description;
    
    
    //Create the geters and seters
    public Integer getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String NAME)
    {
        this.name = NAME;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String DESCRIPTION)
    {
        this.description = DESCRIPTION;
    }
    
    
    //Create the class constructors
    public P_TYPE(){}
    
    public P_TYPE(Integer ID,String NAME, String DESCRIPTION)
    {
        this.id = ID;
        this.name = NAME;
        this.description = DESCRIPTION;
        
    }
    
    //Create a function to insert - edit - remove type
    public boolean execTypeQuery(String queryType, P_TYPE type)
    {
        PreparedStatement ps;
        
        //add a new type
        
        if(queryType.equals("add"))
        {
            try {    
                
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");           
            String url = "jdbc:sqlserver://localhost:1433;databaseName=java_rst_db;user=sa;password=Inuyasha.96"; 
            Connection con = DriverManager.getConnection(url);
//            String sql = "Select * from property_type where username=? and password = ?";
            String insert = "INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, type.getName());
            pst.setString(2, type.getDescription());
            pst.setInt(3, type.getId());
            
            return (pst.executeUpdate() > 0);
            
            
            
        } catch (Exception e) {
            
            return false;
        }
          
            
      }
        
      //update a type
        
        else if(queryType.equals("edit"))
        {
            try {    
                
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");           
            String url = "jdbc:sqlserver://localhost:1433;databaseName=java_rst_db;user=sa;password=Inuyasha.96"; 
            Connection con = DriverManager.getConnection(url);
//            String sql = "Select * from property_type where username=? and password = ?";
            String insert = "UPDATE ´property_type´ SET ´name´=?,´description´=? WHERE ´id´ = ?";
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, type.getName());
            pst.setString(2, type.getDescription());
            pst.setInt(3, type.getId());
            
            return (pst.executeUpdate() > 0);
            
            
            
        } catch (Exception e) {
            
            return false;
        }
        
            
            
        }  
        
        else if(queryType.equals("remove"))
        {
            try {    
                
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");           
            String url = "jdbc:sqlserver://localhost:1433;databaseName=java_rst_db;user=sa;password=Inuyasha.96"; 
            Connection con = DriverManager.getConnection(url);
//            String sql = "Select * from property_type where username=? and password = ?";
            String insert = "DELETE FROM ´property_type´ WHERE ´id´ = ?";
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setInt(1, type.getId());
            
            return (pst.executeUpdate() > 0);
            
            
            
        } catch (Exception e) {
            
            return false;
        }
        
    }
    
        else
        
        { 
            JOptionPane.showInternalMessageDialog(null, "Enter the correct Query( add, edit, remove)", "Invalid Operation", id);
            return false;
        }
    }
}
