package telas;

import classes.Cliente;
import classes.Taxi;
import classes.Usuario;
import dao.ClienteDAO;
import dao.TaxiDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import permissoes.Sessao;

public class TelaTaxi extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaTaxi.class.getName());

    public TelaTaxi() {
        initComponents();
        limparCampos();
        carregarCombos();
    }

    private List<Cliente> listaClientes = new ArrayList<>();

    private Taxi taxi = new Taxi();
    Usuario usuario = Sessao.getUsuario();
    private boolean editando = false;
    private int idAtual = 0;

    public void limparCampos() {
        txtColeta.setText("");
        txtEntrega.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblColeta = new javax.swing.JLabel();
        txtColeta = new javax.swing.JTextField();
        lblEntrega = new javax.swing.JLabel();
        txtEntrega = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setBackground(new java.awt.Color(102, 204, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("Informações do Taxi");
        jLabel11.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblColeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblColeta.setText("Endereço de coleta:");
        lblColeta.setToolTipText("Endereço de coleta do pet");
        lblColeta.setOpaque(true);

        txtColeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtColeta.setToolTipText("Digitar endereço de coleta do pet");
        txtColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColetaActionPerformed(evt);
            }
        });

        lblEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEntrega.setText("Endereço de entrega:");
        lblEntrega.setToolTipText("Endereço de entrega do pet");
        lblEntrega.setOpaque(true);

        txtEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEntrega.setToolTipText("Digitar endereço de entrega do pet");
        txtEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntregaActionPerformed(evt);
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
        btnLista.setText("LISTA DOS TAXI");
        btnLista.setToolTipText("Navega até a lista de taxi");
        btnLista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

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

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCliente.setText("Cliente:");
        lblCliente.setToolTipText("Nome do cliente");
        lblCliente.setOpaque(true);

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCliente.setToolTipText("Buscar nome do cliente da coleta e entrega do pet");

        btnAtualizar.setBackground(new java.awt.Color(255, 0, 255));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setToolTipText("Atualizar dados de taxi");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblColeta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEntrega)
                                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtColeta)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel11)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
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
                    .addComponent(lblColeta)
                    .addComponent(txtColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntrega)
                    .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnAtualizar))
                .addGap(35, 35, 35)
                .addComponent(btnLista)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColetaActionPerformed

    private void txtEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntregaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            TaxiDAO dao = new TaxiDAO();

            //  VALIDAÇÃO GERAL (ANTES DE TUDO)
            if (txtColeta.getText().isEmpty()
                    || txtEntrega.getText().isEmpty()
                    || cmbCliente.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(null, "Preencha TODOS os campos!");
                return;
            }

            //  SET BÁSICO
            taxi.setEnderecoColeta(txtColeta.getText());
            taxi.setEnderecoEntrega(txtEntrega.getText());

            // ? CLIENTE
            int indexCliente = cmbCliente.getSelectedIndex();
            Cliente clienteSelecionado = listaClientes.get(indexCliente);

            taxi.setCliente(clienteSelecionado);

            if (editando) {

                taxi.setIdTaxi(idAtual);
                dao.atualizar(taxi);

                JOptionPane.showMessageDialog(null, "Taxi atualizado com sucesso!");

            } else {

                dao.inserir(taxi);

                JOptionPane.showMessageDialog(null, "Taxi salvo com sucesso!");
            }

            limparCampos();

            // RESETAR MODO
            editando = false;
            idAtual = 0;
            btnSalvar.setEnabled(true);

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

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        ListaTaxi fre = new ListaTaxi();

        fre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            TaxiDAO dao = new TaxiDAO();

            // VALIDAÇÃO
            if (txtColeta.getText().isEmpty()
                    || txtEntrega.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Selecionar endereço na tabela para atualizar!");
                return;
            }

            taxi.setEnderecoColeta(txtColeta.getText());
            taxi.setEnderecoEntrega(txtEntrega.getText());

            dao.atualizar(taxi);

            JOptionPane.showMessageDialog(null, "Endereço atualizado com sucesso!");

            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaTaxi().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblColeta;
    private javax.swing.JLabel lblEntrega;
    private javax.swing.JTextField txtColeta;
    private javax.swing.JTextField txtEntrega;
    // End of variables declaration//GEN-END:variables

    private void carregarCombos() {

        try {
            ClienteDAO clienteDAO = new ClienteDAO();

            // limpa antes
            cmbCliente.removeAllItems();

            // ? CLIENTES
            listaClientes = clienteDAO.listar();

            for (Cliente c : listaClientes) {
                cmbCliente.addItem(c.getNome());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar combos: " + e.getMessage());
        }
    }

    public void setTaxi(Taxi t) {
        this.taxi = t;

        txtColeta.setText(t.getEnderecoColeta());
        txtEntrega.setText(t.getEnderecoEntrega());

        // selecionar cliente no combo
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getIdCliente() == t.getCliente().getIdCliente()) {
                cmbCliente.setSelectedIndex(i);
                break;
            }
        }

        idAtual = t.getIdTaxi();
        editando = true;

        btnSalvar.setEnabled(false); // ? BLOQUEIA SALVAR

    }

}
