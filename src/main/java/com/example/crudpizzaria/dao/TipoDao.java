package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Tipo;

import java.util.List;

public interface TipoDao {

    void save(Tipo tipo);

    void update(Tipo tipo);

    void delete(Long id);
    Tipo findById(Long id);

    List<Tipo> findAll();

}
