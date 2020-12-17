/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Autoinc {
    public int autoincsalas(){
        int id = 1;
        PreparedStatement ps= null;
        ResultSet rs=null;
        conexionSQL db= new conexionSQL();
        
        try {
                ps = db.conexion().prepareStatement("Select max(id_sala)From salas");
                rs=ps.executeQuery();
                while (rs.next()) { 
                    
                id =rs.getInt(1)+1;
                

                
            }
                
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            
                 
        }
        finally{
            try {
                ps.close();
                rs.close();
                
            } catch (Exception e) {
                
            }
        }
        return id;
    }
       public int autoincevento(){
        int id = 1;
        PreparedStatement ps= null;
        ResultSet rs=null;
        conexionSQL db= new conexionSQL();
        
        try {
                ps = db.conexion().prepareStatement("Select max(id_evento)From eventos");
                rs=ps.executeQuery();
                while (rs.next()) { 
                    
                id =rs.getInt(1)+1;
                

                
            }
                
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            
                 
        }
        finally{
            try {
                ps.close();
                rs.close();
                
            } catch (Exception e) {
                
            }
        }
        return id;
    }
    
}
