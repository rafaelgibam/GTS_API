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
@Entity(name = "TBGTS001_BANCA")
public class Banca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BANCA")
	private Long id;
	
	@Column(name = "VALOR_BANCA")
	private BigDecimal valorBanca;
	
	@Temporal(TemporalType.DATE)
	private Date dataFechamentoDiaBanca;
	
	@OneToOne
	private Corretora corretora;
	
}
