package br.com.gestaotrading.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "PERFIL")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERFIL")
    private long id;

    @Column(name = "TP_PERFIL")
    private String tipo_perfil;




}
