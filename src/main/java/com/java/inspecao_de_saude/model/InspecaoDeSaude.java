package com.java.inspecao_de_saude.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InspecaoDeSaude {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idInspecao;

    @Column(name = "data_inspecao")
    private Date dataInspecao;

    @Column(name = "data_validade")
    private Date dataValidade;





}
