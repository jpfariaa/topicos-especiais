package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario, Long> implements UsuarioDao {
}
