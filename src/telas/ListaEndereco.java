package telas;

import classes.Cliente;
import classes.Endereco;
import dao.ClienteDAO;
import dao.EnderecoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaEndereco extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ListaEndereco.class.getName());

    public ListaEndereco() {
        initComponents();
        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrlLista = new javax.swing.JScrollPane();
        tblEndereco = new javax.swing.JTable();
        lblPesquisar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPesquisar = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniVoltar = new javax.swing.JMenuItem();
        mniSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Lista de endereços");
        jLabel1.setOpaque(true);

        tblEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rua", "Número", "Bairro", "CEP", "Cidade", "Estado", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrlLista.setViewportView(tblEndereco);

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPesquisar.setText("Pesquisar cliente por nome:");
        lblPesquisar.setToolTipText("Pesquisar cliente por nome");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisar.setToolTipText("Digitar nome do cliente a ser pesquisado");

        btnVoltar.setBackground(new java.awt.Color(153, 153, 255));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.setToolTipText("Voltar para a tela de endereços");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 0));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.setToolTipText("Botão para pesquisar endereços através do nome do cliente");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setToolTipText("Botão para excluir dados de endereço do cliente");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(255, 0, 255));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setToolTipText("Botão para atualizar dados de endereço do cliente");
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
            .addComponent(scrlLista)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(275, 275, 275))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrlLista, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addGap(40, 40, 40))
        );

        jMenu1.setBackground(new java.awt.Color(51, 51, 255));
        jMenu1.setText("MENU");
        jMenu1.setToolTipText("Menu de atalhos");
        jMenu1.setOpaque(true);

        mniVoltar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniVoltar.setBackground(new java.awt.Color(153, 153, 255));
        mniVoltar.setText("Voltar");
        mniVoltar.setToolTipText("Voltar para tela de login");
        mniVoltar.setOpaque(true);
        mniVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVoltarActionPerformed(evt);
            }
        });
        jMenu1.add(mniVoltar);

        mniSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSair.setBackground(new java.awt.Color(255, 51, 51));
        mniSair.setText("Sair");
        mniSair.setToolTipText("Fechar a janela");
        mniSair.setOpaque(true);
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        jMenu1.add(mniSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVoltarActionPerformed
        TelaEndereco fre = new TelaEndereco();

        fre.setVisible(true);
    }//GEN-LAST:event_mniVoltarActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaEndereco fre = new TelaEndereco();

        fre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String nome = txtPesquisar.getText();

            EnderecoDAO dao = new EnderecoDAO();
            DefaultTableModel modelo = (DefaultTableModel) tblEndereco.getModel();

            modelo.setRowCount(0);

            List<Endereco> lista;

            if (nome.isEmpty()) {
                lista = dao.listar();
            } else {
                lista = dao.pesquisarPorCliente(nome);
            }

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum endereço encontrado!");
                return;
            }

            for (Endereco e : lista) {
                modelo.addRow(new Object[]{
                    e.getIdEndereco(),
                    e.getRua(),
                    e.getNumero(),
                    e.getBairro(),
                    e.getCep(),
                    e.getCidade(),
                    e.getEstado(),
                    e.getCliente().getNome()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + e.getMessage());
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int linha = tblEndereco.getSelectedRow();

            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um cliente!");
                return;
            }

            int idEndereco = (int) tblEndereco.getValueAt(linha, 0);

            // Confirmação
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Tem certeza que deseja excluir?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

            // Excluir
            EnderecoDAO dao = new EnderecoDAO();
            dao.deletar(idEndereco);

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

            carregarTabela();

            // ? Atualizar tabela
            ((DefaultTableModel) tblEndereco.getModel()).removeRow(linha);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int linha = tblEndereco.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um endereço!");
            return;
        }

        // ? PEGAR APENAS O ID
        int id = (int) tblEndereco.getValueAt(linha, 0);

        // ? BUSCAR DO BANCO
        EnderecoDAO dao = new EnderecoDAO();
        Endereco e = dao.buscarPorId(id);

        // ? ABRIR TELA COM OBJETO COMPLETO
        TelaEndereco tela = new TelaEndereco();
        tela.setEndereco(e);
        tela.setVisible(true);

        this.dispose();
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
        java.awt.EventQueue.invokeLater(() -> new ListaEndereco().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenuItem mniVoltar;
    private javax.swing.JScrollPane scrlLista;
    private javax.swing.JTable tblEndereco;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    public void carregarTabela() {
        try {
            EnderecoDAO dao = new EnderecoDAO();

            DefaultTableModel modelo = (DefaultTableModel) tblEndereco.getModel();
            modelo.setRowCount(0); // limpa tabela

            for (Endereco e : dao.listar()) {
                modelo.addRow(new Object[]{
                    e.getIdEndereco(),
                    e.getRua(),
                    e.getNumero(),
                    e.getBairro(),
                    e.getCep(),
                    e.getCidade(),
                    e.getEstado(),
                    e.getCliente().getNome()
                });
            }

            tblEndereco.getColumnModel().getColumn(0).setMaxWidth(60);

            tblEndereco.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela: " + e.getMessage());
        }
    }
}
