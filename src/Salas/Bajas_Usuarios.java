/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;

import Programacion.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class Bajas_Usuarios extends javax.swing.JFrame {

   conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    public void Eliminar(){
        String usuario=B_nombre.getText();
    String id= id_baja.getText();
    String SQL= "delete  from n_usuarios where nick='"+usuario+"'and id_usuario= '"+id+"'";
     try {
             PreparedStatement pst= con.prepareStatement(SQL);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Borrado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo borrar"+ e.getMessage());
       }
    
    }
    public Bajas_Usuarios() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        Ayuda_b = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        B_nombre = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        id_baja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

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
        getContentPane().add(Ayuda_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 40, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Baja de usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 200, 70));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Boton_siguiente.png"))); // NOI18N
        Guardar.setToolTipText("Guardar");
        Guardar.setBorder(null);
        Guardar.setBorderPainted(false);
        Guardar.setContentAreaFilled(false);
        Guardar.setFocusPainted(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 50));

        B_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(B_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, 30));

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
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 40, 30));
        getContentPane().add(id_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 120, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Fondo_libreta.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ayuda_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_bActionPerformed
        Ayuda Ventana_ayuda = new Ayuda();
        Ventana_ayuda.setVisible(true);
    }//GEN-LAST:event_Ayuda_bActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        PIN si = new PIN();
        si.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ExitActionPerformed

    private void B_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_nombreActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        
         Eliminar();
        this.dispose();

    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Bajas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bajas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bajas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bajas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bajas_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ayuda_b;
    private javax.swing.JTextField B_nombre;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField id_baja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}