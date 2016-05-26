package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.MaskFormatter;

public class View_CadFuncionario extends javax.swing.JFrame {

  
    public View_CadFuncionario() {
        initComponents();
        centralizarComponente();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar1 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnDeletar1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnFechar1 = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        pnlDadosPessoais = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        txtFixo = new javax.swing.JFormattedTextField();
        pnlEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        lblUF = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        txtCEP = new javax.swing.JFormattedTextField();
        lblCEP = new javax.swing.JLabel();
        nmrNumero = new javax.swing.JSpinner();
        lblNumero = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnPesqCod = new javax.swing.JButton();

        btnEditar1.setText("Editar");
        btnEditar1.setToolTipText("Clique aqui para editar os campos");

        btnSalvar1.setText("Salvar");
        btnSalvar1.setToolTipText("Clique aqui para salvar os campos");

        btnDeletar1.setText("Deletar");
        btnDeletar1.setToolTipText("Clique aqui para deletar os campos");

        btnLimpar1.setText("Limpar");
        btnLimpar1.setToolTipText("Clique aqui para limpar os campos");

        btnFechar1.setText("Fechar");
        btnFechar1.setToolTipText("Clique aqui para fechar os campos");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setResizable(false);

        txtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCod.setText("Cód:");

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        pnlDadosPessoais.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblLogin.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblLogin.setText("Login:");

        txtLogin.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        try
        {
            MaskFormatter maskData = new MaskFormatter("###.###.###-##");
            maskData.install(txtCPF);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        lblCelular.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCelular.setText("Celular:");

        try
        {
            MaskFormatter maskData = new MaskFormatter("(##)# ####-####");
            maskData.install(txtCelular);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCelular.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblTelefone.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblTelefone.setText("Fixo:");

        try
        {
            MaskFormatter maskData = new MaskFormatter("(##)####-####");
            maskData.install(txtFixo);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtFixo.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(lblCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome))))
                .addContainerGap())
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(txtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCelular)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPF)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        pnlEndereco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        cbCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        lblUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblUF.setText("UF:");

        cbUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        try
        {
            MaskFormatter maskData = new MaskFormatter("#####-###");
            maskData.install(txtCEP);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCEP.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCEP.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCEP.setText("CEP:");

        nmrNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        nmrNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));
        nmrNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nmrNumero.setInheritsPopupMenu(true);
        nmrNumero.setOpaque(false);

        lblNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNumero.setText("Nº:");

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCEP)
                        .addGap(18, 18, 18)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lblUF)
                        .addGap(10, 10, 10)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblCidade)
                        .addGap(4, 4, 4)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRua)
                        .addGap(18, 18, 18)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCEP)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCidade))
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblUF)))
                .addGap(11, 11, 11)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRua))
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNumero)
                        .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JSpinner.NumberEditor jsEditor = (javax.swing.JSpinner.NumberEditor)nmrNumero.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);

        btnEditar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyeditar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Clique aqui para editar os campos");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easysave.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Clique aqui para salvar os campos");

        btnDeletar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyexcluir.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setToolTipText("Clique aqui para deletar os campos");

        btnLimpar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easylimpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique aqui para limpar os campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyfechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setToolTipText("Clique aqui para fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnPesqCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnPesqCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easypesq.png"))); // NOI18N
        btnPesqCod.setToolTipText("");
        btnPesqCod.setBorderPainted(false
        );
        btnPesqCod.setContentAreaFilled(false);
        btnPesqCod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesqCod.setDefaultCapable(false);
        btnPesqCod.setFocusPainted(false);
        btnPesqCod.setFocusable(false);
        btnPesqCod.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesqCod.setMaximumSize(new java.awt.Dimension(38, 44));
        btnPesqCod.setMinimumSize(null);
        btnPesqCod.setPreferredSize(new java.awt.Dimension(38, 44));
        btnPesqCod.setVerifyInputWhenFocusTarget(false);
        btnPesqCod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesqCodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesqCodMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblCod)
                        .addGap(4, 4, 4)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnEditar)
                        .addGap(6, 6, 6)
                        .addComponent(btnSalvar)
                        .addGap(6, 6, 6)
                        .addComponent(btnDeletar)
                        .addGap(6, 6, 6)
                        .addComponent(btnLimpar)
                        .addGap(5, 5, 5)
                        .addComponent(btnFechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblCod))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Object[] botoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(
            null,
            "Deseja editar este registro?",
            "Confirmação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            botoes,
            botoes[0]
        );

        if (resp == 0)
        {
            txtCod.setEnabled(true);
        }
        else
        {
            txtCod.setEnabled(false);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(
            null,
            "Deseja limpar todos os campos? ",
            "Confirmação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            botoes,
            botoes[0]
        );

        if (resp == 0)
        {
            txtCEP.setText("");
            txtCPF.setText("");
            txtCelular.setText("");
            txtEmail.setText("");
            txtFixo.setText("");
            txtLogin.setText("");
            txtNome.setText("");
            txtRua.setText("");

            if (txtCod.isEnabled() == true)
            {
                txtCod.setText("");
            }
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(
            null,
            "Deseja realmente sair? ",
            "Confirmação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            botoes,
            botoes[0]
        );

        if (resp == 0)
        {
            this.dispose();
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnPesqCodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseEntered

    }//GEN-LAST:event_btnPesqCodMouseEntered

    private void btnPesqCodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseExited

    }//GEN-LAST:event_btnPesqCodMouseExited

  
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_CadFuncionario().setVisible(true);
            }
        });
    }
    public void centralizarComponente() 
    {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JSpinner nmrNumero;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFixo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
