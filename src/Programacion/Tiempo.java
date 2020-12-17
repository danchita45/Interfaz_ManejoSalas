/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author hp
 */
public class Tiempo extends javax.swing.JFrame implements Runnable {
    String hora,minuto,ampm, a;
    String dia,mes,año;
    
    Calendar calendario;
    
    
    Thread h1;
    

    @Override
        public void run (){
           Thread ct = Thread.currentThread();
            while (ct==h1) {
                calculah();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    
                }
                
            }
            
        
    }
        public String calculah () {        
            Calendar o = new GregorianCalendar();
            Date fechaHoraActual = new Date();
            o.setTime(fechaHoraActual);
            ampm = o.get(Calendar.AM_PM)== Calendar.AM?"AM":"PM";
            if (ampm.equals("PM")) {
                int h = o.get(Calendar.HOUR_OF_DAY)-12;
                hora=h>9?""+h:"0"+h;
                minuto= o.get(Calendar.HOUR_OF_DAY)>9?""+ o.get(Calendar.HOUR_OF_DAY):"0"+o.get(Calendar.HOUR_OF_DAY);
                
                a= String.valueOf(hora+":" + minuto+"PM");
            }else{
                hora= o.get(Calendar.HOUR_OF_DAY)>9?""+ o.get(Calendar.HOUR_OF_DAY):"0"+o.get(Calendar.HOUR_OF_DAY);
                minuto= o.get(Calendar.HOUR_OF_DAY)>9?""+ o.get(Calendar.HOUR_OF_DAY):"0"+o.get(Calendar.HOUR_OF_DAY);
                a= String.valueOf(hora+":" + minuto+"AM");
            }
           
            System.out.println(a);
         
         return a;
        }
      
      
      
        
    
}
