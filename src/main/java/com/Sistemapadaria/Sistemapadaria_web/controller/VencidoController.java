
package com.Sistemapadaria.Sistemapadaria_web.controller;

import com.Sistemapadaria.Sistemapadaria_web.model.Vencido;
import com.Sistemapadaria.Sistemapadaria_web.repository.VencidoRepository;
import com.Sistemapadaria.Sistemapadaria_web.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/vencidos")

public class VencidoController {
    
    @Autowired
    private VencidoRepository vencidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    // Lista os descartes
    @GetMapping
    public String listarVencidos(Model model) {
        model.addAttribute("vencidos", vencidoRepository.findAll());
        return "vencidos"; // Procura por vencidos.html
    }

    // Formulario para registrar perda
    @GetMapping("/novo")
    public String novoRegistroPerda(Model model) {
        model.addAttribute("vencido", new Vencido());
        model.addAttribute("produtos", produtoRepository.findAll());
        return "registrar-vencido"; // Procura por registrar-vencido.html
    }

    // Salva o registro
    @PostMapping("/salvar")
    public String salvarVencido(@ModelAttribute Vencido vencido) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        vencido.setDataRegistro(dtf.format(LocalDate.now()));
        
        vencidoRepository.save(vencido);
        return "redirect:/vencidos";
    }
}

