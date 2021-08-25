public class Roleta extends javax.swing.JFrame {
    float valor_entrada = 0;
    float valor_ficha = 0;
    int ficha = 0;
    int quantidade_100_fichas; 
    float label_troco_cassino;
    int fichas_restante;
    int label_ficha_cassino;

    
    public Roleta() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label_fichas_restante_roleta = new javax.swing.JLabel();
        label_ficha_roleta = new javax.swing.JLabel();
        escolha_numero = new javax.swing.JLabel();
        numero_aposta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Roleta");

        jButton1.setText("100");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor de entrada: 100 fichas");

        label_fichas_restante_roleta.setText("Fichas restante:");

        label_ficha_roleta.setText("Ficha:");

        escolha_numero.setText("Escolha um número de 1 a 18:");

        numero_aposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_apostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_ficha_roleta)
                        .addGap(99, 99, 99)
                        .addComponent(label_fichas_restante_roleta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escolha_numero)
                        .addGap(18, 18, 18)
                        .addComponent(numero_aposta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ficha_roleta)
                    .addComponent(label_fichas_restante_roleta))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escolha_numero)
                    .addComponent(numero_aposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        colocarFichas(100);
        quantidade_100_fichas = quantidade_100_fichas + 1;
        CassinoElChapo fichas_restante = new CassinoElChapo();
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numero_apostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_apostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_apostaActionPerformed

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
            java.util.logging.Logger.getLogger(Roleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Roleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Roleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Roleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Roleta().setVisible(true);
            }
        });
    }
     
    private void colocarFichas(int valor_fichas) {
      valor_entrada = valor_entrada + 100;    
      ficha = quantidade_100_fichas;
      fichas_restante = ficha - label_ficha_cassino;
      label_ficha_roleta.setText("Ficha: " + ficha);
      label_fichas_restante_roleta.setText("Fichas restante: " + fichas_restante);    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel escolha_numero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_ficha_roleta;
    private javax.swing.JLabel label_fichas_restante_roleta;
    private javax.swing.JTextField numero_aposta;
    // End of variables declaration//GEN-END:variables

    
}
