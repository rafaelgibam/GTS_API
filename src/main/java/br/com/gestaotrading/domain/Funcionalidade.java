package br.com.gestaotrading.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "FUNCIONALIDADE")
public class Funcionalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FUNCIONALIDADE")
    private Long id;


}
