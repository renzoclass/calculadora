
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Labor
 */
public class calculadorA_IU extends javax.swing.JFrame {

    /**
     * Creates new form calculador
     */
    public calculadorA_IU() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtNRO1 = new javax.swing.JTextField();
        txtNRO2 = new javax.swing.JTextField();
        btnSUMAR = new javax.swing.JButton();
        btnRESTAR = new javax.swing.JButton();
        btnDIVIDIR = new javax.swing.JButton();
        btnMULTIPLICAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NRO1");

        jLabel2.setText("NRO2");

        btnSUMAR.setText("SUMAR");
        btnSUMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUMARActionPerformed(evt);
            }
        });

        btnRESTAR.setText("RESTAR");
        btnRESTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESTARActionPerformed(evt);
            }
        });

        btnDIVIDIR.setText("DIVIDIR");
        btnDIVIDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIVIDIRActionPerformed(evt);
            }
        });

        btnMULTIPLICAR.setText("MULTIPLICAR");
        btnMULTIPLICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMULTIPLICARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSUMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRESTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMULTIPLICAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDIVIDIR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNRO2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNRO1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNRO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNRO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRESTAR)
                    .addComponent(btnDIVIDIR)
                    .addComponent(btnMULTIPLICAR)
                    .addComponent(btnSUMAR))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUMARActionPerformed
        // TODO add your handling code here:
        double nro1 = Double.parseDouble(txtNRO1.getText());
        double nro2 = Double.parseDouble(txtNRO2.getText());

        double suma = nro1 + nro2;

        JOptionPane.showMessageDialog(this, "La suma es: " + suma);

        txtNRO1.setText("");
        txtNRO2.setText("");
    }//GEN-LAST:event_btnSUMARActionPerformed

    private void btnRESTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESTARActionPerformed
        // TODO add your handling code here:
        double nro1 = Double.parseDouble(txtNRO1.getText());
        double nro2 = Double.parseDouble(txtNRO2.getText());

        double resta = nro1 - nro2;

        JOptionPane.showMessageDialog(this, "La resta es: " + resta);

    }//GEN-LAST:event_btnRESTARActionPerformed

    private void btnMULTIPLICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULTIPLICARActionPerformed
        // TODO add your handling code here:
        double nro1 = Double.parseDouble(txtNRO1.getText());
        double nro2 = Double.parseDouble(txtNRO2.getText());

        double multiplicacion = nro1 * nro2;

        JOptionPane.showMessageDialog(this, "La multiplicacion es: " + multiplicacion);

    }//GEN-LAST:event_btnMULTIPLICARActionPerformed

    private void btnDIVIDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVIDIRActionPerformed
        // TODO add your handling code here:
        double nro1 = Double.parseDouble(txtNRO1.getText());
        double nro2 = Double.parseDouble(txtNRO2.getText());

        double divicion = nro1 / nro2;

        JOptionPane.showMessageDialog(this, "La divicion es: " + divicion);

    }//GEN-LAST:event_btnDIVIDIRActionPerformed

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
            java.util.logging.Logger.getLogger(calculadorA_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadorA_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadorA_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadorA_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadorA_IU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDIVIDIR;
    private javax.swing.JButton btnMULTIPLICAR;
    private javax.swing.JButton btnRESTAR;
    private javax.swing.JButton btnSUMAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNRO1;
    private javax.swing.JTextField txtNRO2;
    // End of variables declaration//GEN-END:variables
}
