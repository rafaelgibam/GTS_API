package br.com.gestaotrading.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaotrading.domain.Banca;

@Repository
public interface BancaRepository extends JpaRepository<Banca, Long> {

}
