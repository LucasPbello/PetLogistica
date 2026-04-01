package telas;

import classes.OrigemDestino;
import dao.OrigemDestinoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaOrigemDestino extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ListaOrigemDestino.class.getName());

    /**
     * Creates new form ListaOrigemDestino
     */
    public ListaOrigemDestino() {
        initComponents();
        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrlLista = new javax.swing.JScrollPane();
        tblViagens = new javax.swing.JTable();
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
        jLabel1.setText("Lista de viagens");
        jLabel1.setOpaque(true);

        tblViagens.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblViagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "País origem", "País destino", "Endereço origem", "Endereço destino", "Companhia áerea", "Pet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrlLista.setViewportView(tblViagens);

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPesquisar.setText("Pesquisar por animal:");
        lblPesquisar.setToolTipText("Pesquisar cliente por nome");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisar.setToolTipText("Digitar nome do cliente a ser pesquisado");

        btnVoltar.setBackground(new java.awt.Color(153, 153, 255));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.setToolTipText("Voltar para a tela de clientes");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 0));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.setToolTipText("Botão para pesquisar cliente");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setToolTipText("Botão para excluir dados do cliente");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(255, 0, 255));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setToolTipText("Botão para atualizar dados do cliente");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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
    }// </editor-fold>//GEN-END:initComponents

    private void mniVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVoltarActionPerformed
        TelaOrigemDestino fre = new TelaOrigemDestino();

        fre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniVoltarActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaOrigemDestino fre = new TelaOrigemDestino();

        fre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String pesquisa = txtPesquisar.getText().toLowerCase();

            OrigemDestinoDAO dao = new OrigemDestinoDAO();
            DefaultTableModel modelo = (DefaultTableModel) tblViagens.getModel();

            modelo.setRowCount(0); // limpa tabela

            List<OrigemDestino> lista = dao.listar();

            for (OrigemDestino o : lista) {

                String nomeAnimal = "";

                if (o.getAnimal() != null) {
                    nomeAnimal = o.getAnimal().getNome().toLowerCase();
                }

                // ? FILTRO PELO NOME DO ANIMAL
                if (pesquisa.isEmpty() || nomeAnimal.contains(pesquisa)) {

                    modelo.addRow(new Object[]{
                        o.getIdOrigemDestino(),
                        o.getPaisOrigem(),
                        o.getPaisDestino(),
                        o.getEnderecoPaisOrigem(),
                        o.getEnderecoPaisDestino(),
                        o.getCompanhiaAerea(),
                        o.getAnimal() != null ? o.getAnimal().getNome() : "Sem animal"
                    });
                }
            }

            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma viagem encontrada!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + e.getMessage());
        }


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int linha = tblViagens.getSelectedRow();

            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma viagem!");
                return;
            }

            int idOrigemDestino = (int) tblViagens.getValueAt(linha, 0);

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
            OrigemDestinoDAO dao = new OrigemDestinoDAO();
            dao.deletar(idOrigemDestino);

            JOptionPane.showMessageDialog(null, "Viagem excluída com sucesso!");

            // ? Atualizar tabela
            ((DefaultTableModel) tblViagens.getModel()).removeRow(linha);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int linha = tblViagens.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um animal!");
            return;
        }

        // Pegando dados da tabela
        int id = (int) tblViagens.getValueAt(linha, 0);
        String paisOrigem = (String) tblViagens.getValueAt(linha, 1);
        String paisDestino = (String) tblViagens.getValueAt(linha, 2);
        String enderecoPaisOrigem = (String) tblViagens.getValueAt(linha, 3);
        String enderecoPaisDestino = (String) tblViagens.getValueAt(linha, 4);
        String companhiaAerea = (String) tblViagens.getValueAt(linha, 5);

        OrigemDestino o = new OrigemDestino();
        o.setIdOrigemDestino(id);
        o.setPaisOrigem(paisOrigem);
        o.setPaisDestino(paisDestino);
        o.setEnderecoPaisOrigem(enderecoPaisOrigem);
        o.setEnderecoPaisDestino(enderecoPaisDestino);
        o.setCompanhiaAerea(companhiaAerea);

        // Abrir tela passando o cliente
        TelaOrigemDestino tela = new TelaOrigemDestino();
        tela.setOrigemDestino(o);
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
        java.awt.EventQueue.invokeLater(() -> new ListaOrigemDestino().setVisible(true));
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
    private javax.swing.JTable tblViagens;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private void carregarTabela() {
        try {
            OrigemDestinoDAO dao = new OrigemDestinoDAO();
            DefaultTableModel modelo = (DefaultTableModel) tblViagens.getModel();

            modelo.setRowCount(0);

            List<OrigemDestino> lista = dao.listar();

            for (OrigemDestino o : lista) {
                modelo.addRow(new Object[]{
                    o.getIdOrigemDestino(),
                    o.getPaisOrigem(),
                    o.getPaisDestino(),
                    o.getEnderecoPaisOrigem(),
                    o.getEnderecoPaisDestino(),
                    o.getCompanhiaAerea(),
                    o.getAnimal() != null ? o.getAnimal().getNome() : "Sem animal"
                });
            }
            tblViagens.getColumnModel().getColumn(0).setMaxWidth(60);

            tblViagens.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela: " + e.getMessage());
        }
    }

}
