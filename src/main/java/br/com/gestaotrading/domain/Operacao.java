package br.com.gestaotrading.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity(name = "TBGTS002_OPERACAO")
public class Operacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_OPERACAO")
	private Long id;
	
	@Column(name = "VALOR_OPERACAO")
	private BigDecimal valorOperacao;
	
	@Column(name = "LUCRO_OPERACAO")
	private BigDecimal lucroOperacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataOperacao;
	
	@OneToOne
	private Corretora corretora;
	
}
