/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.ParseException;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Estado {

    Thread h1;
    int a;

    public void run() throws ParseException {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            FinEventoAudiov();
            System.out.println("evento" + a);

        }
    }

    public int FinEventoAudiov() {
        conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        Pruebabd pb = new Pruebabd();

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

        int n = 0;
        int q = 0;
        int r = calendario.get(Calendar.HOUR_OF_DAY);
        int s = 0;
        int prueba = 0;
        Date date1 = null;
        Date date2 = calendario.getTime();
        Time tiemp = new Time(r + n, (calendario.get(Calendar.MINUTE)), (calendario.get(Calendar.SECOND)));

        Time hora = null;
        Time inicio = null;
        s = calendario.get(Calendar.HOUR_OF_DAY);

        q = calendario.get(Calendar.DATE + Calendar.DAY_OF_MONTH);

        String audiov;

        try {
            String SQL = "select duracion,h_inicio from eventos where id_sala= 2";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                hora = rs.getTime("duracion");
                inicio = rs.getTime("h_inicio");
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        if (hora.before(tiemp)) {
            pb.CambiarEaudiovisual();
            System.out.println("\n comprobacion");
        } else {
            if (inicio.before(tiemp) && hora.after(tiemp)) {
                int resultado;
                try {
                    String SQL = "update salas set estado= 0 where id_sala = 2";
                    PreparedStatement sl = con.prepareStatement(SQL);

                    int rowsUpdated = sl.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("An existing user was updated successfully!");
                    }
                } catch (Exception e) {
                    System.out.println("error" + e.getMessage());
                }
            }
        }

        System.out.println(s);
        return r;

    }

    public int FinEventoAuditorio() {
        conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        Pruebabd pb = new Pruebabd();

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

        int n = 0;
        int q = 0;
        int r = calendario.get(Calendar.HOUR_OF_DAY);
        int s = 0;
        int prueba = 0;
        Date date1 = null;
        Date date2 = calendario.getTime();
        Time tiemp = new Time(r + n, (calendario.get(Calendar.MINUTE)), (calendario.get(Calendar.SECOND)));

        Time hora = null;
        Time inicio = null;
        s = calendario.get(Calendar.HOUR_OF_DAY);

        q = calendario.get(Calendar.DATE + Calendar.DAY_OF_MONTH);

        String audiov;

        try {
            String SQL = "select duracion,h_inicio from eventos where id_sala= 4";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                hora = rs.getTime("duracion");
                inicio = rs.getTime("h_inicio");
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        if (hora.before(tiemp)) {
            pb.CambiarEAuditorio();
            System.out.println("\n comprobacion");
        } else {
            if (inicio.before(tiemp) && hora.after(tiemp)) {
                int resultado;
                try {
                    String SQL = "update salas set estado= 0 where id_sala = 4";
                    PreparedStatement sl = con.prepareStatement(SQL);

                    int rowsUpdated = sl.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("An existing user was updated successfully!");
                    }
                } catch (Exception e) {
                    System.out.println("error" + e.getMessage());
                }
            }
        }

        System.out.println(s);
        return r;
    }

    public int FinEventoDigital() {
         conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        Pruebabd pb = new Pruebabd();

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

        int n = 0;
        int q = 0;
        int r = calendario.get(Calendar.HOUR_OF_DAY);
        int s = 0;
        int prueba = 0;
        Date date1 = null;
        Date date2 = calendario.getTime();
        Time tiemp = new Time(r + n, (calendario.get(Calendar.MINUTE)), (calendario.get(Calendar.SECOND)));

        Time hora = null;
        Time inicio = null;
        s = calendario.get(Calendar.HOUR_OF_DAY);

        q = calendario.get(Calendar.DATE + Calendar.DAY_OF_MONTH);

        String audiov;

        try {
            String SQL = "select duracion,h_inicio from eventos where id_sala= 6";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                hora = rs.getTime("duracion");
                inicio = rs.getTime("h_inicio");
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        if (hora.before(tiemp)) {
            pb.CambiarEDigital();
            System.out.println("\n comprobacion");
        } else {
            if (inicio.before(tiemp) && hora.after(tiemp)) {
                int resultado;
                try {
                    String SQL = "update salas set estado= 0 where id_sala = 6";
                    PreparedStatement sl = con.prepareStatement(SQL);

                    int rowsUpdated = sl.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("An existing user was updated successfully!");
                    }
                } catch (Exception e) {
                    System.out.println("error" + e.getMessage());
                }
            }
        }

        System.out.println(s);
        return r;
    }

    public int FinEventoA() {
         conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        Pruebabd pb = new Pruebabd();

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

        int n = 0;
        int q = 0;
        int r = calendario.get(Calendar.HOUR_OF_DAY);
        int s = 0;
        int prueba = 0;
        Date date1 = null;
        Date date2 = calendario.getTime();
        Time tiemp = new Time(r + n, (calendario.get(Calendar.MINUTE)), (calendario.get(Calendar.SECOND)));

        Time hora = null;
        Time inicio = null;
        s = calendario.get(Calendar.HOUR_OF_DAY);

        q = calendario.get(Calendar.DATE + Calendar.DAY_OF_MONTH);

        String audiov;

        try {
            String SQL = "select duracion,h_inicio from eventos where id_sala= 7";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                hora = rs.getTime("duracion");
                inicio = rs.getTime("h_inicio");
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        if (hora.before(tiemp)) {
            pb.CambiarECompA();
            System.out.println("\n comprobacion");
        } else {
            if (inicio.before(tiemp) && hora.after(tiemp)) {
                int resultado;
                try {
                    String SQL = "update salas set estado= 0 where id_sala = 7";
                    PreparedStatement sl = con.prepareStatement(SQL);

                    int rowsUpdated = sl.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("An existing user was updated successfully!");
                    }
                } catch (Exception e) {
                    System.out.println("error" + e.getMessage());
                }
            }
        }

        System.out.println(s);
        return r;
    }

    public int FinEventoB() {
         conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        Pruebabd pb = new Pruebabd();

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

        int n = 0;
        int q = 0;
        int r = calendario.get(Calendar.HOUR_OF_DAY);
        int s = 0;
        int prueba = 0;
        Date date1 = null;
        Date date2 = calendario.getTime();
        Time tiemp = new Time(r + n, (calendario.get(Calendar.MINUTE)), (calendario.get(Calendar.SECOND)));

        Time hora = null;
        Time inicio = null;
        s = calendario.get(Calendar.HOUR_OF_DAY);

        q = calendario.get(Calendar.DATE + Calendar.DAY_OF_MONTH);

        String audiov;

        try {
            String SQL = "select duracion,h_inicio from eventos where id_sala= 8";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                hora = rs.getTime("duracion");
                inicio = rs.getTime("h_inicio");
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        if (hora.before(tiemp)) {
            pb.CambiarECompB();
            System.out.println("\n comprobacion");
        } else {
            if (inicio.before(tiemp) && hora.after(tiemp)) {
                int resultado;
                try {
                    String SQL = "update salas set estado= 0 where id_sala = 8";
                    PreparedStatement sl = con.prepareStatement(SQL);

                    int rowsUpdated = sl.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("An existing user was updated successfully!");
                    }
                } catch (Exception e) {
                    System.out.println("error" + e.getMessage());
                }
            }
        }

        System.out.println(s);
        return r;
    }

    public int FinEventoC() {
         conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        Pruebabd pb = new Pruebabd();

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

        int n = 0;
        int q = 0;
        int r = calendario.get(Calendar.HOUR_OF_DAY);
        int s = 0;
        int prueba = 0;
        Date date1 = null;
        Date date2 = calendario.getTime();
        Time tiemp = new Time(r + n, (calendario.get(Calendar.MINUTE)), (calendario.get(Calendar.SECOND)));

        Time hora = null;
        Time inicio = null;
        s = calendario.get(Calendar.HOUR_OF_DAY);

        q = calendario.get(Calendar.DATE + Calendar.DAY_OF_MONTH);

        String audiov;

        try {
            String SQL = "select duracion,h_inicio from eventos where id_sala= 9";

            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                hora = rs.getTime("duracion");
                inicio = rs.getTime("h_inicio");
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        if (hora.before(tiemp)) {
            pb.CambiarECompC();
            System.out.println("\n comprobacion");
        } else {
            if (inicio.before(tiemp) && hora.after(tiemp)) {
                int resultado;
                try {
                    String SQL = "update salas set estado= 0 where id_sala = 9";
                    PreparedStatement sl = con.prepareStatement(SQL);

                    int rowsUpdated = sl.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("An existing user was updated successfully!");
                    }
                } catch (Exception e) {
                    System.out.println("error" + e.getMessage());
                }
            }
        }

        System.out.println(s);
        return r;
    }

}
