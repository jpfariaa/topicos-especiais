package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Pizza;
import org.springframework.stereotype.Repository;

@Repository
public class PizzaDaoImpl extends AbstractDao<Pizza, Long> implements PizzaDao {
}
