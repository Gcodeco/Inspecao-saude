package com.java.inspecao_de_saude.client;

import com.java.inspecao_de_saude.dto.MilitarDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;

@Component
public class MilitarClient {

    public MilitarDTO buscarInformacaoMilitar(Long id )throws  Exception{
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MilitarDTO> result = restTemplate.exchange("https://swapi.dev/api/people/ "+ id +"/?format=json", HttpMethod.GET, null, MilitarDTO.class );
        return result.getBody();
    }
}

