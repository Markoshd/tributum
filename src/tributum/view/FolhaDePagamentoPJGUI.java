/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tributum.view;

import tributum.controller.PessoaJuridicaController;

/**
 *
 * @author lucas
 */
public class FolhaDePagamentoPJGUI extends javax.swing.JFrame {
    
    private short horasTrabalhadas;
    /**
     * Creates new form FolhaDePagamentoPJGUI
     */
    public FolhaDePagamentoPJGUI() {
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
        horastrabTextField = new javax.swing.JTextField();
        calcularTextField = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valorBrutoTextField = new javax.swing.JTextField();
        irffTextField = new javax.swing.JTextField();
        pisCofIsllTextField = new javax.swing.JTextField();
        issTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Horas trabalhadas:");

        horastrabTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horastrabTextFieldActionPerformed(evt);
            }
        });

        calcularTextField.setText("Calcular");
        calcularTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor bruto:");

        jLabel3.setText("IRRF:");

        jLabel4.setText("PIS/COFINS/CSLL:");

        jLabel5.setText("ISS:");

        valorBrutoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorBrutoTextFieldActionPerformed(evt);
            }
        });

        irffTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irffTextFieldActionPerformed(evt);
            }
        });

        pisCofIsllTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisCofIsllTextFieldActionPerformed(evt);
            }
        });

        issTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calcularTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horastrabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorBrutoTextField)
                            .addComponent(irffTextField)
                            .addComponent(pisCofIsllTextField)
                            .addComponent(issTextField))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(horastrabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calcularTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valorBrutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(irffTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pisCofIsllTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(issTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irffTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irffTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irffTextFieldActionPerformed

    private void horastrabTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horastrabTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horastrabTextFieldActionPerformed

    private void calcularTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularTextFieldActionPerformed
        
        horasTrabalhadas = Short.parseShort(this.horastrabTextField.getText());
        PessoaJuridicaController.setHorasTrabalhadas(horasTrabalhadas);
       
    }//GEN-LAST:event_calcularTextFieldActionPerformed

    private void valorBrutoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorBrutoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorBrutoTextFieldActionPerformed

    private void pisCofIsllTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisCofIsllTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pisCofIsllTextFieldActionPerformed

    private void issTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FolhaDePagamentoPJGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FolhaDePagamentoPJGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FolhaDePagamentoPJGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FolhaDePagamentoPJGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FolhaDePagamentoPJGUI folhaDePagamentoPjGui =
                        new FolhaDePagamentoPJGUI();
                folhaDePagamentoPjGui.setTitle("Folha de pagamento PJ");
                folhaDePagamentoPjGui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularTextField;
    private javax.swing.JTextField horastrabTextField;
    private javax.swing.JTextField irffTextField;
    private javax.swing.JTextField issTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pisCofIsllTextField;
    private javax.swing.JTextField valorBrutoTextField;
    // End of variables declaration//GEN-END:variables
}
