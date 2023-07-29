package com.java.inspecao_de_saude.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MensaegmEnum {

    EXCLUSAO ("Registro Excluido Com Sucesso."),
    ALTERACAO ("Registro Alterado Com Sucesso."),
    INCLUSAO ("Registro Incluso Com Sucesso.");

    @Getter
    private String value;
}
