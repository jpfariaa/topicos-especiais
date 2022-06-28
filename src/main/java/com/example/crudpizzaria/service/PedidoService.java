package com.example.crudpizzaria.service;


import com.example.crudpizzaria.domain.Pedido;

import java.util.List;

public interface PedidoService {

    void salvar(Pedido pedido);

    void editar(Pedido pedido);

    void excluir(Long id);

    Pedido findById(Long id);

    List<Pedido> findAll();
}
