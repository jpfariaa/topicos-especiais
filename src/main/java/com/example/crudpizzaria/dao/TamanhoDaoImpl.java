package com.example.crudpizzaria.dao;

import com.example.crudpizzaria.domain.Tamanho;
import com.example.crudpizzaria.domain.Tipo;
import org.springframework.stereotype.Repository;

@Repository
public class TamanhoDaoImpl extends AbstractDao<Tamanho, Long> implements TamanhoDao {
}
