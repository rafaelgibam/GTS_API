package br.com.gestaotrading.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import lombok.Data;

@Data
@Entity(name = "CORRETORA")
public class Corretora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CORRETORA")
	private Long id;

	@Column(name = "NOME_CONTA")
	@JsonProperty("nome_conta")
	private String nomeConta;
	
	@Column(name = "NOME_CORRETORA")
	@JsonProperty("nome_corretora")
	private String nomeCorretora;

	@Column(name = "PORCENTAGEM_OPERACAO")
	@JsonProperty("porcentagem_operacao")
	private Integer porcetagemOperacao;
	
	@Column(name = "META_DIA_GAIN_CORRETORA")
	@JsonProperty("meta_dia_gain_corretora")
	private Integer metaDiaGainCorretora;

	@Column(name = "META_DIA_LOSS_CORRETORA")
	@JsonProperty("meta_dia_loss_corretora")
	private Integer metaDiaLossCorretora;
	
	@Column(name = "CAPITAL")
	@JsonProperty("capital_corretora")
	private BigDecimal capitalCorretora;
	
	@OneToMany
	@JsonProperty("operacoes_corretora")
	private List<Operacao> operacoesCorretora;
	
	@CreatedDate
	@Column(name = "CREATED_AT")
	@JsonProperty("created_at")
	private Date createdAt;
	
	@LastModifiedDate
	@Column(name = "UPDATED_AT")
	@JsonProperty("updated_at")
	private Date updatedAt;
	
	
	@PrePersist
    protected void prePersist() {
        if (this.createdAt == null) createdAt = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        this.updatedAt = new Date();
    }

	
}
