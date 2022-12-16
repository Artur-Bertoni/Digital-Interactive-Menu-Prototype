package panels;

import javax.swing.*;

public class a {
    private JButton button1;
    private JPanel panel1;

    public static class aulaSwing extends javax.swing.JFrame {

        public aulaSwing() {
            initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            jFrame1 = new javax.swing.JFrame();
            vlr2TXT = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            somaBut = new javax.swing.JButton();
            vlr1TXT = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            resultTXT = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            subBut = new javax.swing.JButton();
            multBut = new javax.swing.JButton();
            divBut = new javax.swing.JButton();

            javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
            jFrame1.getContentPane().setLayout(jFrame1Layout);
            jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 400, Short.MAX_VALUE)
            );
            jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE)
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            vlr2TXT.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    vlr2TXTActionPerformed(evt);
                }
            });

            jLabel1.setText("Valor 1:");

            somaBut.setText("+");
            somaBut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    somaButActionPerformed(evt);
                }
            });

            vlr1TXT.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    vlr1TXTActionPerformed(evt);
                }
            });

            jLabel2.setText("Valor 2:");

            resultTXT.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    resultTXTActionPerformed(evt);
                }
            });

            jLabel3.setText("Resultado");

            subBut.setText("-");
            subBut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    subButActionPerformed(evt);
                }
            });

            multBut.setText("x");
            multBut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    multButActionPerformed(evt);
                }
            });

            divBut.setText("/");
            divBut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    divButActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(vlr2TXT, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(vlr1TXT))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(divBut)
                        .addComponent(somaBut)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(subBut)
                                .addComponent(multBut))
                            .addGap(26, 26, 26)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(resultTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(299, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(vlr1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(somaBut)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(subBut)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(multBut)
                                        .addComponent(jLabel2)
                                        .addComponent(vlr2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(resultTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(divBut)
                    .addContainerGap(328, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void somaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaButActionPerformed
            // TODO add your handling code here:
            //JOptionPane.showMessageDialog(null, "Apertou o botão", "Notificação", JOptionPane.WARNING_MESSAGE);

            try{
                resultTXT.setText(String.valueOf(Float.parseFloat(vlr1TXT.getText()) + Float.parseFloat(vlr2TXT.getText())));
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }//GEN-LAST:event_somaButActionPerformed

        private void vlr2TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vlr2TXTActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_vlr2TXTActionPerformed

        private void vlr1TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vlr1TXTActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_vlr1TXTActionPerformed

        private void resultTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTXTActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_resultTXTActionPerformed

        private void subButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subButActionPerformed
            // TODO add your handling code here:
            try{
                resultTXT.setText(String.valueOf(Float.parseFloat(vlr1TXT.getText()) - Float.parseFloat(vlr2TXT.getText())));
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }//GEN-LAST:event_subButActionPerformed

        private void multButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multButActionPerformed
            // TODO add your handling code here:
            try{
                resultTXT.setText(String.valueOf(Float.parseFloat(vlr1TXT.getText()) * Float.parseFloat(vlr2TXT.getText())));
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }//GEN-LAST:event_multButActionPerformed

        private void divButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButActionPerformed
            // TODO add your handling code here:
            try{
                resultTXT.setText(String.valueOf(Float.parseFloat(vlr1TXT.getText()) / Float.parseFloat(vlr2TXT.getText())));
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }//GEN-LAST:event_divButActionPerformed

        public static void main(String args[]) {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(aulaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new aulaSwing().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private JButton divBut;
        private JFrame jFrame1;
        private JLabel jLabel1;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JButton multBut;
        private JTextField resultTXT;
        private JButton somaBut;
        private JButton subBut;
        private JTextField vlr1TXT;
        private JTextField vlr2TXT;
        // End of variables declaration//GEN-END:variables
    }
}
