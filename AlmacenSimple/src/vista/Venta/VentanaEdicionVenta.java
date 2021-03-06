/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Venta;

import controlador.Coordinador;
import javax.swing.JOptionPane;
import modelo.ArticuloVO;
import modelo.VentaVO;

/**
 *
 * @author Daniela
 */
public class VentanaEdicionVenta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEdicionVenta
     */
    public VentanaEdicionVenta() {
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
        txtNumVen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaVen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRutVen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoVen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadVen = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edicion de las Ventas");

        jLabel1.setText("Numero Documento de Venta :");

        txtNumVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumVenActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha de Venta :");

        jLabel3.setText("Rut asociado a la Venta :");

        txtRutVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutVenActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo de Articulo de Vendido :");

        jLabel5.setText("Cantidad de Articulo Vendido :");

        txtCantidadVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVenActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonActualizar.setText("ACTUALIZAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumVen)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaVen)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRutVen)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(txtCodigoVen)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidadVen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRutVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(botonGuardar)
                    .addComponent(botonActualizar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutVenActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VentanaVenta ventas = new VentanaVenta();
        ventas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        VentaVO ventaVO = new VentaVO();
        Coordinador miCoordinador = new Coordinador();

        int nroDocto = Integer.parseInt(txtNumVen.getText());
        String fecha = txtFechaVen.getText().trim();
        String rut = txtRutVen.getText().trim();
        int codigoArticulo = Integer.parseInt(txtCodigoVen.getText());
        int cantidadCompra = Integer.parseInt(txtCantidadVen.getText());

        ventaVO.setNroDocto(nroDocto);
        ventaVO.setFecha(fecha);
        ventaVO.setRut(rut);
        ventaVO.setCodigoArticulo(codigoArticulo);
        ventaVO.setCantidad(cantidadCompra);

        //verificar entrada de datos nulos
        if ((ventaVO.getNroDocto() <= 0)
                || ventaVO.getFecha() == null || ventaVO.getFecha().equals("")
                || ventaVO.getRut() == null || ventaVO.getRut().equals("")
                || (ventaVO.getCodigoArticulo() <= 0)
                || (ventaVO.getCantidad() <= 0)) {

            JOptionPane.showMessageDialog(rootPane, "Error en los campos", "", JOptionPane.ERROR_MESSAGE);
        } else {
            //verificar articulo
            ArticuloVO articuloComprado = new ArticuloVO();
            articuloComprado = miCoordinador.obtenerArticulo(codigoArticulo);
            //verificar existencias
            if (articuloComprado.getCantidadExistente() >= 1) {
                //verificar cantidad de compra sea menor o igual a existencias
                if (cantidadCompra <= articuloComprado.getCantidadExistente()) {
                    
                    if (miCoordinador.agregarVenta(ventaVO)) { // <====//SE EFECTUA VENTA
                        JOptionPane.showMessageDialog(rootPane, "Venta agregada", "", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Venta no se pudo agregar", "", JOptionPane.ERROR_MESSAGE);
                        VentanaVenta ventas = new VentanaVenta();
                        ventas.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cantidad de compras supera existencias", "", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "NO HAY EXISTENCIAS", "", JOptionPane.ERROR_MESSAGE);
                VentanaVenta ventas = new VentanaVenta();
                ventas.setVisible(true);
                this.dispose();
            }
        }

        VentanaVenta ventanita = new VentanaVenta();
        ventanita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void txtNumVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumVenActionPerformed

    private void txtCantidadVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVenActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEdicionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEdicionVenta().setVisible(true);
            }
        });
    }

    void pasarInformacion(int nroDocto, String fecha, String rut, int codigoArticulo, int cantidad) {
        this.txtNumVen.setText(nroDocto + "");
        this.txtFechaVen.setText(fecha);
        this.txtRutVen.setText(rut);
        this.txtCodigoVen.setText(codigoArticulo + "");
        this.txtCantidadVen.setText(cantidad + "");
    }

    void ocultarBotonActualizar() {
        this.botonActualizar.setVisible(false);
        this.botonGuardar.setVisible(true);
    }

    void ocultarBotonGuardar() {
        this.botonActualizar.setVisible(true);
        this.botonGuardar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCantidadVen;
    private javax.swing.JTextField txtCodigoVen;
    private javax.swing.JTextField txtFechaVen;
    private javax.swing.JTextField txtNumVen;
    private javax.swing.JTextField txtRutVen;
    // End of variables declaration//GEN-END:variables
}
