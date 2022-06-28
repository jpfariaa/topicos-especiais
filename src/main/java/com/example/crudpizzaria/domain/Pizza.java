package com.example.crudpizzaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PIZZAS")
public class Pizza extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String preco;

    @Column(nullable = false)
    private String tamanho;

    @Column(nullable = false)
    private String tempoMedio;

    @Column
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(String tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
