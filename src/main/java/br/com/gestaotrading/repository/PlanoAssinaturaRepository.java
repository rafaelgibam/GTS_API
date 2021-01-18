package br.com.gestaotrading.repository;

import br.com.gestaotrading.domain.PlanoAssinatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoAssinaturaRepository extends JpaRepository<PlanoAssinatura, Long> {
}
