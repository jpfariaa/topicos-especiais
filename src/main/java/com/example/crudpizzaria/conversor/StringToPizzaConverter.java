package com.example.crudpizzaria.conversor;

import com.example.crudpizzaria.domain.Pizza;
import com.example.crudpizzaria.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

@Component
public class StringToPizzaConverter implements Converter<String, Pizza> {

    @Autowired
    private PizzaService service;

    @Override
    public Pizza convert(String source) {
        Long id = Long.valueOf(source);
        return service.findById(id);
    }
}
