package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Pizza;
import com.example.crudpizzaria.domain.Usuario;

import java.util.List;

public interface UsuarioDao {

    void save(Usuario tipo);

    void update(Usuario tipo);

    void delete(Long id);
    Usuario findById(Long id);

    List<Usuario> findAll();
}
