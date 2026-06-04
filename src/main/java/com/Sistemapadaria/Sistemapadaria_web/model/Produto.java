
package com.Sistemapadaria.Sistemapadaria_web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Alterado de int para Integer (permite valores nulos no cadastro)

    private String nome;
    private String descricao;
    private double preco;

    @Column(name = "quantidade_estoque")
    private int quantidadeEstoque; 

    @Column(name = "data_cadastro")
    private String dataCadastro;

    @Column(name = "data_validade")
    private String dataValidade;

    @Column(name = "id_fornecedor")
    private Integer idFornecedor; // Alterado de int para Integer para evitar conflito caso vá vazio

    // Construtor padrão
    public Produto() {}

    // Getters e Setters Corrigidos
    public Integer getId() { 
        return id; 
    }
    
    public void setId(Integer id) { 
        this.id = id; 
    }
    
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    
    public String getDescricao() { 
        return descricao; 
    }
    
    public void setDescricao(String descricao) { 
        this.descricao = descricao; 
    }
    
    public double getPreco() { 
        return preco; 
    }
    
    public void setPreco(double preco) { 
        this.preco = preco; 
    }
    
    public int getQuantidadeEstoque() { 
        return quantidadeEstoque; 
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque) { 
        this.quantidadeEstoque = quantidadeEstoque; 
    }
    
    public String getDataCadastro() { 
        return dataCadastro; 
    }
    
    public void setDataCadastro(String dataCadastro) { 
        this.dataCadastro = dataCadastro; 
    }
    
    public String getDataValidade() { 
        return dataValidade; 
    }
    
    public void setDataValidade(String dataValidade) { 
        this.dataValidade = dataValidade; 
    }
    
    public Integer getIdFornecedor() { 
        return idFornecedor; 
    }
    
    public void setIdFornecedor(Integer idFornecedor) { 
        this.idFornecedor = idFornecedor; 
    }
}