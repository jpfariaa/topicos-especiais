package com.example.crudpizzaria.service;

import com.example.crudpizzaria.dao.PedidoDao;
import com.example.crudpizzaria.domain.Pedido;
import com.example.crudpizzaria.helper.ExcelHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class ExcelService {
    @Autowired
    private PedidoDao pedidoDao;

    public ByteArrayInputStream load() {
        List<Pedido> tutorials = pedidoDao.findAll();
        return ExcelHelper.pedidosToExcel(tutorials);
    }
}
