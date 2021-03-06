/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Venta;

import controlador.Coordinador;
import javax.swing.JOptionPane;
import modelo.VentaVO;

/**
 *
 * @author Daniela
 */
public class VentanaDatosVenta extends javax.swing.JFrame {

    private Coordinador miCoordinador;
    /**
     * Creates new form VentanaDatosVenta
     */
    public VentanaDatosVenta() {
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
        txtNroDocto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRutV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadV = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        botonEditarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos de Venta");

        jLabel1.setText("Numero  Documento Venta :");

        txtNroDocto.setEditable(false);
        txtNroDocto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDoctoActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha de Venta :");

        txtFechaV.setEditable(false);

        jLabel3.setText("Rut Asociado a la Venta");

        txtRutV.setEditable(false);

        jLabel4.setText("Codigo de Articulo  Vendido :");

        txtCodigoV.setEditable(false);

        jLabel5.setText("Cantidad de Articulos Vendidos :");

        txtCantidadV.setEditable(false);

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonEditarVenta.setText("EDITAR");
        botonEditarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txtNroDocto)
                    .addComponent(txtFechaV)
                    .addComponent(txtRutV)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoV)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(txtCantidadV))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(botonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEditarVenta)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNroDocto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRutV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonEditarVenta))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroDoctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDoctoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDoctoActionPerformed

    private void botonEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarVentaActionPerformed
        VentanaEdicionVenta edVen = new VentanaEdicionVenta();
        
        edVen.ocultarBotonGuardar();
        edVen.pasarInformacion(Integer.parseInt(txtNroDocto.getText())
                , txtFechaV.getText()
                , txtRutV.getText()
                , Integer.parseInt(txtCodigoV.getText())
                , Integer.parseInt(txtCantidadV.getText()));
        edVen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonEditarVentaActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int nroDocto = Integer.parseInt(txtNroDocto.getText());
        miCoordinador = new Coordinador();
        boolean resultado = miCoordinador.eliminarVenta(nroDocto);
        if (resultado) {
            JOptionPane.showMessageDialog(rootPane, "Venta eliminada", "", JOptionPane.INFORMATION_MESSAGE);
            VentanaVenta vVenta = new VentanaVenta();
            vVenta.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Venta no se pudo eliminar", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDatosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDatosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDatosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDatosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDatosVenta().setVisible(true);
            }
        });
    }
    
    void pasarNumDocto(int nroDocto) {
        miCoordinador = new Coordinador();
        VentaVO ventaVO = new VentaVO();
        ventaVO = miCoordinador.obtenerVenta(nroDocto);

        txtNroDocto.setText(ventaVO.getCodigoArticulo()+"");
        txtFechaV.setText(ventaVO.getFecha());
        txtRutV.setText(ventaVO.getRut());
        txtCantidadV.setText(ventaVO.getCantidad()+"");
        txtCodigoV.setText(ventaVO.getCodigoArticulo()+"");        

        if (Integer.parseInt(txtNroDocto.getText()) <= 0){
            JOptionPane.showMessageDialog(rootPane, "EL DATO ES ERRONEO", "", JOptionPane.ERROR_MESSAGE);
            VentanaVenta vVenta = new VentanaVenta();
            vVenta.setVisible(true);
            this.dispose();
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditarVenta;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCantidadV;
    private javax.swing.JTextField txtCodigoV;
    private javax.swing.JTextField txtFechaV;
    private javax.swing.JTextField txtNroDocto;
    private javax.swing.JTextField txtRutV;
    // End of variables declaration//GEN-END:variables
}
