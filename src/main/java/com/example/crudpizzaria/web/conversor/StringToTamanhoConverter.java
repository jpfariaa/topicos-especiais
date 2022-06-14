package com.example.crudpizzaria.web.conversor;

import com.example.crudpizzaria.domain.Tamanho;
import com.example.crudpizzaria.service.TamanhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToTamanhoConverter implements Converter<String, Tamanho> {

    @Autowired
    private TamanhoService service;

    @Override
    public Tamanho convert(String text) {
        if (text.isEmpty()) {
            return null;
        }
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }
}
