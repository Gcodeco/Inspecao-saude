package com.java.inspecao_de_saude.controller;

import com.java.inspecao_de_saude.dto.InspecaoDeSaudeDTO;
import com.java.inspecao_de_saude.enums.MensaegmEnum;
import com.java.inspecao_de_saude.services.InspecaoDeSaudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inspecao")
public class InspecaoDeSaudeController {


    @Autowired
    private InspecaoDeSaudeService inspecaoDeSaudeService;

    @PostMapping("/salvar")
    public ResponseEntity salvar(@RequestBody InspecaoDeSaudeDTO inspecaoDeSaudeDTO){
        try {
            inspecaoDeSaudeService.salvar(inspecaoDeSaudeDTO);
            return ResponseEntity.ok(MensaegmEnum.INCLUSAO.getValue());

        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
