package com.example.crudpizzaria.service;

import com.example.crudpizzaria.dao.UsuarioDao;
import com.example.crudpizzaria.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao dao;

    @Override @Transactional(readOnly = false)
    public void salvar(Usuario usuario) {
        dao.save(usuario);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Usuario usuario) {
        dao.update(usuario);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Usuario findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return dao.findAll();
    }
}
