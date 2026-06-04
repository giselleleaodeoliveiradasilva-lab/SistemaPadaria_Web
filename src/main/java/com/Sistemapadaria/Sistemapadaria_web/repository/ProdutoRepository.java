
package com.Sistemapadaria.Sistemapadaria_web.repository;

import com.Sistemapadaria.Sistemapadaria_web.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
    // Opcional: Para a sua função de buscar por nome que você tinha no DAO:
    List<Produto> findByNomeContainingIgnoreCase(String nome);
}