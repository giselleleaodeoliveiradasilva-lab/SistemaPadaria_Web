
package com.Sistemapadaria.Sistemapadaria_web.repository;

import com.Sistemapadaria.Sistemapadaria_web.model.Vencido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VencidoRepository extends JpaRepository<Vencido, Integer> {
}
