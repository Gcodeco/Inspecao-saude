package com.java.inspecao_de_saude.controller;

import com.java.inspecao_de_saude.services.MilitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/militar")
public class MilitarController {


    @Autowired
    private MilitarService militarService;

    public ResponseEntity buscarInformacaoMilitar(@PathVariable Long id)
    {
        try {
            return  ResponseEntity.ok(militarService.buscarInfomcaoMilitar(id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
