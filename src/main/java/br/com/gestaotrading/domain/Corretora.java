package br.com.gestaotrading.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name = "TBGTS003_CORRETORA")
public class Corretora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CORRETORA")
	private Long id;
	
	@Column(name = "NOME_CORRETORA")
	private String nomeCorretora;
	
	@Column(name = "PROFIT_CORRETORA")
	private Integer profitCorretora;
	
	@Column(name = "META_DIA_CORRETORA")
	private Integer metaDiaCorretora;
	
	@OneToMany
	private List<Banca> banca;
	
	@OneToMany
	private List<Operacao> operacoes;
	
}
