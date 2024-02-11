/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.pr.senac.ads.peixaria.view;

import br.pr.senac.ads.peixaria.controller.PeixariaController;
import br.pr.senac.ads.peixaria.dao.VendaDAO;
import br.pr.senac.ads.peixaria.model.Venda;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo Mendes
 */
public class PeixariaPesquisar extends javax.swing.JDialog {

    /**
     * Creates new form PeixariaPesquisar
     */
    public PeixariaPesquisar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    String codigoPrimario = null;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldProdutoPesqusiar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrecoUnitario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecoTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCaixa = new javax.swing.JTextField();
        jComboBoxNomeProduto = new javax.swing.JComboBox<>();
        jButtonAlterar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3), "PESQUISAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar:");

        jTextFieldProdutoPesqusiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButtonPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(0, 0, 204));
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(0, 0, 204));
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Preço Unitário", "Quantidade", "Preço Total", "Caixa"
            }
        ));
        jTableLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLista);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PRODUTO:");

        jTextFieldPrecoUnitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPrecoUnitario.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Preço Unitário:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade:");

        jTextFieldQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldQuantidade.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Preço Total:");

        jTextFieldPrecoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPrecoTotal.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Caixa:");

        jTextFieldCaixa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCaixa.setEnabled(false);

        jComboBoxNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxNomeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum...", "Tilápia", "Tambaqui", "Pacu", "Dourado", "Camarão" }));
        jComboBoxNomeProduto.setEnabled(false);

        jButtonAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(0, 0, 204));
        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(0, 0, 204));
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDeletar.setForeground(new java.awt.Color(0, 0, 204));
        jButtonDeletar.setText("DELETAR");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(0, 0, 204));
        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonVender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVender.setForeground(new java.awt.Color(153, 0, 0));
        jButtonVender.setText("HOME");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProdutoPesqusiar, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVender)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jTextFieldPrecoUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextFieldPrecoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(jLabel6)
                                            .addComponent(jTextFieldCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(jComboBoxNomeProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonAlterar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSalvar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonDeletar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldProdutoPesqusiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonVender))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        jButtonLimpar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        
        codigoPrimario = null;
        
        jTextFieldCaixa.setText("");
        jTextFieldPrecoTotal.setText("");
        jTextFieldPrecoUnitario.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldProdutoPesqusiar.setText("");
        
        jComboBoxNomeProduto.setSelectedIndex(0);
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        jButtonLimpar.setEnabled(true);
        
        String pesquisa = jTextFieldProdutoPesqusiar.getText();
        
        if (pesquisa.equals("")) {
            listarDados();
        } else {
            listarPesquisa(pesquisa);
        }
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        
        jTextFieldCaixa.setEnabled(true);
        jTextFieldPrecoTotal.setEnabled(true);
        jTextFieldPrecoUnitario.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        
        jComboBoxNomeProduto.setEnabled(true);
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        PeixariaController controlarPeixaria = new PeixariaController();
        
        controlarPeixaria.setProduto(jComboBoxNomeProduto.getSelectedItem().toString());
        controlarPeixaria.setPrecoUnitario(jTextFieldPrecoUnitario.getText());
        controlarPeixaria.setQuantidade(jTextFieldQuantidade.getText());
        controlarPeixaria.setPrecoTotal(jTextFieldPrecoTotal.getText());
        controlarPeixaria.setCaixa(jTextFieldCaixa.getText());
        controlarPeixaria.setCodigo(codigoPrimario);
        
        try {
            controlarPeixaria.atualizar(
                    controlarPeixaria.getCodigo(),
                    controlarPeixaria.getProduto(),
                    controlarPeixaria.getPrecoUnitario(),
                    controlarPeixaria.getQuantidade(),
                    controlarPeixaria.getPrecoTotal(),
                    controlarPeixaria.getCaixa());
                    JOptionPane.showMessageDialog(this, "Venda atualizada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível atualziar a venda!" + e.getLocalizedMessage());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Erro no Código fonte!" + e.getLocalizedMessage());
        }
        
        codigoPrimario = null;
        
        jTextFieldCaixa.setEnabled(false);
        jTextFieldPrecoTotal.setEnabled(false);
        jTextFieldPrecoUnitario.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);      
        jComboBoxNomeProduto.setEnabled(false);
        
        jButtonAlterar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        String pesquisa = jTextFieldProdutoPesqusiar.getText();
        
        if (pesquisa.equals("")) {
            listarDados();
        } else {
            listarPesquisa(pesquisa);
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        PeixariaController controlarPeixaria = new PeixariaController();
        
        controlarPeixaria.setProduto(jComboBoxNomeProduto.getSelectedItem().toString());
        controlarPeixaria.setPrecoUnitario(jTextFieldPrecoUnitario.getText());
        controlarPeixaria.setQuantidade(jTextFieldQuantidade.getText());
        controlarPeixaria.setPrecoTotal(jTextFieldPrecoTotal.getText());
        controlarPeixaria.setCaixa(jTextFieldCaixa.getText());
        controlarPeixaria.setCodigo(codigoPrimario);
        
        try {
            controlarPeixaria.deletar(
                    controlarPeixaria.getCodigo(),
                    controlarPeixaria.getProduto(),
                    controlarPeixaria.getPrecoUnitario(),
                    controlarPeixaria.getQuantidade(),
                    controlarPeixaria.getPrecoTotal(),
                    controlarPeixaria.getCaixa());
                    JOptionPane.showMessageDialog(this, "Venda deletada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível deletar a venda!" + e.getLocalizedMessage());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Erro no Código fonte!" + e.getLocalizedMessage());
        }
        
        jComboBoxNomeProduto.setSelectedIndex(0);
        jTextFieldCaixa.setText("");
        jTextFieldPrecoTotal.setText("");
        jTextFieldPrecoUnitario.setText("");
        jTextFieldQuantidade.setText("");
        
        codigoPrimario = null;
        
        String pesquisa = jTextFieldProdutoPesqusiar.getText();
        
        if (pesquisa.equals("")) {
            listarDados();
        } else {
            listarPesquisa(pesquisa);
        }
        
        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTableListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaMousePressed
        
        jButtonAlterar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        
        try {
            
            int selecionado = jTableLista.getSelectedRow();
            
            codigoPrimario = jTableLista.getModel().getValueAt(selecionado, 0).toString();
            jTextFieldCaixa.setText(jTableLista.getModel().getValueAt(selecionado, 5).toString());
            jTextFieldPrecoUnitario.setText(jTableLista.getModel().getValueAt(selecionado, 2).toString());
            jTextFieldQuantidade.setText(jTableLista.getModel().getValueAt(selecionado, 3).toString());
            jTextFieldPrecoTotal.setText(jTableLista.getModel().getValueAt(selecionado, 4).toString());
            
            String produto = jTableLista.getModel().getValueAt(selecionado, 1).toString();
            
            
            switch (produto) {
                case "Tilápia":
                    jComboBoxNomeProduto.setSelectedIndex(1);
                    break;
                    
                case "Tambaqui":
                    jComboBoxNomeProduto.setSelectedIndex(2);
                    break;
                    
                case "Pacu":
                    jComboBoxNomeProduto.setSelectedIndex(3);
                    break;
                    
                case "Dourado":
                    jComboBoxNomeProduto.setSelectedIndex(4);
                    break;
                    
                case "Camarão":
                    jComboBoxNomeProduto.setSelectedIndex(5);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Erro no nome do produto");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as informações");
        }
    }//GEN-LAST:event_jTableListaMousePressed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        dispose();
        Peixaria dialog = new Peixaria(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButtonVenderActionPerformed

    public void listarDados() {
        try {
            VendaDAO objVenda = new VendaDAO();
            DefaultTableModel model = (DefaultTableModel) jTableLista.getModel();
            model.setRowCount(0);
            
            ArrayList<Venda> lista = objVenda.listarTodos();
            
            for(int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[] {
                    lista.get(i).getCodigo(),
                    lista.get(i).getProduto(),
                    lista.get(i).getPrecoUnitario(),
                    lista.get(i).getQuantidade(),
                    lista.get(i).getPrecoTotal(),
                    lista.get(i).getCaixa()
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no ListarCampos!");
        }
    }
    
    public void listarPesquisa(String pesquisa) {
        try {
            VendaDAO objVenda = new VendaDAO();
            DefaultTableModel model = (DefaultTableModel) jTableLista.getModel();
            model.setRowCount(0);
            
            ArrayList<Venda> lista = objVenda.listarPesquisa(pesquisa);
            
            for(int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[] {
                    lista.get(i).getCodigo(),
                    lista.get(i).getProduto(),
                    lista.get(i).getPrecoUnitario(),
                    lista.get(i).getQuantidade(),
                    lista.get(i).getPrecoTotal(),
                    lista.get(i).getCaixa()
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no ListarCampos!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JComboBox<String> jComboBoxNomeProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTextField jTextFieldCaixa;
    private javax.swing.JTextField jTextFieldPrecoTotal;
    private javax.swing.JTextField jTextFieldPrecoUnitario;
    private javax.swing.JTextField jTextFieldProdutoPesqusiar;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
