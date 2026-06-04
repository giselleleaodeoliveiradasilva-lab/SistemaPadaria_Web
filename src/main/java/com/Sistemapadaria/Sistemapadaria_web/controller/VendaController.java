
package com.Sistemapadaria.Sistemapadaria_web.controller;

import com.Sistemapadaria.Sistemapadaria_web.model.Venda;
import com.Sistemapadaria.Sistemapadaria_web.repository.VendaRepository;
import com.Sistemapadaria.Sistemapadaria_web.repository.ProdutoRepository;
import com.Sistemapadaria.Sistemapadaria_web.repository.MetodoPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/vendas")
public class VendaController {
    
    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private MetodoPagamentoRepository pagamentoRepository;

    // Lista o histórico de vendas realizadas
    @GetMapping
    public String listarVendas(Model model) {
        model.addAttribute("vendas", vendaRepository.findAll());
        return "vendas"; // Procura por vendas.html
    }

    // Abre a tela de checkout / nova venda
    @GetMapping("/nova")
    public String novaVenda(Model model) {
        model.addAttribute("venda", new Venda());
        model.addAttribute("produtos", produtoRepository.findAll()); // Para listar no <select> do HTML
        model.addAttribute("metodos", pagamentoRepository.findAll()); // Para listar as formas de pagamento
        return "registrar-venda"; // Procura por registrar-venda.html
    }

    // Salva a venda realizada e carimba a data/hora atual automaticamente
    @PostMapping("/salvar")
    public String salvarVenda(@ModelAttribute Venda venda) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        venda.setDataVenda(dtf.format(LocalDateTime.now()));
        
        vendaRepository.save(venda);
        return "redirect:/vendas";
    }
}
    

