package br.com.gestaotrading.domain;


import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

@Data
@Entity(name = "PLANOS")
public class PlanoAssinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANOS")
    private long id;

    @Column(name = "NOME_PLANO")
    private String nomePlano;

    @Column(name = "PRECO_PLANO")
    private BigDecimal precoPlano;

    @Column(name = "DATA_PLANO")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Calendar dataPlano;

    @Column(name = "FORMA_PAGAMENTO")
    private Integer formaPagamento;

    @OneToOne
    @JsonProperty("perfil")
    private Perfil perfil;



}
