/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;

import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class conexionSQL {
    Connection conectar=null;
    Statement stm;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/bads?user=root&password=");
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion/n"+ e.getMessage());
        }
        return conectar;
        
    }

    
}
