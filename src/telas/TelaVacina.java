
package telas;

import classes.Animal;
import classes.Usuario;
import classes.Vacina;
import dao.AnimalDAO;
import dao.VacinaDAO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import permissoes.Sessao;


public class TelaVacina extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaVacina.class.getName());

    public TelaVacina() {
        initComponents();
        limparCampos();
        carregarCombos();
    }

    private List<Animal> listaAnimal = new ArrayList<>();

    private Vacina vacina = new Vacina();
    Usuario usuario = Sessao.getUsuario();
    private boolean editando = false;
    private int idAtual = 0;

    public void limparCampos() {
        txtNome.setText("");
        txtMarca.setText("");
        txtAplicacao.setText("");
        txtValidade.setText("");
        txtLote.setText("");
        txtMicrochip.setText("");
        txtAplicacaoMicrochip.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblAplicacao = new javax.swing.JLabel();
        lblValidade = new javax.swing.JLabel();
        txtValidade = new javax.swing.JTextField();
        txtAplicacao = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblPet = new javax.swing.JLabel();
        cmbPet = new javax.swing.JComboBox<>();
        lblCarteirinha = new javax.swing.JLabel();
        btnCarteirinha = new javax.swing.JButton();
        lblMicrochip = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        lblLote = new javax.swing.JLabel();
        txtMicrochip = new javax.swing.JTextField();
        lblAplicacaoMicrochip = new javax.swing.JLabel();
        txtAplicacaoMicrochip = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setBackground(new java.awt.Color(102, 204, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("Informações da vacina");
        jLabel11.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome da vacina:");
        lblNome.setToolTipText("Nome da vacina aplicada");
        lblNome.setOpaque(true);

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setToolTipText("Digitar nome da vacina aplicada");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMarca.setText("Marca da vacina:");
        lblMarca.setToolTipText("Marca da vacina aplicada");
        lblMarca.setOpaque(true);

        lblAplicacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAplicacao.setText("Data de aplicação:");
        lblAplicacao.setToolTipText("Data da aplicação da vacina");
        lblAplicacao.setOpaque(true);

        lblValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValidade.setText("Data de validade:");
        lblValidade.setToolTipText("Data de validade da vacina aplicada");
        lblValidade.setOpaque(true);

        txtValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValidade.setToolTipText("Digitar data de validade da vacina aplicada");
        txtValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidadeActionPerformed(evt);
            }
        });

        txtAplicacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAplicacao.setToolTipText("Digitar data da aplicação da vacina");
        txtAplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAplicacaoActionPerformed(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMarca.setToolTipText("Digitar marca da vacina aplicada");
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
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
        btnLista.setText("LISTA DOS VACINAS");
        btnLista.setToolTipText("Navega até a lista de vacinas");
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

        lblPet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPet.setText("Pet:");
        lblPet.setToolTipText("nome do pet");
        lblPet.setOpaque(true);

        cmbPet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPet.setToolTipText("Buscar nome do pet ao qual foi aplicado a vacina");

        lblCarteirinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCarteirinha.setText("Carteirinha:");
        lblCarteirinha.setToolTipText("Carteirinha de vacina do pet");
        lblCarteirinha.setOpaque(true);

        btnCarteirinha.setText("SELECIONAR");
        btnCarteirinha.setToolTipText("Selecionar imagem da carteirinha de vacina do pet");
        btnCarteirinha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteirinhaActionPerformed(evt);
            }
        });

        lblMicrochip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMicrochip.setText("Microchip:");
        lblMicrochip.setToolTipText("Número do microchip do pet");
        lblMicrochip.setOpaque(true);

        txtLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLote.setToolTipText("Digitar número do microchip do pet");

        lblLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLote.setText("Lote:");
        lblLote.setToolTipText("Número do microchip do pet");
        lblLote.setOpaque(true);

        txtMicrochip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMicrochip.setToolTipText("Digitar número do microchip do pet");

        lblAplicacaoMicrochip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAplicacaoMicrochip.setText("Aplicação de microchip:");
        lblAplicacaoMicrochip.setToolTipText("Data de aplicação do microchip");
        lblAplicacaoMicrochip.setOpaque(true);

        txtAplicacaoMicrochip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAplicacaoMicrochip.setToolTipText("Digitar data de aplicação do microchip");

        btnAtualizar.setBackground(new java.awt.Color(255, 0, 255));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setToolTipText("Salvar os dados escritos");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMicrochip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCarteirinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblAplicacaoMicrochip)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAplicacaoMicrochip, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblLote, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtLote)
                                                    .addComponent(txtValidade)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCarteirinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMicrochip))
                                        .addGap(20, 20, 20)
                                        .addComponent(lblPet, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPet, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnLista)))
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
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLote)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAplicacao)
                    .addComponent(txtAplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidade)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMicrochip)
                    .addComponent(txtMicrochip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAplicacaoMicrochip)
                    .addComponent(txtAplicacaoMicrochip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarteirinha)
                    .addComponent(btnCarteirinha)
                    .addComponent(lblPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValidadeActionPerformed

    private void txtAplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAplicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAplicacaoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            VacinaDAO dao = new VacinaDAO();

            // VALIDAÇÃO GERAL
            if (txtNome.getText().isEmpty()
                    || txtMarca.getText().isEmpty()
                    || txtAplicacao.getText().isEmpty()
                    || txtValidade.getText().isEmpty()
                    || txtLote.getText().isEmpty()
                    || txtMicrochip.getText().isEmpty()
                    || txtAplicacaoMicrochip.getText().isEmpty()
                    || cmbPet.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(null, "Preencha TODOS os campos!");
                return;
            }

            // SET BÁSICO
            vacina.setVacinaNome(txtNome.getText());
            vacina.setVacinaMarca(txtMarca.getText());
            vacina.setLote(txtLote.getText());
            vacina.setMicrochip(txtMicrochip.getText());

            try {
                java.time.format.DateTimeFormatter formatter
                        = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

                // Datas
                vacina.setVacinaAplicacao(
                        java.time.LocalDate.parse(txtAplicacao.getText(), formatter)
                );

                vacina.setVacinaValidade(
                        java.time.LocalDate.parse(txtValidade.getText(), formatter)
                );

                vacina.setMicrochipAplicacao(
                        java.time.LocalDate.parse(txtAplicacaoMicrochip.getText(), formatter)
                );

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data inválida! Use dd/MM/yyyy");
                return;
            }

            // ANIMAL
            Animal animalSelecionado = (Animal) cmbPet.getSelectedItem();
            vacina.setAnimal(animalSelecionado);

            if (editando) {

                vacina.setIdVacina(idAtual);
                dao.atualizar(vacina);

                JOptionPane.showMessageDialog(null, "Vacina atualizada com sucesso!");

            } else {

                dao.inserir(vacina);

                JOptionPane.showMessageDialog(null, "Vacina salva com sucesso!");
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

    private void btnCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteirinhaActionPerformed
        try {
            JFileChooser fc = new JFileChooser();

            FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                    "Arquivos PDF e Imagens", "pdf", "jpg", "png"
            );
            fc.setFileFilter(filtro);

            int res = fc.showOpenDialog(null);

            if (res == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();

                byte[] dados = Files.readAllBytes(file.toPath());

                vacina.setCarteirinha(dados);

                lblCarteirinha.setText(file.getName());
            }

        } catch (IOException ex) {
            System.out.println("Erro ao ler arquivo: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCarteirinhaActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            VacinaDAO dao = new VacinaDAO();

            if (vacina.getIdVacina() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione uma vacina para atualizar!");
                return;
            }

            // ================= BASICO =================
            vacina.setVacinaNome(txtNome.getText());
            vacina.setVacinaMarca(txtMarca.getText());
            vacina.setLote(txtLote.getText());
            vacina.setMicrochip(txtMicrochip.getText());

            java.time.format.DateTimeFormatter formatter
                    = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // ================= DATAS =================
            try {
                if (!txtAplicacao.getText().isEmpty()) {
                    vacina.setVacinaAplicacao(
                            java.time.LocalDate.parse(txtAplicacao.getText(), formatter)
                    );
                }

                if (!txtValidade.getText().isEmpty()) {
                    vacina.setVacinaValidade(
                            java.time.LocalDate.parse(txtValidade.getText(), formatter)
                    );
                }

                if (!txtAplicacaoMicrochip.getText().isEmpty()) {
                    vacina.setMicrochipAplicacao(
                            java.time.LocalDate.parse(txtAplicacaoMicrochip.getText(), formatter)
                    );
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data inválida! Use dd/MM/yyyy");
                return;
            }

            // ================= ANIMAL =================
            Animal animalSelecionado = (Animal) cmbPet.getSelectedItem();
            vacina.setAnimal(animalSelecionado);

            // ================= CARTEIRINHA =================
            if (vacina.getCarteirinha() == null) {
                Vacina antiga = dao.buscarPorId(vacina.getIdVacina());
                vacina.setCarteirinha(antiga.getCarteirinha());
            }

            // ================= ATUALIZAR =================
            dao.atualizar(vacina);

            JOptionPane.showMessageDialog(null, "Vacina atualizada com sucesso!");

            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        ListaVacina fre = new ListaVacina();

        fre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaActionPerformed

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
    java.awt.EventQueue.invokeLater(() -> new TelaVacina().setVisible(true));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCarteirinha;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<classes.Animal> cmbPet;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAplicacao;
    private javax.swing.JLabel lblAplicacaoMicrochip;
    private javax.swing.JLabel lblCarteirinha;
    private javax.swing.JLabel lblLote;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMicrochip;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPet;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JTextField txtAplicacao;
    private javax.swing.JTextField txtAplicacaoMicrochip;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMicrochip;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables

    public void setVacina(Vacina v) {

        if (v == null) {
            return; // proteção
        }
        this.vacina = v;

        txtNome.setText(v.getVacinaNome());
        txtMarca.setText(v.getVacinaMarca());
        txtLote.setText(v.getLote());
        txtMicrochip.setText(v.getMicrochip());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // MICROCHIP
        if (v.getMicrochipAplicacao() != null) {
            txtAplicacaoMicrochip.setText(v.getMicrochipAplicacao().format(formatter));
        } else {
            txtAplicacaoMicrochip.setText("");
        }

        // APLICAÇÃO VACINA
        if (v.getVacinaAplicacao() != null) {
            txtAplicacao.setText(v.getVacinaAplicacao().format(formatter));
        } else {
            txtAplicacao.setText("");
        }

        // VALIDADE
        if (v.getVacinaValidade() != null) {
            txtValidade.setText(v.getVacinaValidade().format(formatter));
        } else {
            txtValidade.setText("");
        }

        // ? ANIMAL (forma mais segura)
        if (v.getAnimal() != null) {
            for (Animal a : listaAnimal) {
                if (a.getIdAnimal() == v.getAnimal().getIdAnimal()) {
                    cmbPet.setSelectedItem(a); // melhor que setSelectedIndex
                    break;
                }
            }
        }
        // CARTEIRINHA
        if (v.getCarteirinha() != null) {
            vacina.setCarteirinha(v.getCarteirinha()); // mantém no objeto
            lblCarteirinha.setText("Arquivo carregado ?");
        } else {
            lblCarteirinha.setText("Nenhum arquivo");
        }

        idAtual = v.getIdVacina();
        editando = true;

        btnSalvar.setEnabled(false);
    }

    private void carregarCombos() {

        try {
            AnimalDAO clienteDAO = new AnimalDAO();

            // limpa antes
            cmbPet.removeAllItems();

            // ? CLIENTES
            listaAnimal = clienteDAO.listar();

            for (Animal a : listaAnimal) {
                cmbPet.addItem(a);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar combos: " + e.getMessage());
        }
    }

}
