package br.com.gestaotrading.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaotrading.domain.Operacao;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long> {

}
