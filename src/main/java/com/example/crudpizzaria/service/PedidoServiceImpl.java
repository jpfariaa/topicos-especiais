package com.example.crudpizzaria.service;

import com.example.crudpizzaria.dao.PedidoDao;
import com.example.crudpizzaria.domain.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoDao dao;

    @Override @Transactional(readOnly = false)
    public void salvar(Pedido pedido) {
        dao.save(pedido);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Pedido pedido) {
        dao.update(pedido);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Pedido findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Pedido> findAll() {
        return dao.findAll();
    }
}
