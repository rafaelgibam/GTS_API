package br.com.gestaotrading.domain;


import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.*;

@Data
@Entity(name = "PERFIL")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERFIL")
    private long id;

    @Column(name = "TP_PERFIL")
    private String tipoPerfil;

    @OneToMany
    @JsonProperty("usuario")
    private Usuario usuario; //arrayList de Usuarios

    @OneToOne
    @JsonProperty("plano_assinatura")
    private PlanoAssinatura planoAssinatura;

}
