package com.java.inspecao_de_saude.dto;

import lombok.Data;

import java.time.Instant;
import java.util.Date;

@Data
public class InspecaoDeSaudeDTO {

    private Date dataInspecao;

    private Date dataValidade;

    private MilitarDTO militarDTO;

}
