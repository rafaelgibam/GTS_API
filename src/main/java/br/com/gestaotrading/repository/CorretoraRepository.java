package br.com.gestaotrading.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaotrading.domain.Corretora;


@Repository
public interface CorretoraRepository extends JpaRepository<Corretora, Long>{

}
