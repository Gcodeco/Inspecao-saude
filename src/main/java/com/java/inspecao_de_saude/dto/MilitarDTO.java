package com.java.inspecao_de_saude.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class MilitarDTO {


    private  Long id;

    private String name;

    private Double height;

    private Double mass;

    private String hair_color;

    private String skin_color;

    private String eye_color;

    private String birth_year;

    private String gender;
}
