/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Calendar;



/**
 *
 * @author hp
 */
public class Pruebabd {
    public static void main(String[] args) {
      
        Pruebabd a= new Pruebabd();

     a.EstadoAudiovisual();
        

        
    }
    public int EstadoAudiovisual() {
        conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    Estado a= new Estado();
    a.FinEventoAudiov();
    
    String audiov;
    int resultado=1;
        try {
            String SQL = "select estado from salas where id_sala= 2";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs= pst.executeQuery();
           
            if(rs.first()){
                 resultado=rs.getInt("estado");
                System.out.println("el estado : "+ resultado);
               
            }
            else{
                
            }
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
        return resultado;
        
    }
    public int EstadoAuditorio(){
        conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    Estado a= new Estado();
    a.FinEventoAuditorio();
   
    String audiov;
    int resultado=1;
        try {
            String SQL = "select estado from salas where id_sala= 4";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs= pst.executeQuery();
           
            if(rs.first()){
                 resultado=rs.getInt("estado");
                System.out.println("el estado : "+ resultado);
                
            }
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
        return resultado;
        
    }
    public int EstadoDigital(){
        conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    Estado a= new Estado();
a.FinEventoDigital();
    
    String audiov;
    int resultado=1;
        try {
            String SQL = "select estado from salas where id_sala= 6";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs= pst.executeQuery();
           
            if(rs.first()){
                 resultado=rs.getInt("estado");
                System.out.println("el estado : "+ resultado);
                
            }
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
        return resultado;
        
    }
    public int EstadoCA(){
        conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    Estado a= new Estado();
    a.FinEventoA();
    
    String audiov;
    int resultado=1;
        try {
            String SQL = "select estado from salas where id_sala= 7";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs= pst.executeQuery();
           
            if(rs.first()){
                 resultado=rs.getInt("estado");
                System.out.println("el estado : "+ resultado);
                
            }
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
        return resultado;
        
    }
    public int EstadoCB(){
        conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    Estado a= new Estado();
a.FinEventoB();
    
    String audiov;
    int resultado=1;
        try {
            String SQL = "select estado from salas where id_sala= 8";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs= pst.executeQuery();
           
            if(rs.first()){
                 resultado=rs.getInt("estado");
                System.out.println("el estado : "+ resultado);
                
            }
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
        return resultado;
        
    }
    public int EstadoCC(){
        conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    Estado a= new Estado();
    a.FinEventoC();
    
    String audiov;
    int resultado=1;
        try {
            String SQL = "select estado from salas where id_sala= 9";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs= pst.executeQuery();
           
            if(rs.first()){
                 resultado=rs.getInt("estado");
                System.out.println("el estado : "+ resultado);
                
            }
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
        return resultado;
        
    }
    public void CambiarEAuditorio(){
    conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    int resultado;
        try {
            String SQL= "update salas set estado= 1 where id_sala = 4";
            PreparedStatement sl= con.prepareStatement(SQL);
         
            int rowsUpdated = sl.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully! \n si se pudo");
}
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
        }
        
    }
    public void CambiarEaudiovisual(){
         conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    int resultado;
        try {
            String SQL= "update salas set estado= 1 where id_sala = 2";
            PreparedStatement sl= con.prepareStatement(SQL);
         
            int rowsUpdated = sl.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
        }
        
    }
     public void CambiarEDigital(){
         conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    int resultado;
        try {
            String SQL= "update salas set estado= 1 where id_sala = 6";
            PreparedStatement sl= con.prepareStatement(SQL);
         
            int rowsUpdated = sl.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
        }
        
    }
      public void CambiarECompA(){
         conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    int resultado;
        try {
            String SQL= "update salas set estado= 1 where id_sala = 7";
            PreparedStatement sl= con.prepareStatement(SQL);
         
            int rowsUpdated = sl.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
        }
        
    }
       public void CambiarECompB(){
         conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    int resultado;
        try {
            String SQL= "update salas set estado= 1 where id_sala = 8";
            PreparedStatement sl= con.prepareStatement(SQL);
         
            int rowsUpdated = sl.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
        }
        
    }
   
        public void CambiarECompC(){
         conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    int resultado;
        try {
            String SQL= "update salas set estado= 1 where id_sala = 9";
            PreparedStatement sl= con.prepareStatement(SQL);
         
            int rowsUpdated = sl.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
        }
        
    }
    
}
