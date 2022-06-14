package com.example.crudpizzaria.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tamanhos")
public class TamanhoController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/tamanho/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/tamanho/lista";
    }
}
