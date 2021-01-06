/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

import Programacion.Autoinc;
import Programacion.Selector;
import Programacion.Tiempo;
import Programacion.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author HP
 */
public class RegistroAudiovisual extends javax.swing.JFrame {

    int e;
    conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    Calendar hora = new GregorianCalendar();
    Selector valor = new Selector();

    public RegistroAudiovisual() {
        initComponents();
        I_hora.setCalendar(hora);

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Expositor = new javax.swing.JTextField();
        Desde = new javax.swing.JLabel();
        Hasta = new javax.swing.JLabel();
        Ayuda_b = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        id_usuariolbl = new javax.swing.JLabel();
        N_evento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ID_usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Encargado = new javax.swing.JTextField();
        Fecha = new com.toedter.calendar.JDateChooser();
        I_hora = new com.toedter.calendar.JDateChooser();
        Valida = new javax.swing.JButton();
        Final = new com.toedter.calendar.JDateChooser();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Exit.png"))); // NOI18N
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
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Expositor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 70, 30));
        getContentPane().add(Expositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 220, 30));

        Desde.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Desde.setText("Final");
        getContentPane().add(Desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));

        Hasta.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Hasta.setText("Inicio");
        getContentPane().add(Hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 50, 20));

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
        getContentPane().add(Ayuda_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 60, 50));

        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Boton_aceptar.png"))); // NOI18N
        Aceptar.setToolTipText("Aceptar y guardar");
        Aceptar.setBorder(null);
        Aceptar.setBorderPainted(false);
        Aceptar.setContentAreaFilled(false);
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setEnabled(false);
        Aceptar.setFocusPainted(false);
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 70, 50));

        id_usuariolbl.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        id_usuariolbl.setText("ID usuario");
        getContentPane().add(id_usuariolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 20));

        N_evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_eventoActionPerformed(evt);
            }
        });
        getContentPane().add(N_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Nombre del evento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 120, 30));

        ID_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ID_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(ID_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 160, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Encargado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 30));

        Encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncargadoActionPerformed(evt);
            }
        });
        Encargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EncargadoKeyTyped(evt);
            }
        });
        getContentPane().add(Encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 130, 30));

        Fecha.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, 30));

        I_hora.setDateFormatString("HH:mm:ss");
        getContentPane().add(I_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        Valida.setText("Validar");
        Valida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidaActionPerformed(evt);
            }
        });
        getContentPane().add(Valida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 90, 60));

        Final.setDateFormatString("HH:mm:ss");
        getContentPane().add(Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Fondo_libreta.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void AgrgarEventoAuditorio() {
        String SQL = "insert into eventos(id_evento,id_usuario,id_sala,fecha,duracion,nombre,encargado,h_inicio,expositor) values (?,?,?,?,?,?,?,?,?)";
        Autoinc au = new Autoinc();
        Tiempo tim = new Tiempo();

        try {

            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, String.valueOf(au.autoincevento()));
            pst.setString(2, ID_usuario.getText());
            pst.setString(3, String.valueOf('2'));
            pst.setString(4, ((JTextField) Fecha.getDateEditor().getUiComponent()).getText());
            pst.setString(5, ((JTextField) Final.getDateEditor().getUiComponent()).getText());
            pst.setString(6, N_evento.getText());
            pst.setString(7, Encargado.getText());
            pst.setString(8, ((JTextField) I_hora.getDateEditor().getUiComponent()).getText());
            pst.setString(9, Expositor.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro exisoto");
            PIN p = new PIN();
            p.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registro\n verifique los datos \n" + e.getMessage());
            this.setVisible(true);

        }
    }

    private int Validar() {
        int a = 0;
        try {

            if (!ID_usuario.getText().isEmpty()) {
                if (!((JTextField) Fecha.getDateEditor().getUiComponent()).getText().isEmpty()) {
                    if (!((JTextField) Final.getDateEditor().getUiComponent()).getText().isEmpty()) {
                        if (!N_evento.getText().isEmpty()) {
                            if (!Encargado.getText().isEmpty()) {
                                if (!((JTextField) I_hora.getDateEditor().getUiComponent()).getText().isEmpty()) {
                                    if (!Expositor.getText().isEmpty()) {
                                        Aceptar.setEnabled(true);
                                    } else {
                                        JOptionPane.showMessageDialog(this, "por favor ingrese datos correspondientes ");
                                        Aceptar.setEnabled(false);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "por favor ingrese datos correspondientes ");
                                    Aceptar.setEnabled(false);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "por favor ingrese datos correspondientes ");
                                Aceptar.setEnabled(false);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "por favor ingrese datos correspondientes ");
                            Aceptar.setEnabled(false);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "por favor ingrese datos correspondientes ");
                        Aceptar.setEnabled(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "por favor ingrese datos correspondientes ");
                    Aceptar.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "por favor ingrese datos correspondientes ");
                Aceptar.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error \t " + e.getMessage());
        }
        return a;

    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        dispose();
        Inicio ni = new Inicio();
        ni.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void Ayuda_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_bActionPerformed
        Ayuda Ventana_ayuda = new Ayuda();
        Ventana_ayuda.setVisible(true);

    }//GEN-LAST:event_Ayuda_bActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        AgrgarEventoAuditorio();
        Inicio v3 = new Inicio();
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AceptarActionPerformed

    private void N_eventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_eventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N_eventoActionPerformed

    private void EncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EncargadoActionPerformed

    private void ValidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidaActionPerformed
        
        Validar();

    }//GEN-LAST:event_ValidaActionPerformed

    private void ID_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_usuarioKeyTyped
        char Validar = evt.getKeyChar();
        if (Character.isLetter(Validar)) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros ");
            ID_usuario.setText("");
            ID_usuario.setText("");
            
        }
        
    }//GEN-LAST:event_ID_usuarioKeyTyped

    private void EncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EncargadoKeyTyped
        char Validar = evt.getKeyChar();
        if (Character.isDigit(Validar)) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros ");
            Encargado.setText("");
            Encargado.setText("");
            
        }
    }//GEN-LAST:event_EncargadoKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistroAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAudiovisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Ayuda_b;
    private javax.swing.JLabel Desde;
    private javax.swing.JTextField Encargado;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Expositor;
    private com.toedter.calendar.JDateChooser Fecha;
    private com.toedter.calendar.JDateChooser Final;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Hasta;
    private javax.swing.JTextField ID_usuario;
    private com.toedter.calendar.JDateChooser I_hora;
    private javax.swing.JTextField N_evento;
    private javax.swing.JButton Valida;
    private javax.swing.JLabel id_usuariolbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
