package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Pizza;

import java.util.List;

public interface PizzaDao {

    void save(Pizza tipo);

    void update(Pizza tipo);

    void delete(Long id);
    Pizza findById(Long id);

    List<Pizza> findAll();
}
