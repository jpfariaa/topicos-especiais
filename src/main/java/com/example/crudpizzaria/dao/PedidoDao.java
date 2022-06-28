package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Pedido;
import com.example.crudpizzaria.domain.Pizza;

import java.util.List;

public interface PedidoDao {

    void save(Pedido tipo);

    void update(Pedido tipo);

    void delete(Long id);
    Pedido findById(Long id);

    List<Pedido> findAll();
}
