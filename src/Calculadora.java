
public class Calculadora extends javax.swing.JFrame {
    
    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblSinal = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jbnSomar = new javax.swing.JButton();
        jbnSubtrair = new javax.swing.JButton();
        jbnMultiplicar = new javax.swing.JButton();
        jbnDividir = new javax.swing.JButton();
        jbnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CALCULADORA");

        lblSinal.setText(":");

        jLabel2.setText("=");

        jbnSomar.setText("+");
        jbnSomar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnSomarMouseClicked(evt);
            }
        });

        jbnSubtrair.setText("-");
        jbnSubtrair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnSubtrairMouseClicked(evt);
            }
        });

        jbnMultiplicar.setText("X");
        jbnMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnMultiplicarMouseClicked(evt);
            }
        });

        jbnDividir.setText("/");
        jbnDividir.setToolTipText("");
        jbnDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnDividirMouseClicked(evt);
            }
        });

        jbnLimpar.setText("Clear");
        jbnLimpar.setToolTipText("");
        jbnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnLimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jbnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jbnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSinal)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSinal)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnSomarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnSomarMouseClicked
        // TODO add your handling code here:
        double num1, num2, operacao;
        
        lblSinal.setText("+");
        num1 = Double.parseDouble(jTextField1.getText());
        num2 = Double.parseDouble(jTextField2.getText());
        operacao = num1 + num2;
        jTextField3.setText(String.valueOf(operacao));
        desativaBotoes();
        
    }//GEN-LAST:event_jbnSomarMouseClicked

    private void jbnSubtrairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnSubtrairMouseClicked
        // TODO add your handling code here:
        double num1, num2, operacao;
        
        lblSinal.setText("-");
        num1 = Double.parseDouble(jTextField1.getText());
        num2 = Double.parseDouble(jTextField2.getText());
        operacao = num1 - num2;
        jTextField3.setText(String.valueOf(operacao));
        desativaBotoes();
        
    }//GEN-LAST:event_jbnSubtrairMouseClicked

    private void jbnMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnMultiplicarMouseClicked
        // TODO add your handling code here:
        double num1, num2, operacao;
        
        lblSinal.setText("X");
        num1 = Double.parseDouble(jTextField1.getText());
        num2 = Double.parseDouble(jTextField2.getText());
        operacao = num1 * num2;
        jTextField3.setText(String.valueOf(operacao));
        desativaBotoes();
    }//GEN-LAST:event_jbnMultiplicarMouseClicked

    private void jbnDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnDividirMouseClicked
        // TODO add your handling code here:
        double num1, num2, operacao;
        
        lblSinal.setText("/");
        num1 = Double.parseDouble(jTextField1.getText());
        num2 = Double.parseDouble(jTextField2.getText());
        operacao = num1 / num2;
        jTextField3.setText(String.valueOf(operacao));
        desativaBotoes();
    }//GEN-LAST:event_jbnDividirMouseClicked

    private void jbnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnLimparMouseClicked
        // TODO add your handling code here:
        limpaCampos();
        ativaBotoes();
    }//GEN-LAST:event_jbnLimparMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void desativaBotoes(){
        jbnSomar.setEnabled(false);
        jbnSubtrair.setEnabled(false);
        jbnMultiplicar.setEnabled(false);
        jbnDividir.setEnabled(false);
    }
    
    public void ativaBotoes(){
        jbnSomar.setEnabled(true);
        jbnSubtrair.setEnabled(true);
        jbnMultiplicar.setEnabled(true);
        jbnDividir.setEnabled(true);
    }
    
    public void limpaCampos(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        lblSinal.setText(":");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbnDividir;
    private javax.swing.JButton jbnLimpar;
    private javax.swing.JButton jbnMultiplicar;
    private javax.swing.JButton jbnSomar;
    private javax.swing.JButton jbnSubtrair;
    private javax.swing.JLabel lblSinal;
    // End of variables declaration//GEN-END:variables
}
