package br.com.gestaotrading.repository;

import br.com.gestaotrading.domain.Funcionalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionalidadeRepository extends JpaRepository<Funcionalidade, Long> {
}
