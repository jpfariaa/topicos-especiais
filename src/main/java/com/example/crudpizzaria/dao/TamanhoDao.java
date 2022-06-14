package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Tamanho;

import java.util.List;

public interface TamanhoDao {

    void save(Tamanho tamanho);

    void update(Tamanho tamanho);

    void delete(Long id);

    Tamanho findById(Long id);

    List<Tamanho> findAll();

}
