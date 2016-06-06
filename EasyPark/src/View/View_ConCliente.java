/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Ctrl_Autorizado;
import Controller.Ctrl_Cliente;
import Controller.Ctrl_Util;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Suporte-01
 */
public class View_ConCliente extends javax.swing.JFrame {

    /**
     * Creates new form View_ConCliente
     */
    public View_ConCliente() {
        initComponents();
        centralizarComponente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupConCliente = new javax.swing.ButtonGroup();
        rbtNome = new javax.swing.JRadioButton();
        txtFiltro = new javax.swing.JTextField();
        rbtCPF = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtgConCliente = new javax.swing.JTable();
        rbtCod = new javax.swing.JRadioButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Clientes");
        setResizable(false);

        groupConCliente.add(rbtNome);
        rbtNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        rbtNome.setText("Nome");
        rbtNome.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtNomeStateChanged(evt);
            }
        });
        rbtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNomeActionPerformed(evt);
            }
        });

        txtFiltro.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtFiltro.setForeground(java.awt.Color.lightGray);
        txtFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFiltro.setText("Informe o código do cliente");
        txtFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroFocusGained(evt);
            }
        });
        txtFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroMouseClicked(evt);
            }
        });
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        txtFiltro.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtFiltroVetoableChange(evt);
            }
        });

        groupConCliente.add(rbtCPF);
        rbtCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        rbtCPF.setText("CPF");
        rbtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCPFActionPerformed(evt);
            }
        });

        dtgConCliente.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        dtgConCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Cód", "Nome", "CPF"
            }
        ));
        jScrollPane1.setViewportView(dtgConCliente);
        if (dtgConCliente.getColumnModel().getColumnCount() > 0) {
            dtgConCliente.getColumnModel().getColumn(0).setMinWidth(80);
            dtgConCliente.getColumnModel().getColumn(0).setPreferredWidth(70);
            dtgConCliente.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        groupConCliente.add(rbtCod);
        rbtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        rbtCod.setText("Código");
        rbtCod.setSelected(true);
        rbtCod.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtCodStateChanged(evt);
            }
        });
        rbtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCodActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(rbtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(btnFechar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtCod)
                    .addComponent(rbtNome)
                    .addComponent(rbtCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(
            null,
            "Deseja realmente sair?”.",
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

    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed
        MudarTexto();
    }//GEN-LAST:event_rbtNomeActionPerformed

    private void rbtCodStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtCodStateChanged
      
    }//GEN-LAST:event_rbtCodStateChanged

    private void rbtNomeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtNomeStateChanged
    
    }//GEN-LAST:event_rbtNomeStateChanged

    private void rbtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCPFActionPerformed
        MudarTexto();
    }//GEN-LAST:event_rbtCPFActionPerformed

    private void rbtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCodActionPerformed
        MudarTexto();
    }//GEN-LAST:event_rbtCodActionPerformed

    private void txtFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMouseClicked
       txtFiltro.setText("");
       txtFiltro.setForeground(Color.black);
        if (rbtCPF.isSelected()==true) {
            txtFiltro = new JFormattedTextField(Ctrl_Util.Mascara("###.###.###-##"));   
        }
    }//GEN-LAST:event_txtFiltroMouseClicked

    private void txtFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusGained
       txtFiltro.setText("");
       txtFiltro.setForeground(Color.black);
    }//GEN-LAST:event_txtFiltroFocusGained

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed

    }//GEN-LAST:event_txtFiltroKeyPressed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        Limpar();
        Popular();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void txtFiltroVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtFiltroVetoableChange

    }//GEN-LAST:event_txtFiltroVetoableChange

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
            java.util.logging.Logger.getLogger(View_ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_ConCliente().setVisible(true);
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
    private javax.swing.JButton btnFechar;
    private javax.swing.JTable dtgConCliente;
    private javax.swing.ButtonGroup groupConCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtCPF;
    private javax.swing.JRadioButton rbtCod;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void MudarTexto() {
        
        txtFiltro.setForeground(Color.LIGHT_GRAY);
        if (rbtCod.isSelected()==true) 
        {
            txtFiltro.setText("Informe o código do cliente");
        }
        else if (rbtNome.isSelected()==true)
        {
            txtFiltro.setText("Informe o nome do cliente");
        }
        else
        {
            txtFiltro.setText("Informe o CPF do cliente");
        }                   
    }
    
    private void Limpar(){
        dtgConCliente.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {"Cód", "Nome", "CPF"}));
    }
    private void Popular(){
        List<Ctrl_Cliente> ListaDeCliente = new ArrayList<Ctrl_Cliente>();
        if (rbtCod.isSelected()==true) {
            ListaDeCliente = Model.Model_Cliente.Busca(txtFiltro.getText(),0);
        }
        if (rbtNome.isSelected()==true) {
            ListaDeCliente = Model.Model_Cliente.Busca(txtFiltro.getText(),1);
        }
        if (rbtCPF.isSelected()==true) {
            ListaDeCliente = Model.Model_Cliente.Busca(txtFiltro.getText(),2);
        }
        
        DefaultTableModel model = (DefaultTableModel) dtgConCliente.getModel();
        for (int i = 0; i < ListaDeCliente.size(); i++) {
            Object[] linha = {ListaDeCliente.get(i).getIdCliente(), ListaDeCliente.get(i).getNome(), ListaDeCliente.get(i).getCpf()};
            model.addRow(linha);
        }
        dtgConCliente.setModel(model);
    }

    


}


