package com.example.crudpizzaria.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/pizza/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/pizza/lista";
    }
}
