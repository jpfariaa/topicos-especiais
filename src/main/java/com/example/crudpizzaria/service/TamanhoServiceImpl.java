package com.example.crudpizzaria.service;

import com.example.crudpizzaria.dao.TamanhoDao;
import com.example.crudpizzaria.domain.Tamanho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TamanhoServiceImpl implements TamanhoService {

    @Autowired
    private TamanhoDao dao;

    @Override
    public void salvar(Tamanho tamanho) {
        dao.save(tamanho);
    }

    @Override
    public void editar(Tamanho tamanho) {
        dao.update(tamanho);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Tamanho buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Tamanho> buscarTodos() {
        return dao.findAll();
    }
}
