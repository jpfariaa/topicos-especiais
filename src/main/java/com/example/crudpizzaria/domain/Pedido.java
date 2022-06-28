package com.example.crudpizzaria.domain;


import javax.persistence.*;

@Entity
@Table(name = "CABECALHO_PEDIDO")
public class Pedido extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String idMesa;

    @Column(nullable = false)
    private String valorTotal;

    @Column
    private String valorDesconto;

    @ManyToOne
    @JoinColumn(name = "id_pizza_fk")
    private Pizza pizzaPedido;

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        this.idMesa = idMesa;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Pizza getPizzaPedido() {
        return pizzaPedido;
    }

    public void setPizzaPedido(Pizza pizzaPedido) {
        this.pizzaPedido = pizzaPedido;
    }
}
