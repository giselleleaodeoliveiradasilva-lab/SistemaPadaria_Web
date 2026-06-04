
package com.Sistemapadaria.Sistemapadaria_web.repository;

import com.Sistemapadaria.Sistemapadaria_web.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {
}
