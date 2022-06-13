package com.example.crudpizzaria.service;

import com.example.crudpizzaria.dao.TipoDao;
import com.example.crudpizzaria.domain.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class TipoServiceImpl implements TipoService {

    @Autowired
    private TipoDao dao;

    @Override
    public void salvar(Tipo tipo) {
        dao.save(tipo);
    }

    @Override
    public void editar(Tipo tipo) {
        dao.update(tipo);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Tipo findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Tipo> findAll() {
        return dao.findAll();
    }
}
