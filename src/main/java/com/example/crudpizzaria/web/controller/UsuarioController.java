package com.example.crudpizzaria.web.controller;

import com.example.crudpizzaria.domain.Pizza;
import com.example.crudpizzaria.domain.Usuario;
import com.example.crudpizzaria.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/cadastrar")
    public String cadastrar(Usuario usuario) {
        return "/usuario/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("usuarios", service.findAll());
        return "/usuario/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Usuario usuario, RedirectAttributes attr) {
        service.salvar(usuario);
        attr.addFlashAttribute("success", "Pizza inserida com sucesso.");
        attr.getFlashAttributes();
        return "redirect:/usuarios/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("usuario", service.findById(id));
        return "usuario/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Usuario usuario, RedirectAttributes attributes) {
        service.editar(usuario);
        attributes.addFlashAttribute("success", "Usuario atualizado com sucesso.");
        return "redirect:/usuarios/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
        service.excluir(id);
        attr.addFlashAttribute("success", "Usuario excluído com sucesso.");
        return "redirect:/usuarios/listar";
    }
}
