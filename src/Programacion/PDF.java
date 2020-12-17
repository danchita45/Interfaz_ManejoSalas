/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;

import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author hp
 */
public class PDF {
    JFileChooser selec_archi;
     conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    public void PDFcrear(){
        
        
        selec_archi = new JFileChooser();
        int opt = selec_archi.showSaveDialog(null);
        
        if (opt==selec_archi.APPROVE_OPTION) {
            try {
               
                

                OutputStream texto_salida = new FileOutputStream(selec_archi.getSelectedFile());
                Document doc = new Document();
                PdfWriter.getInstance(doc, texto_salida);
                doc.open();
               
                    
                doc.add(new Paragraph(   /*  aqui va el contenido del PDF*/ ));
                
                doc.close();
                texto_salida.close();
            } catch (Exception e) {
            }
            
        }
        
        
    }
    
}
