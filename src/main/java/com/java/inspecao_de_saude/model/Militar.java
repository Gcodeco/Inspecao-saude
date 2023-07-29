package com.java.inspecao_de_saude.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Militar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String nome;

    private Double altura;

    private Double peso;

    private String corCabelo;

    private String corPele;

    private String corOlhos;

    private String anoNascimento;

    private String genero;

    @ManyToOne
    @JoinColumn(name = "id_inspecao_de_saude")
    private  InspecaoDeSaude inspecaoDeSaude;


}
