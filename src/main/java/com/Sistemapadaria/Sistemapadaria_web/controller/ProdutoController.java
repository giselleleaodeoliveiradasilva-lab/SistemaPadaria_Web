
package com.Sistemapadaria.Sistemapadaria_web.controller;

import com.Sistemapadaria.Sistemapadaria_web.model.Produto;
import com.Sistemapadaria.Sistemapadaria_web.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Lista todos os produtos
    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produtos"; // Procura por produtos.html
    }

    // Abre o formulário de cadastro de novo produto
    @GetMapping("/novo")
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastro-produto"; // Procura por cadastro-produto.html
    }

    // Recebe os dados do formulário e salva no banco de dados
    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos"; // Redireciona de volta para a listagem
    }

    // Busca produtos por parte do nome (Barra de pesquisa)
    @GetMapping("/buscar")
    public String buscarProdutos(@RequestParam String nome, Model model) {
        model.addAttribute("produtos", produtoRepository.findByNomeContainingIgnoreCase(nome));
        return "produtos";
    }

    // Exclui um produto pelo ID (Corrigido para Integer)
    @GetMapping("/excluir/{id}")
public String excluirProduto(@PathVariable("id") Integer id) {
    produtoRepository.deleteById(id);
    return "redirect:/produtos";
}
}