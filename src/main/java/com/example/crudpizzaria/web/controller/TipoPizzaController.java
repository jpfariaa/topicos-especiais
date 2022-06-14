package com.example.crudpizzaria.web.controller;

import com.example.crudpizzaria.domain.Tipo;
import com.example.crudpizzaria.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/tipos")
public class TipoPizzaController {

    @Autowired
    private TipoService tipoService;

    @GetMapping("/cadastrar")
    public String cadastrar(Tipo tipo) {
        return "/tipo/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/tipo/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Tipo tipo, RedirectAttributes attr) {
        tipoService.salvar(tipo);
        attr.addFlashAttribute("sucess", "Tipo inserido com sucesso.");
        return "redirect:/tipos/cadastrar";
    }

//    @ModelAttribute("tamanhos")
//    public List<Tamanho> listaDeTamanhos() {
//        return tamanhoService.findAll();
//    }
}
