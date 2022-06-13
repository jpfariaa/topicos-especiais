package com.example.crudpizzaria.service;

import com.example.crudpizzaria.domain.Pizza;

import java.util.List;

public interface PizzaService {

    void salvar(Pizza pizza);

    void editar(Pizza pizza);

    void excluir(Long id);

    Pizza findById(Long id);

    List<Pizza> findAll();
}
