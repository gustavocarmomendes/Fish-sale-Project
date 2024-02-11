/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senac.ads.peixaria.controller;

import br.pr.senac.ads.peixaria.dao.VendaDAO;
import br.pr.senac.ads.peixaria.model.Venda;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.8965
 */
public class PeixariaController {
    
    private String codigo;
    private String produto;
    private String precoUnitario;
    private String quantidade;
    private String precoTotal;
    private String caixa;
    
    public void salvar(
            String produto,
            String precoUnitario,
            String quantidade,
            String precoTotal,
            String caixa)
            throws SQLException, ParseException {
        Venda venda = new Venda();
        venda.setProduto(produto);
        venda.setPrecoUnitario(Double.parseDouble(precoUnitario));
        venda.setQuantidade(Integer.parseInt(quantidade));
        venda.setPrecoTotal(Double.parseDouble(precoTotal));
        venda.setCaixa(Double.parseDouble(caixa));
        new VendaDAO().salvar(venda);
    }
    
     public void atualizar(
            String codigo,
            String produto,
            String precoUnitario,
            String quantidade,
            String precoTotal,
            String caixa)
            throws SQLException, ParseException {
        Venda venda = new Venda();
        venda.setCodigo(Integer.parseInt(codigo));
        venda.setProduto(produto);
        venda.setPrecoUnitario(Double.parseDouble(precoUnitario));
        venda.setQuantidade(Integer.parseInt(quantidade));
        venda.setPrecoTotal(Double.parseDouble(precoTotal));
        venda.setCaixa(Double.parseDouble(caixa));
        new VendaDAO().atualizar(venda);
    }
     
    public void deletar(
            String codigo,
            String produto,
            String precoUnitario,
            String quantidade,
            String precoTotal,
            String caixa)
            throws SQLException, ParseException {
        Venda venda = new Venda();
        venda.setCodigo(Integer.parseInt(codigo));
        venda.setProduto(produto);
        venda.setPrecoUnitario(Double.parseDouble(precoUnitario));
        venda.setQuantidade(Integer.parseInt(quantidade));
        venda.setPrecoTotal(Double.parseDouble(precoTotal));
        venda.setCaixa(Double.parseDouble(caixa));
        new VendaDAO().deletar(venda);
    }
    
    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the precoUnitario
     */
    public String getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * @param precoUnitario the precoUnitario to set
     */
    public void setPrecoUnitario(String precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the precoTotal
     */
    public String getPrecoTotal() {
        return precoTotal;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(String precoTotal) {
        this.precoTotal = precoTotal;
    }

    /**
     * @return the caixa
     */
    public String getCaixa() {
        return caixa;
    }

    /**
     * @param caixa the caixa to set
     */
    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
