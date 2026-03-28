package telas;

import classes.Cliente;
import classes.Financeiro;
import classes.Usuario;
import dao.ClienteDAO;
import dao.FinanceiroDAO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import permissoes.Sessao;

public class TelaFinanceiro extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName());

    public TelaFinanceiro() {
        initComponents();
        limparCampos();
        carregarCombos();
        calcularLucro();
    }

    private List<Cliente> listaClientes = new ArrayList<>();

    private Financeiro financeiro = new Financeiro();
    Usuario usuario = Sessao.getUsuario();

    public void limparCampos() {
        txtClienteTotal.setText("");
        txtClienteSinal.setText("");
        txtFuncionarios.setText("");
        txtGasto.setText("");
        txtLucro.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblClienteTotal = new javax.swing.JLabel();
        txtClienteTotal = new javax.swing.JTextField();
        lblClienteSinal = new javax.swing.JLabel();
        lblFuncionarios = new javax.swing.JLabel();
        lblLucro = new javax.swing.JLabel();
        txtLucro = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtFuncionarios = new javax.swing.JTextField();
        lblGasto = new javax.swing.JLabel();
        txtGasto = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        txtClienteSinal = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PETCARGO");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setBackground(new java.awt.Color(102, 204, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("Financeiro");
        jLabel11.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblClienteTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteTotal.setText("Cliente Total:");
        lblClienteTotal.setToolTipText("Valor total que será pago pelo cliente");
        lblClienteTotal.setOpaque(true);

        txtClienteTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClienteTotal.setToolTipText("Digitar valor total que será pago pelo cliente");
        txtClienteTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteTotalKeyReleased(evt);
            }
        });

        lblClienteSinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteSinal.setText("Cliente Sinal:");
        lblClienteSinal.setToolTipText("Pagamento de sinal pelo cliente");
        lblClienteSinal.setOpaque(true);

        lblFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFuncionarios.setText("Pagamento funcionários:");
        lblFuncionarios.setToolTipText("Valor pago aos funcionários");
        lblFuncionarios.setOpaque(true);

        lblLucro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLucro.setText("Lucro:");
        lblLucro.setToolTipText("Lucro obtido com o proceso");
        lblLucro.setOpaque(true);

        txtLucro.setEditable(false);
        txtLucro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLucro.setToolTipText("Lucro obtido com o proceso");
        txtLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLucroActionPerformed(evt);
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
        btnLista.setText("LISTA FINANCEIRA");
        btnLista.setToolTipText("Navega até a lista financeira");
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

        txtFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFuncionarios.setToolTipText("Digitar valor pago aos funcionários");
        txtFuncionarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFuncionariosKeyReleased(evt);
            }
        });

        lblGasto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGasto.setText("Gasto da empresa:");
        lblGasto.setToolTipText("Gasto total com o processo");
        lblGasto.setOpaque(true);

        txtGasto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGasto.setToolTipText("Digitar valor gasto com o processo");
        txtGasto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGastoKeyReleased(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCliente.setText("Cliente:");
        lblCliente.setToolTipText("Nome do cliente");
        lblCliente.setOpaque(true);

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCliente.setToolTipText("Buscar nome do cliente desse processo");

        txtClienteSinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClienteSinal.setToolTipText("Digitar valor pago de sinal pelo cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblClienteTotal)
                                .addGap(24, 24, 24)
                                .addComponent(txtClienteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(lblClienteSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFuncionarios))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLucro)
                                        .addComponent(cmbCliente, 0, 317, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteSinal)))
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
                    .addComponent(lblClienteTotal)
                    .addComponent(txtClienteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteSinal)
                    .addComponent(txtClienteSinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncionarios)
                    .addComponent(txtFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGasto)
                    .addComponent(txtGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLucro)
                    .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnLista)
                    .addComponent(btnVoltar))
                .addGap(50, 50, 50))
        );

        txtLucro.getAccessibleContext().setAccessibleName("");

        jMenu1.setBackground(new java.awt.Color(0, 0, 255));
        jMenu1.setText("MENU");
        jMenu1.setToolTipText("Menu de atalhos");
        jMenu1.setOpaque(true);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem1.setText("Voltar");
        jMenuItem1.setToolTipText("Voltar para escolha de classes");
        jMenuItem1.setOpaque(true);
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setBackground(new java.awt.Color(255, 51, 51));
        jMenuItem2.setText("Sair");
        jMenuItem2.setToolTipText("Fechar a janela");
        jMenuItem2.setOpaque(true);
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLucroActionPerformed

    }//GEN-LAST:event_txtLucroActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            FinanceiroDAO dao = new FinanceiroDAO();

            //  VALIDAÇÃO GERAL (ANTES DE TUDO)
            if (txtClienteTotal.getText().isEmpty()
                    || txtClienteSinal.getText().isEmpty()
                    || txtFuncionarios.getText().isEmpty()
                    || txtGasto.getText().isEmpty()
                    || cmbCliente.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(null, "Preencha TODOS os campos!");
                txtLucro.setText("");
                return;
            }

            //  SET BÁSICO
            BigDecimal total = new BigDecimal(txtClienteTotal.getText().replace(",", "."));
            BigDecimal sinal = new BigDecimal(txtClienteSinal.getText().replace(",", "."));
            BigDecimal funcionarios = new BigDecimal(txtFuncionarios.getText().replace(",", "."));
            BigDecimal gasto = new BigDecimal(txtGasto.getText().replace(",", "."));

            financeiro.setClienteTotal(total);
            financeiro.setClienteSinal(sinal);
            financeiro.setPagamentoFuncionarios(funcionarios);
            financeiro.setGastoEmpresa(gasto);

            // ? CALCULAR LUCRO
            BigDecimal lucro = total.subtract(funcionarios.add(gasto));
            financeiro.setLucroTotal(lucro);

            // ? CLIENTE
            int indexCliente = cmbCliente.getSelectedIndex();
            Cliente clienteSelecionado = listaClientes.get(indexCliente);

            financeiro.setCliente(clienteSelecionado);

            // ? SALVAR
            dao.inserir(financeiro);

            JOptionPane.showMessageDialog(null, "Financeiro salvo com sucesso!");

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

    private void txtClienteTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteTotalKeyReleased
        calcularLucro();
    }//GEN-LAST:event_txtClienteTotalKeyReleased

    private void txtFuncionariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncionariosKeyReleased
        calcularLucro();
    }//GEN-LAST:event_txtFuncionariosKeyReleased

    private void txtGastoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGastoKeyReleased
        calcularLucro();
    }//GEN-LAST:event_txtGastoKeyReleased

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
        java.awt.EventQueue.invokeLater(() -> new TelaFinanceiro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lblClienteSinal;
    private javax.swing.JLabel lblClienteTotal;
    private javax.swing.JLabel lblFuncionarios;
    private javax.swing.JLabel lblGasto;
    private javax.swing.JLabel lblLucro;
    private javax.swing.JTextField txtClienteSinal;
    private javax.swing.JTextField txtClienteTotal;
    private javax.swing.JTextField txtFuncionarios;
    private javax.swing.JTextField txtGasto;
    private javax.swing.JTextField txtLucro;
    // End of variables declaration//GEN-END:variables

    private void calcularLucro() {
        try {
            BigDecimal total = new BigDecimal(txtClienteTotal.getText().replace(",", "."));
            BigDecimal funcionarios = new BigDecimal(txtFuncionarios.getText().replace(",", "."));
            BigDecimal gastos = new BigDecimal(txtGasto.getText().replace(",", "."));

            BigDecimal lucro = total.subtract(funcionarios.add(gastos));

            txtLucro.setText(lucro.toString());

        } catch (Exception e) {
            txtLucro.setText("");
        }
    }

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
}
