
package com.Sistemapadaria.Sistemapadaria_web.controller;

import com.Sistemapadaria.Sistemapadaria_web.model.Usuario;
import com.Sistemapadaria.Sistemapadaria_web.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
public class LoginController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Exibe a tela de login (Acessível em http://localhost:8080/ ou http://localhost:8080/login)
    @GetMapping({"/", "/login"})
    public String exibirLogin() {
        return "login"; // Procura por login.html em src/main/resources/templates
    }

    // Processa os dados digitados no formulário de login
    @PostMapping("/autenticar")
    public String autenticar(@RequestParam String login, @RequestParam String senha, Model model) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByLogin(login);

        if (usuarioOpt.isPresent() && usuarioOpt.get().getSenha().equals(senha)) {
            // Se login e senha coincidirem, redireciona para a página principal/dashboard
            return "redirect:/produtos";
        } else {
            // Se errar, volta para o login com uma mensagem de erro
            model.addAttribute("erro", "Usuário ou senha inválidos!");
            return "login";
        }
    }
}

