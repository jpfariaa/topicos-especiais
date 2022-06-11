package com.example.crudpizzaria.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tipos")
public class TipoPizzaController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/tipo/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/tipo/lista";
    }
}
