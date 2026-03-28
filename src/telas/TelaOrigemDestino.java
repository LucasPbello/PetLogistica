package telas;

import classes.OrigemDestino;
import classes.Usuario;
import dao.OrigemDestinoDAO;
import javax.swing.JOptionPane;
import permissoes.Sessao;

public class TelaOrigemDestino extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaOrigemDestino.class.getName());

    public TelaOrigemDestino() {
        initComponents();
        limparCampos();
    }

    private OrigemDestino origemDestino = new OrigemDestino();
    Usuario usuario = Sessao.getUsuario();

    public void limparCampos() {
        txtOrigem.setText("");
        txtDestino.setText("");
        txtEnderecoOrigem.setText("");
        txtEnderecoDestino.setText("");
        txtCompanhia.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblOrigem = new javax.swing.JLabel();
        txtOrigem = new javax.swing.JTextField();
        lblDestino = new javax.swing.JLabel();
        lblEnderecoOrigem = new javax.swing.JLabel();
        lblEnderecoDestino = new javax.swing.JLabel();
        txtEnderecoDestino = new javax.swing.JTextField();
        txtEnderecoOrigem = new javax.swing.JTextField();
        txtCompanhia = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblCompanhia = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PETCARGO");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setBackground(new java.awt.Color(102, 204, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("Informações da viagem");
        jLabel11.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrigem.setText("País de Origem:");
        lblOrigem.setToolTipText("País onde o pet está atualmente");
        lblOrigem.setOpaque(true);

        txtOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtOrigem.setToolTipText("Digitar país onde o pet está atualmente");
        txtOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigemActionPerformed(evt);
            }
        });

        lblDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDestino.setText("País de Desino:");
        lblDestino.setToolTipText("País de destino do pet");
        lblDestino.setOpaque(true);

        lblEnderecoOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEnderecoOrigem.setText("Endereço do país de origem:");
        lblEnderecoOrigem.setToolTipText("Endereço onde o pet se encontra");
        lblEnderecoOrigem.setOpaque(true);

        lblEnderecoDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEnderecoDestino.setText("Endereço do país de destino:");
        lblEnderecoDestino.setToolTipText("Endereço de destino do pet");
        lblEnderecoDestino.setOpaque(true);

        txtEnderecoDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEnderecoDestino.setToolTipText("Digitar endereço de destino do pet");
        txtEnderecoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoDestinoActionPerformed(evt);
            }
        });

        txtEnderecoOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEnderecoOrigem.setToolTipText("Digitar endereço onde o pet se encontra");
        txtEnderecoOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoOrigemActionPerformed(evt);
            }
        });

        txtCompanhia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCompanhia.setToolTipText("Digitar companhia aérea na qual o pet ira viajar");
        txtCompanhia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanhiaActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(102, 255, 102));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setToolTipText("Salvar os dados escritos");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 255, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setText("LIMPAR DADOS");
        btnLimpar.setToolTipText("Apagar dados escritos");
        btnLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnLista.setBackground(new java.awt.Color(102, 255, 255));
        btnLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLista.setText("LISTA DAS VIAGENS");
        btnLista.setToolTipText("Navega até a lista de viagens");
        btnLista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnVoltar.setBackground(new java.awt.Color(153, 153, 255));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.setToolTipText("Voltar até tela inicial");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblCompanhia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCompanhia.setText("Companhia aérea:");
        lblCompanhia.setToolTipText("Companhia aérea na qual o pet ira viajar");
        lblCompanhia.setOpaque(true);

        txtDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDestino.setToolTipText("Digitar país de destino do pet");
        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnLista)
                        .addGap(20, 20, 20)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOrigem)
                                .addGap(24, 24, 24)
                                .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEnderecoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnderecoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEnderecoOrigem)
                                    .addComponent(txtEnderecoDestino)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigem)
                    .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoOrigem)
                    .addComponent(txtEnderecoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoDestino)
                    .addComponent(txtEnderecoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompanhia)
                    .addComponent(txtCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnLista)
                    .addComponent(btnVoltar))
                .addGap(50, 50, 50))
        );

        jMenu1.setBackground(new java.awt.Color(0, 0, 255));
        jMenu1.setText("MENU");
        jMenu1.setToolTipText("Menu de atalhos");
        jMenu1.setOpaque(true);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem1.setText("Voltar");
        jMenuItem1.setToolTipText("Voltar para escolha de classes");
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setBackground(new java.awt.Color(255, 51, 51));
        jMenuItem2.setText("Sair");
        jMenuItem2.setToolTipText("Fechar a janela");
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaClasses(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigemActionPerformed

    private void txtEnderecoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoDestinoActionPerformed

    private void txtEnderecoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoOrigemActionPerformed

    private void txtCompanhiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanhiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanhiaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            OrigemDestinoDAO dao = new OrigemDestinoDAO();

            //  VALIDAÇÃO GERAL (ANTES DE TUDO)
            if (txtOrigem.getText().isEmpty()
                    || txtDestino.getText().isEmpty()
                    || txtEnderecoOrigem.getText().isEmpty()
                    || txtEnderecoDestino.getText().isEmpty()
                    || txtCompanhia.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha TODOS os campos!");
                return;
            }

            //  SET BÁSICO
            origemDestino.setPaisOrigem(txtOrigem.getText());
            origemDestino.setPaisDestino(txtDestino.getText());
            origemDestino.setEnderecoPaisOrigem(txtEnderecoOrigem.getText());
            origemDestino.setEnderecoPaisDestino(txtEnderecoDestino.getText());
            origemDestino.setCompanhiaAerea(txtCompanhia.getText());

            // ? SALVAR
            dao.inserir(origemDestino);

            JOptionPane.showMessageDialog(null, "Origem e Destino salvo com sucesso!");

            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaClasses(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaOrigemDestino().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCompanhia;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEnderecoDestino;
    private javax.swing.JLabel lblEnderecoOrigem;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JTextField txtCompanhia;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEnderecoDestino;
    private javax.swing.JTextField txtEnderecoOrigem;
    private javax.swing.JTextField txtOrigem;
    // End of variables declaration//GEN-END:variables
}
