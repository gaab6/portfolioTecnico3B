
import javax.swing.JOptionPane;

public class CassinoElChapo extends javax.swing.JFrame {
 String nome;
 float valor_entrada = 0;
 float troco = 0;
 int ficha = 0;
 int quantidade_10_fichas = 0;
 int quantidade_100_fichas = 0;
 int quantidade_500_fichas = 0;
    
    public CassinoElChapo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campo_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo_valor_entrada = new javax.swing.JTextField();
        label_ficha_cassino = new javax.swing.JLabel();
        botao_10_fichas = new javax.swing.JButton();
        botao_100_fichas = new javax.swing.JButton();
        botap_500_fichas = new javax.swing.JButton();
        jogar = new javax.swing.JButton();
        label_troco_cassino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        campo_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campo_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Vineta BT", 0, 16)); // NOI18N
        jLabel2.setText("Cassino El Chapo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Valor de entrada:");

        campo_valor_entrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campo_valor_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_valor_entradaActionPerformed(evt);
            }
        });

        label_ficha_cassino.setText("Fichas:");

        botao_10_fichas.setText("10 ");
        botao_10_fichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_10_fichasActionPerformed(evt);
            }
        });

        botao_100_fichas.setText("100 ");
        botao_100_fichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_100_fichasActionPerformed(evt);
            }
        });

        botap_500_fichas.setText("500 ");
        botap_500_fichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botap_500_fichasActionPerformed(evt);
            }
        });

        jogar.setText("JOGAR");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        label_troco_cassino.setText("Troco:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_valor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label_ficha_cassino, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jogar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao_10_fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(botao_100_fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(botap_500_fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_troco_cassino)
                                .addGap(59, 59, 59)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_valor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_10_fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_100_fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botap_500_fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_troco_cassino)
                    .addComponent(label_ficha_cassino))
                .addGap(18, 18, 18)
                .addComponent(jogar)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nomeActionPerformed

    private void botao_10_fichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_10_fichasActionPerformed
      comprarFichas(10);
      quantidade_10_fichas = quantidade_10_fichas + 1;
    }//GEN-LAST:event_botao_10_fichasActionPerformed

    private void botao_100_fichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_100_fichasActionPerformed
        comprarFichas(100);
        quantidade_100_fichas = quantidade_100_fichas + 1;
    }//GEN-LAST:event_botao_100_fichasActionPerformed

    private void botap_500_fichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botap_500_fichasActionPerformed
        comprarFichas(500);
        quantidade_500_fichas = quantidade_500_fichas + 1;
    }//GEN-LAST:event_botap_500_fichasActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        MenuJogos menu = new MenuJogos();
        menu.setVisible(true);
        
    }//GEN-LAST:event_jogarActionPerformed

    private void campo_valor_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_valor_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_valor_entradaActionPerformed

    
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
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CassinoElChapo().setVisible(true);
            }
        });
    }
    
    public void comprarFichas(int valor_ficha){
      nome = campo_nome.getText();
      valor_entrada = Float.parseFloat(campo_valor_entrada.getText());
      ficha = ficha + valor_ficha;
      troco = valor_entrada - ficha;
      label_ficha_cassino.setText("Fichas: " + ficha);
      label_troco_cassino.setText("Troco: " + troco);    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_100_fichas;
    private javax.swing.JButton botao_10_fichas;
    private javax.swing.JButton botap_500_fichas;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_valor_entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jogar;
    private javax.swing.JLabel label_ficha_cassino;
    private javax.swing.JLabel label_troco_cassino;
    // End of variables declaration//GEN-END:variables

    
}
