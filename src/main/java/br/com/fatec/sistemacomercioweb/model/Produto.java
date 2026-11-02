package br.com.fatec.sistemacomercioweb.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_produto")
    private Long idProduto;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque = 0;

    public Produto() {}

    public Produto(String nome, String descricao, BigDecimal preco, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void atualizaEstoque(int quant){
        if(quant>0)
            this.estoque += quant;
    }

    @Override
    public String toString() {
        return "\n Nome: "+this.nome +
                "\n Descrição: "+this.descricao +
                "\n Estoque: "+this.estoque +
                "\n Preço R$ : "+this.preco;
    }
}
