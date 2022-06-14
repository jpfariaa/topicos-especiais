package com.example.crudpizzaria.web.controller;

import com.example.crudpizzaria.domain.Pizza;
import com.example.crudpizzaria.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService service;

    @GetMapping("/cadastrar")
    public String cadastrar(Pizza pizza) {
        return "/pizza/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("pizzas", service.findAll());
        return "/pizza/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Pizza pizza, RedirectAttributes attr) {
        service.salvar(pizza);
        attr.addFlashAttribute("success", "Pizza inserida com sucesso.");
        return "redirect:/pizzas/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("pizza", service.findById(id));
        return "pizza/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Pizza pizza, RedirectAttributes attributes) {
        service.editar(pizza);
        attributes.addFlashAttribute("success", "Pizza atualizada com sucesso.");
        return "redirect:/pizzas/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
        service.excluir(id);
        attr.addFlashAttribute("success", "Pizza excluída com sucesso.");
        return "redirect:/pizzas/listar";
    }

}
