/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Suporte-01
 */
public class View_CadVaga extends javax.swing.JFrame {

    /**
     * Creates new form View_CadVaga
     */
    public View_CadVaga() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        lblPreco = new javax.swing.JLabel();
        lblTipoVaga = new javax.swing.JLabel();
        cbTipoVaga = new javax.swing.JComboBox<>();
        btnFechar = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        btnPesqCod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCod.setText("Cód:");

        txtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        try
        {
            MaskFormatter maskData = new MaskFormatter("###,##");
            maskData.install(txtPreco);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtPreco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblPreco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblPreco.setText("Preço:");

        lblTipoVaga.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblTipoVaga.setText("Tipo Vaga:");

        cbTipoVaga.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbTipoVaga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"MOTO", "CARRO"}));

        btnFechar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyfechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setToolTipText("Clique aqui para fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblDescricao.setText("Descrição");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addGap(4, 4, 4)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoVaga)
                        .addGap(4, 4, 4)
                        .addComponent(cbTipoVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblPreco)
                        .addGap(4, 4, 4)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(6, 6, 6)
                        .addComponent(btnSalvar)
                        .addGap(6, 6, 6)
                        .addComponent(btnDeletar)
                        .addGap(6, 6, 6)
                        .addComponent(btnLimpar)
                        .addGap(6, 6, 6)
                        .addComponent(btnFechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblCod))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoVaga)
                            .addComponent(lblPreco))))
                .addGap(18, 18, 18)
                .addComponent(lblDescricao)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        
        
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
     
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesqCodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseEntered

    }//GEN-LAST:event_btnPesqCodMouseEntered

    private void btnPesqCodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseExited

    }//GEN-LAST:event_btnPesqCodMouseExited

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
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_CadVaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbTipoVaga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTipoVaga;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtCod;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
