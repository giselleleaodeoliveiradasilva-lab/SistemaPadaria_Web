
package com.Sistemapadaria.Sistemapadaria_web.repository;

import com.Sistemapadaria.Sistemapadaria_web.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    // Esse método vai nos ajudar a buscar o usuário pelo login na hora de validar a senha na web!
    Optional<Usuario> findByLogin(String login);
}