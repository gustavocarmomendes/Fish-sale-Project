/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senac.ads.peixaria.dao;

import java.sql.SQLException;
import br.pr.senac.ads.peixaria.model.Venda;
import br.pr.senac.ads.peixaria.conn.ConnectionPeixaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.8965
 */
public class VendaDAO extends GenericDAO{
    
    Connection conn;
    
    public void salvar(Venda venda) throws SQLException {
        String insert = "INSERT INTO peixaria.venda "
                + "(produto, precoUnitario, quantidade, precoTotal, caixa)"
                + " VALUES (?,?,?,?,?);";
        save(insert,
                venda.getProduto(),
                venda.getPrecoUnitario(),
                venda.getQuantidade(),
                venda.getPrecoTotal(),
                venda.getCaixa());
    }
    
     public void atualizar(Venda venda) throws SQLException {
        String update = "UPDATE peixaria.venda "
                + "SET produto = ?, precoUnitario = ?, quantidade = ?, precoTotal = ?, caixa = ?"
                + " WHERE codigo = ?";
        update(update,
                venda.getCodigo(),
                venda.getProduto(),
                venda.getPrecoUnitario(),
                venda.getQuantidade(),
                venda.getPrecoTotal(),
                venda.getCaixa());
    }
    
    public void deletar(Venda venda) throws SQLException {
        String delet = "DELETE FROM peixaria.venda "
                + "WHERE codigo = ? and produto = ? and precoUnitario = ? and "
                + "quantidade = ? and precoTotal = ? and caixa = ?";
        delete(delet,
                venda.getCodigo(),
                venda.getProduto(),
                venda.getPrecoUnitario(),
                venda.getQuantidade(),
                venda.getPrecoTotal(),
                venda.getCaixa());
    }
    
    
    public ArrayList<Venda> listarTodos() {
        String sql = "SELECT * FROM peixaria.venda";
        ResultSet resultado;
        
        try {
            conn = ConnectionPeixaria.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            resultado = pstmt.executeQuery();
            
            while(resultado.next()) {
                Venda objVenda = new Venda();
                objVenda.setCodigo(resultado.getInt("codigo"));
                objVenda.setProduto(resultado.getString("produto"));
                objVenda.setPrecoUnitario(resultado.getDouble("precoUnitario"));
                objVenda.setQuantidade(resultado.getInt("quantidade"));
                objVenda.setPrecoTotal(resultado.getDouble("precoTotal"));
                objVenda.setCaixa(resultado.getDouble("caixa"));
                
                lista.add(objVenda);
            }
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no select do Banco de Dados!");
        }
        
        return lista;
        
    }
    
    public ArrayList<Venda> listarPesquisa(String pesquisar) {
        String sql = "SELECT * FROM peixaria.venda WHERE produto = '" + pesquisar + "';";
        ResultSet resultado;
        
        try {
            conn = ConnectionPeixaria.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            resultado = pstmt.executeQuery();
            
            while(resultado.next()) {
                Venda objVenda = new Venda();
                objVenda.setCodigo(resultado.getInt("codigo"));
                objVenda.setProduto(resultado.getString("produto"));
                objVenda.setPrecoUnitario(resultado.getDouble("precoUnitario"));
                objVenda.setQuantidade(resultado.getInt("quantidade"));
                objVenda.setPrecoTotal(resultado.getDouble("precoTotal"));
                objVenda.setCaixa(resultado.getDouble("caixa"));
                
                lista.add(objVenda);
            }
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no select do Banco de Dados!");
        }
        
        return lista;
        
    }
    
}
