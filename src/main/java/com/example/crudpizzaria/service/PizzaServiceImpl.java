package com.example.crudpizzaria.service;


import com.example.crudpizzaria.dao.PizzaDao;
import com.example.crudpizzaria.domain.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = true)
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaDao dao;

    @Override @Transactional(readOnly = false)
    public void salvar(Pizza pizza) {
        dao.save(pizza);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Pizza pizza) {
        dao.update(pizza);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Pizza findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Pizza> findAll() {
        return dao.findAll();
    }
}
