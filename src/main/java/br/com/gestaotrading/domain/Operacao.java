package br.com.gestaotrading.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
@Entity(name = "OPERACAO")
public class Operacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_OPERACAO")
	private Long id;
	
	@Column(name = "VALOR_OPERACAO")
	@JsonProperty("valor_operacao")
	private BigDecimal valorOperacao;
	
	@Column(name = "LUCRO_OPERACAO")
	@JsonProperty("lucro_operacao")
	private BigDecimal lucroOperacao;

	@Column(name = "PAYOUT")
	@JsonProperty("payout_operacao")
	private Integer payout;

	@CreatedDate
	@Column(name = "CREATED_AT")
	@JsonProperty("created_at")
	private Date createdAt;
	
	@LastModifiedDate
	@Column(name = "UPDATED_AT")
	@JsonProperty("updated_at")
	private Date updatedAt;
	
	@OneToOne
	@JsonProperty("corretora")
	private Corretora corretora;
	
	@PrePersist
    protected void prePersist() {
        if (this.createdAt == null) createdAt = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        this.updatedAt = new Date();
    }
	
}
