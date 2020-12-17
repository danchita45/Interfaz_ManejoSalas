/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

import Programacion.Estado;
import Programacion.Pruebabd;
import Programacion.Tiempo;
import com.mysql.jdbc.EscapeTokenizer;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author HP
 */
public class Calendario extends javax.swing.JFrame{

    /**
     * Creates new form Calendario
     */
    
    public Calendario() {
        initComponents();
        this.setLocationRelativeTo(null);
         Calendar calendario = new GregorianCalendar();
            Date fechaHoraActual = new Date();
            calendario.setTime(fechaHoraActual);
            Estado est= new Estado();
            int s= calendario.get(Calendar.HOUR_OF_DAY);
            int a=  calendario.get(Calendar.MINUTE);
            Reloj.setText(String.valueOf(s+":"+a));
            
            
            
      
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ayuda_b = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Ocupado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Reloj = new javax.swing.JLabel();
        Audiovisual = new javax.swing.JButton();
        Auditorio = new javax.swing.JButton();
        Digital = new javax.swing.JButton();
        Sala_a_b = new javax.swing.JButton();
        Sala_b_B = new javax.swing.JButton();
        Sala_c_B = new javax.swing.JButton();
        Sala_A = new javax.swing.JLabel();
        Sala_B = new javax.swing.JLabel();
        Sala_C = new javax.swing.JLabel();
        E_auditorio = new javax.swing.JButton();
        E_audiovisual1 = new javax.swing.JButton();
        E_Digital = new javax.swing.JButton();
        E_SC = new javax.swing.JButton();
        E_SA1 = new javax.swing.JButton();
        E_SB1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ayuda_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Boton_ayuda.png"))); // NOI18N
        Ayuda_b.setToolTipText("Ayuda");
        Ayuda_b.setBorder(null);
        Ayuda_b.setContentAreaFilled(false);
        Ayuda_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ayuda_b.setFocusPainted(false);
        Ayuda_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda_bActionPerformed(evt);
            }
        });
        getContentPane().add(Ayuda_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 60, 50));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Exit.png"))); // NOI18N
        Exit.setToolTipText("Salir");
        Exit.setBorder(null);
        Exit.setBorderPainted(false);
        Exit.setContentAreaFilled(false);
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setFocusPainted(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 50, 30));

        Ocupado.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Ocupado.setText("Ocupado");
        getContentPane().add(Ocupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Libre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 90, 30));

        Reloj.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        getContentPane().add(Reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 130, 50));

        Audiovisual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Proyector5.png"))); // NOI18N
        Audiovisual.setToolTipText("Agregue Actividad a la sala Audiovisual");
        Audiovisual.setBorder(null);
        Audiovisual.setBorderPainted(false);
        Audiovisual.setContentAreaFilled(false);
        Audiovisual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Audiovisual.setFocusPainted(false);
        Audiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AudiovisualActionPerformed(evt);
            }
        });
        getContentPane().add(Audiovisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 80));

        Auditorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Auditorio2.png"))); // NOI18N
        Auditorio.setToolTipText("Agregue actividad al auditorio");
        Auditorio.setBorder(null);
        Auditorio.setBorderPainted(false);
        Auditorio.setContentAreaFilled(false);
        Auditorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Auditorio.setFocusPainted(false);
        Auditorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuditorioActionPerformed(evt);
            }
        });
        getContentPane().add(Auditorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 120, 90));

        Digital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/descarga2.gif"))); // NOI18N
        Digital.setToolTipText("Agregue Actividad al aula digital");
        Digital.setBorderPainted(false);
        Digital.setContentAreaFilled(false);
        Digital.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Digital.setFocusPainted(false);
        Digital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitalActionPerformed(evt);
            }
        });
        getContentPane().add(Digital, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 140, 100));

        Sala_a_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/ONZ74N03.gif"))); // NOI18N
        Sala_a_b.setBorder(null);
        Sala_a_b.setBorderPainted(false);
        Sala_a_b.setContentAreaFilled(false);
        Sala_a_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sala_a_b.setFocusPainted(false);
        Sala_a_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala_a_bActionPerformed(evt);
            }
        });
        getContentPane().add(Sala_a_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 110));

        Sala_b_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/ONZ74N03.gif"))); // NOI18N
        Sala_b_B.setBorder(null);
        Sala_b_B.setBorderPainted(false);
        Sala_b_B.setContentAreaFilled(false);
        Sala_b_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sala_b_B.setFocusPainted(false);
        Sala_b_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala_b_BActionPerformed(evt);
            }
        });
        getContentPane().add(Sala_b_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 150, 110));

        Sala_c_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/ONZ74N03.gif"))); // NOI18N
        Sala_c_B.setBorder(null);
        Sala_c_B.setBorderPainted(false);
        Sala_c_B.setContentAreaFilled(false);
        Sala_c_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sala_c_B.setFocusPainted(false);
        Sala_c_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala_c_BActionPerformed(evt);
            }
        });
        getContentPane().add(Sala_c_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 150, 110));

        Sala_A.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sala_A.setText("Sala A ");
        getContentPane().add(Sala_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, 60));

        Sala_B.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sala_B.setText("Sala B");
        getContentPane().add(Sala_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        Sala_C.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sala_C.setText("Sala C");
        getContentPane().add(Sala_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        E_auditorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_auditorioActionPerformed(evt);
            }
        });
        getContentPane().add(E_auditorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 50, 30));

        E_audiovisual1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                E_audiovisual1StateChanged(evt);
            }
        });
        E_audiovisual1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E_audiovisual1MouseClicked(evt);
            }
        });
        E_audiovisual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_audiovisual1ActionPerformed(evt);
            }
        });
        getContentPane().add(E_audiovisual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, 30));

        E_Digital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_DigitalActionPerformed(evt);
            }
        });
        getContentPane().add(E_Digital, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 30));

        E_SC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_SCActionPerformed(evt);
            }
        });
        getContentPane().add(E_SC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 50, 30));

        E_SA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_SA1ActionPerformed(evt);
            }
        });
        getContentPane().add(E_SA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 50, 30));

        E_SB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_SB1ActionPerformed(evt);
            }
        });
        getContentPane().add(E_SB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 50, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/394690_692aa.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 60, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/394692_550ab.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Fondo_libreta.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -6, 730, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ayuda_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_bActionPerformed
        Ayuda Ventana_ayuda = new Ayuda();
        Ventana_ayuda.setVisible(true);
    }//GEN-LAST:event_Ayuda_bActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        dispose();
        Inicio pin = new Inicio();
        pin.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void AudiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudiovisualActionPerformed

        RegistroAudiovisual vent = new RegistroAudiovisual();
        vent.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_AudiovisualActionPerformed

    private void AuditorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuditorioActionPerformed
        RegistrosAuditorio VAU = new RegistrosAuditorio();
        VAU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AuditorioActionPerformed

    private void DigitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigitalActionPerformed
        RegistroAulaDigital VD= new RegistroAulaDigital();
        VD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DigitalActionPerformed

    private void Sala_a_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala_a_bActionPerformed
   
    }//GEN-LAST:event_Sala_a_bActionPerformed

    private void Sala_b_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala_b_BActionPerformed

    }//GEN-LAST:event_Sala_b_BActionPerformed

    private void Sala_c_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala_c_BActionPerformed
 
    }//GEN-LAST:event_Sala_c_BActionPerformed

    private void E_audiovisual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_audiovisual1ActionPerformed
            
            EstadoBotonAudioVisual();
            
    }//GEN-LAST:event_E_audiovisual1ActionPerformed

    private void E_audiovisual1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E_audiovisual1MouseClicked
        
    }//GEN-LAST:event_E_audiovisual1MouseClicked

    private void E_DigitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_DigitalActionPerformed
        EstadoDigital();        // TODO add your handling code here:
    }//GEN-LAST:event_E_DigitalActionPerformed

    private void E_auditorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_auditorioActionPerformed
       
        EstadoBotonAuditorio();
    }//GEN-LAST:event_E_auditorioActionPerformed

    private void E_SA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_SA1ActionPerformed
        EstadoBotonCA();
    }//GEN-LAST:event_E_SA1ActionPerformed

    private void E_SB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_SB1ActionPerformed
        EstadoBotonCB();
    }//GEN-LAST:event_E_SB1ActionPerformed

    private void E_SCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_SCActionPerformed
        EstadoBotonCC();
        
    }//GEN-LAST:event_E_SCActionPerformed

    private void E_audiovisual1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_E_audiovisual1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_E_audiovisual1StateChanged

    /**
     * @param args the command line arguments
     */
    public  int EstadoBotonAudioVisual (){
        
        Pruebabd audiovisual = new Pruebabd();
        
        int a=audiovisual.EstadoAudiovisual();
       
        if(a==1){
            E_audiovisual1.setBackground(Color.green);
            System.out.println("valor a"+a);
        }else{
            E_audiovisual1.setBackground(Color.red);
            System.out.println("valor a"+a);
        }
        return a;
    }
    
    public  int EstadoBotonAuditorio (){
        
        Pruebabd audiovisual = new Pruebabd();
        
        int a=audiovisual.EstadoAuditorio();
       
        if(a==1){
            E_auditorio.setBackground(Color.green);
            System.out.println("valor a"+a);
        }else{
            E_auditorio.setBackground(Color.red);
            System.out.println("valor a"+a);
        }
        return a;
    }
    public  int EstadoDigital(){
        
        Pruebabd audiovisual = new Pruebabd();
        
        int a=audiovisual.EstadoDigital();
       
        if(a==1){
            E_Digital.setBackground(Color.green);
            System.out.println("valor a"+a);
        }else{
            E_Digital.setBackground(Color.red);
            System.out.println("valor a"+a);
        }
        return a;
    }
    public  int EstadoBotonCA (){
        
        Pruebabd audiovisual = new Pruebabd();
        
        int a=audiovisual.EstadoCA();
       
        if(a==1){
            E_SA1.setBackground(Color.green);
            System.out.println("valor a"+a);
        }else{
            E_SA1.setBackground(Color.red);
            System.out.println("valor a"+a);
        }
        return a;
    }
    public  int EstadoBotonCB (){
        
        Pruebabd audiovisual = new Pruebabd();
        
        int a=audiovisual.EstadoCB();
       
        if(a==1){
            E_SB1.setBackground(Color.green);
            System.out.println("valor a"+a);
        }else{
            E_SB1.setBackground(Color.red);
            System.out.println("valor a"+a);
        }
        return a;
    }
    public  int EstadoBotonCC (){
        
        Pruebabd audiovisual = new Pruebabd();
        
        int a=audiovisual.EstadoCC();
       
        if(a==1){
            E_SC.setBackground(Color.green);
            System.out.println("valor a"+a);
        }else{
            E_SC.setBackground(Color.red);
            System.out.println("valor a"+a);
        }
        return a;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
                
                
            }
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Audiovisual;
    private javax.swing.JButton Auditorio;
    private javax.swing.JButton Ayuda_b;
    private javax.swing.JButton Digital;
    private javax.swing.JButton E_Digital;
    private javax.swing.JButton E_SA1;
    private javax.swing.JButton E_SB1;
    private javax.swing.JButton E_SC;
    private javax.swing.JButton E_audiovisual1;
    private javax.swing.JButton E_auditorio;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Ocupado;
    private javax.swing.JLabel Reloj;
    private javax.swing.JLabel Sala_A;
    private javax.swing.JLabel Sala_B;
    private javax.swing.JLabel Sala_C;
    private javax.swing.JButton Sala_a_b;
    private javax.swing.JButton Sala_b_B;
    private javax.swing.JButton Sala_c_B;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}