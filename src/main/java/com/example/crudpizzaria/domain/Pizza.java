package com.example.crudpizzaria.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PIZZAS")
public class Pizza extends AbstractEntity<Long> {

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String preco;

    @Column(nullable = false, unique = true)
    private String tamanho;

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
}
