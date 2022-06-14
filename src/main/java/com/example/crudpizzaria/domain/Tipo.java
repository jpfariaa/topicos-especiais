package com.example.crudpizzaria.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TIPOS")
public class Tipo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_tamanho_fk")
    private Tamanho tamanho;

    @OneToMany(mappedBy = "tipo")
    private List<Pizza> pizzas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
}
