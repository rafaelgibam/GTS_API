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

    @Column(name = "NOME_USUARIO")
    private String nomeUsuario;

    @Column(name = "EMAIL_USUARIO")
    private String usuarioEmail;

    @Column(name = "SENHA_USUARIO")
    private String senhaUsuario;

    @OneToOne
    @JsonProperty("perfil")
    private Perfil perfil;


}
