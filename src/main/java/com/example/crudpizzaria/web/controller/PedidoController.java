package com.example.crudpizzaria.web.controller;

import com.example.crudpizzaria.domain.Pedido;
import com.example.crudpizzaria.domain.Pizza;
import com.example.crudpizzaria.service.PedidoService;
import com.example.crudpizzaria.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/cadastrar")
    public String cadastrar(Pedido pedido) {
        return "/pedido/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("pedidos", service.findAll());
        return "/pedido/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Pedido pedido, RedirectAttributes attr) {
        service.salvar(pedido);
        attr.addFlashAttribute("success", "Pedido inserido com sucesso.");
        attr.getFlashAttributes();
        return "redirect:/pedidos/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("pedido", service.findById(id));
        return "pedido/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Pedido pedido, RedirectAttributes attributes) {
        service.editar(pedido);
        attributes.addFlashAttribute("success", "Pedido atualizado com sucesso.");
        return "redirect:/pedidos/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
        service.excluir(id);
        attr.addFlashAttribute("success", "Pedido excluído com sucesso.");
        return "redirect:/pedidos/listar";
    }

    @ModelAttribute("pizzas")
    public List<Pizza> listaDeDepartamentos() {
        return pizzaService.findAll();
    }
}
