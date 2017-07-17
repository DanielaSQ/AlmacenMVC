/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Venta;

import javax.swing.JOptionPane;
import vista.VentanaPrincipal;

/**
 *
 * @author Daniela
 */
public class VentanaVenta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBusquedaVenta
     */
    public VentanaVenta() {
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

        botonVolverPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        botonListarVenta = new javax.swing.JButton();
        botonBuscarVenta = new javax.swing.JButton();
        botonAgregarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Venta");

        botonVolverPrincipal.setText("Volver");
        botonVolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPrincipalActionPerformed(evt);
            }
        });

        jLabel1.setText(" Numero de Documento :");

        botonListarVenta.setText("LISTAR");
        botonListarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarVentaActionPerformed(evt);
            }
        });

        botonBuscarVenta.setText("BUSCAR");
        botonBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarVentaActionPerformed(evt);
            }
        });

        botonAgregarVenta.setText("AGREGAR");
        botonAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolverPrincipal)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(botonListarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBuscarVenta)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(botonAgregarVenta)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botonVolverPrincipal)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListarVenta)
                    .addComponent(botonBuscarVenta))
                .addGap(18, 18, 18)
                .addComponent(botonAgregarVenta)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPrincipalActionPerformed
        VentanaPrincipal vPrincipal = new VentanaPrincipal();
        vPrincipal.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_botonVolverPrincipalActionPerformed

    private void botonAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarVentaActionPerformed
        VentanaEdicionVenta vEdicionVenta = new VentanaEdicionVenta();
        vEdicionVenta.ocultarBotonActualizar();
        vEdicionVenta.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarVentaActionPerformed

    private void botonBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarVentaActionPerformed
        VentanaDatosVenta vDatVenta = new VentanaDatosVenta();
        int nroDocto = Integer.parseInt(txtnum.getText().trim());
        
        if(nroDocto <= 0){
            JOptionPane.showMessageDialog(rootPane, "Error en el campo", "", JOptionPane.ERROR_MESSAGE);
            txtnum.setText("");            
        }else{
            vDatVenta.pasarNumDocto(nroDocto);
            vDatVenta.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonBuscarVentaActionPerformed

    private void botonListarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarVentaActionPerformed
        VentanaTablaVenta vTabVenta = new VentanaTablaVenta();
        vTabVenta.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_botonListarVentaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarVenta;
    private javax.swing.JButton botonBuscarVenta;
    private javax.swing.JButton botonListarVenta;
    private javax.swing.JButton botonVolverPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
