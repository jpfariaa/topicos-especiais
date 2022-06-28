package com.example.crudpizzaria.service;

import com.example.crudpizzaria.domain.Pizza;
import com.example.crudpizzaria.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    void salvar(Usuario usuario);

    void editar(Usuario usuario);

    void excluir(Long id);

    Usuario findById(Long id);

    List<Usuario> findAll();
}
