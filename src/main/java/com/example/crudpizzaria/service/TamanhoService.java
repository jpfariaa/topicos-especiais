package com.example.crudpizzaria.service;

import com.example.crudpizzaria.domain.Tamanho;

import java.util.List;

public interface TamanhoService {

    void salvar(Tamanho tamanho);

    void editar(Tamanho tamanho);

    void excluir(Long id);

    Tamanho buscarPorId(Long id);

    List<Tamanho> buscarTodos();

}
