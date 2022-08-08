/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TermohigrometroController;
import java.text.ParseException;

import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Funciones;

import model.Termohigrometro;

/**
 *
 * @author Wnieto
 */
public class frmTermohigrometro extends javax.swing.JFrame {

    /**
     * Creates new form frmTermohigrometro
     */
    public frmTermohigrometro() {
        initComponents();
        setLocationRelativeTo(null);    
    }


    TermohigrometroController termohigrometroController = new TermohigrometroController();
    Funciones funciones = new Funciones();

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jtpTermohigrometro = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbTemperaturaAM = new javax.swing.JLabel();
        lbTemperaturaPM = new javax.swing.JLabel();
        lbHumedadAM = new javax.swing.JLabel();
        lbHumedadPM = new javax.swing.JLabel();
        txtTemperaturaAM = new javax.swing.JTextField();
        txtTemperaturaPM = new javax.swing.JTextField();
        txtHumedadAM = new javax.swing.JTextField();
        txtHumedadPM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTemperatura = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnCrearTemperatura = new javax.swing.JButton();
        btnBuscarTemperatura = new javax.swing.JButton();
        btnBorrarTemperatura = new javax.swing.JButton();
        btnActualizarTemperatura = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        lbIdTemperatura = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtpTermohigrometro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFecha.setText("Fecha:");

        lbTemperaturaAM.setText("Temperatura AM:");

        lbTemperaturaPM.setText("Temperatura PM:");

        lbHumedadAM.setText("Humedad AM:");

        lbHumedadPM.setText("Humedad PM:");

        txtTemperaturaAM.setNextFocusableComponent(txtHumedadAM);

        txtTemperaturaPM.setNextFocusableComponent(txtHumedadPM);

        txtHumedadAM.setNextFocusableComponent(txtTemperaturaPM);

        txtHumedadPM.setNextFocusableComponent(btnCrearTemperatura);

        tblTemperatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTemperaturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTemperatura);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCrearTemperatura.setText("Crear");
        btnCrearTemperatura.setMaximumSize(new java.awt.Dimension(79, 23));
        btnCrearTemperatura.setMinimumSize(new java.awt.Dimension(79, 23));
        btnCrearTemperatura.setNextFocusableComponent(btnCrearTemperatura);
        btnCrearTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTemperaturaActionPerformed(evt);
            }
        });

        btnBuscarTemperatura.setText("Buscar");
        btnBuscarTemperatura.setMaximumSize(new java.awt.Dimension(79, 23));
        btnBuscarTemperatura.setMinimumSize(new java.awt.Dimension(79, 23));
        btnBuscarTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTemperaturaActionPerformed(evt);
            }
        });

        btnBorrarTemperatura.setText("Borrar");
        btnBorrarTemperatura.setMaximumSize(new java.awt.Dimension(79, 23));
        btnBorrarTemperatura.setMinimumSize(new java.awt.Dimension(79, 23));

        btnActualizarTemperatura.setText("Actualizar");
        btnActualizarTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnCrearTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnActualizarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnBuscarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnBorrarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarTemperatura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdcFecha.setDateFormatString("yyyy-MM-dd");

        lbIdTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIdTemperatura.setText("Id :");

        txtId.setNextFocusableComponent(txtHumedadAM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTemperaturaPM)
                                            .addComponent(lbIdTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTemperaturaPM, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTemperaturaAM, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbHumedadAM, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbHumedadPM, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbTemperaturaAM)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHumedadAM)
                                    .addComponent(txtHumedadPM, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbIdTemperatura)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbFecha))
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTemperaturaAM)
                        .addComponent(txtTemperaturaAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbHumedadAM))
                    .addComponent(txtHumedadAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTemperaturaPM)
                        .addComponent(txtTemperaturaPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHumedadPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbHumedadPM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpTermohigrometro.addTab("Termohigrometro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpTermohigrometro, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpTermohigrometro)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTemperaturaActionPerformed
        String fecha = ((JTextField)jdcFecha.getDateEditor().getUiComponent()).getText();
        float temperaturaAm = Float.parseFloat(txtTemperaturaAM.getText());
        float temperaturaPm = Float.parseFloat(txtTemperaturaPM.getText());
        float humedadAm = Float.parseFloat(txtHumedadAM.getText());
        float humedadPm = Float.parseFloat(txtHumedadPM.getText());
        
        boolean seInserto = termohigrometroController.insertTermohigrometro(fecha, temperaturaAm, temperaturaPm, humedadAm, humedadPm);
        if (seInserto){
            JOptionPane.showMessageDialog(this,"el registro se inserto correctamente");
        }else{
            JOptionPane.showMessageDialog(this,"Hubo un error al registro el municipio");
        }
        llenarTablaTermohigrometro(); 
    }//GEN-LAST:event_btnCrearTemperaturaActionPerformed

    private void tblTemperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTemperaturaMouseClicked
        int fila = tblTemperatura.getSelectedRow();
        int id = (int) tblTemperatura.getValueAt(fila, 0);
        Termohigrometro termohigrometro = termohigrometroController.findTermohigrometro(id);
        txtId.setText("" + termohigrometro.id);

        String ls_fecha=String.valueOf(tblTemperatura.getValueAt(tblTemperatura.getSelectedRow(),1));
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha;
        try {
            fecha = (java.util.Date) s.parse(ls_fecha);
            jdcFecha.setDate(fecha);
                    
        } catch (ParseException ex) {
            Logger.getLogger(frmTermohigrometro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtTemperaturaAM.setText(String.valueOf(termohigrometro.temperaturaam));
        txtTemperaturaPM.setText(String.valueOf(termohigrometro.temperaturapm));
        txtHumedadAM.setText(String.valueOf(termohigrometro.humedadam));
        txtHumedadPM.setText(String.valueOf(termohigrometro.humedadpm));
        llenarTablaTermohigrometro();        
    }//GEN-LAST:event_tblTemperaturaMouseClicked

    private void btnActualizarTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTemperaturaActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String fecha = ((JTextField)jdcFecha.getDateEditor().getUiComponent()).getText();
        float temperaturaAM = Float.parseFloat(txtTemperaturaAM.getText());
        float temperaturaPM = Float.parseFloat(txtTemperaturaPM.getText());
        float humedadAM = Float.parseFloat(txtHumedadAM.getText());
        float humedadPM = Float.parseFloat(txtHumedadPM.getText());
        
        boolean seActualizo = termohigrometroController.updateTermohigrometro(id, fecha, temperaturaAM, temperaturaPM, humedadAM, humedadPM);
        if (seActualizo){
            JOptionPane.showMessageDialog(this, "El registro se actualizó!");
        }else{
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error el registro no se actualizó!");
        }
        llenarTablaTermohigrometro(); 
    }//GEN-LAST:event_btnActualizarTemperaturaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        llenarTablaTermohigrometro();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTemperaturaActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        Termohigrometro termohigrometro = termohigrometroController.findTermohigrometro(id);
        if(termohigrometro == null){
            JOptionPane.showMessageDialog(this, "El registro no fue encontrado!");
        }else{

            jdcFecha.setDate(funciones.StringADate(termohigrometro.fecha));
            txtTemperaturaAM.setText(String.valueOf(termohigrometro.temperaturaam));
            txtTemperaturaPM.setText(String.valueOf(termohigrometro.temperaturapm));
            txtHumedadAM.setText(String.valueOf(termohigrometro.humedadam));
            txtHumedadPM.setText(String.valueOf(termohigrometro.humedadpm));
        }        
    }//GEN-LAST:event_btnBuscarTemperaturaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(frmTermohigrometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTermohigrometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTermohigrometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTermohigrometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTermohigrometro().setVisible(true);
            }
        });
    }

    public void llenarTablaTermohigrometro(){
        
        ArrayList<Termohigrometro> listaTermohigrometro = termohigrometroController.SelectTermohigrometro();
        
        int filas = listaTermohigrometro.size();
        int columnas = 6;
        Object[][] datos = new Object[filas][columnas];
        int i = 0;
        for (Termohigrometro termohigrometro : listaTermohigrometro){
            datos[i][0] = termohigrometro.id;
            datos[i][1] = termohigrometro.fecha;
            datos[i][2] = termohigrometro.temperaturaam;
            datos[i][3] = termohigrometro.temperaturapm;
            datos[i][4] = termohigrometro.humedadam;
            datos[i][5] = termohigrometro.humedadpm;
            i++;
        }
        Object[] encabezados = {"Id", "Fecha", "Temp.AM", "Temp.PM","Hum.AM", "Hum.PM"};
        DefaultTableModel modelo = new DefaultTableModel(datos, encabezados);
        tblTemperatura.setModel(modelo);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTemperatura;
    private javax.swing.JButton btnBorrarTemperatura;
    private javax.swing.JButton btnBuscarTemperatura;
    private javax.swing.JButton btnCrearTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTabbedPane jtpTermohigrometro;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHumedadAM;
    private javax.swing.JLabel lbHumedadPM;
    private javax.swing.JLabel lbIdTemperatura;
    private javax.swing.JLabel lbTemperaturaAM;
    private javax.swing.JLabel lbTemperaturaPM;
    private javax.swing.JTable tblTemperatura;
    private javax.swing.JTextField txtHumedadAM;
    private javax.swing.JTextField txtHumedadPM;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTemperaturaAM;
    private javax.swing.JTextField txtTemperaturaPM;
    // End of variables declaration//GEN-END:variables
}
