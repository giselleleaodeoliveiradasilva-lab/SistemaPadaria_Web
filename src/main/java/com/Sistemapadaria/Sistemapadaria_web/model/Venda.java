
package com.Sistemapadaria.Sistemapadaria_web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "venda")

public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_produto")
    private int idProduto;

    private int quantidade;

    @Column(name = "data_venda")
    private String dataVenda;

    @Column(name = "valor_total")
    private double valorTotal;

    @Column(name = "id_metodo_pagamento")
    private int idMetodoPagamento;

    public Venda() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getIdProduto() { return idProduto; }
    public void setIdProduto(int idProduto) { this.idProduto = idProduto; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public String getDataVenda() { return dataVenda; }
    public void setDataVenda(String dataVenda) { this.dataVenda = dataVenda; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
    public int getIdMetodoPagamento() { return idMetodoPagamento; }
    public void setIdMetodoPagamento(int idMetodoPagamento) { this.idMetodoPagamento = idMetodoPagamento; }
}

