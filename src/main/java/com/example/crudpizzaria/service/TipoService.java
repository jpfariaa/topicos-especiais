package com.example.crudpizzaria.service;

import com.example.crudpizzaria.domain.Tipo;

import java.util.List;

public interface TipoService {

    void salvar(Tipo tipo);

    void editar(Tipo tipo);

    void excluir(Long id);

    Tipo findById(Long id);

    List<Tipo> findAll();
}
