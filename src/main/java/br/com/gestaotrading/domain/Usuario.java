package br.com.gestaotrading.domain;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.*;

@Data
@Entity(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private long id;

    @Column(name = "NOME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SENHA")
    private String senha;

    @OneToOne
    @JsonProperty("perfil")
    private Perfil perfil;


}
