package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Pedido;
import com.example.crudpizzaria.domain.Pizza;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoDaoImpl extends AbstractDao<Pedido, Long> implements PedidoDao {
}
