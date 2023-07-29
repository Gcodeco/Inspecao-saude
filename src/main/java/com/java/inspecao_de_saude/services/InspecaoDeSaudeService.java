package com.java.inspecao_de_saude.services;

import com.java.inspecao_de_saude.client.MilitarClient;
import com.java.inspecao_de_saude.dto.InspecaoDeSaudeDTO;
import com.java.inspecao_de_saude.dto.MilitarDTO;
import com.java.inspecao_de_saude.model.InspecaoDeSaude;
import com.java.inspecao_de_saude.model.Militar;
import com.java.inspecao_de_saude.repositores.InspecaoDeSaudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspecaoDeSaudeService {

    @Autowired
    private MilitarService militarService;

    @Autowired
    private InspecaoDeSaudeRepository inspecaoDeSaudeRepository;


    public void salvar (InspecaoDeSaudeDTO inspecaoDeSaudeDTO)throws Exception{

        InspecaoDeSaude inspecaoDeSaude = new InspecaoDeSaude();
        inspecaoDeSaude.setDataInspecao(inspecaoDeSaudeDTO.getDataInspecao());
        inspecaoDeSaude.setDataValidade(inspecaoDeSaudeDTO.getDataValidade());

        InspecaoDeSaude inspecaoDeSaudeSalva = inspecaoDeSaudeRepository.save(inspecaoDeSaude);

        MilitarDTO militarDTO = null;
        if(inspecaoDeSaudeDTO.getMilitarDTO() != null){
            militarDTO = militarService.buscarInfomcaoMilitar(inspecaoDeSaudeDTO.getMilitarDTO().getId());
        }else {
            militarDTO = inspecaoDeSaudeDTO.getMilitarDTO();
        }
        militarService.salvar(militarDTO, inspecaoDeSaudeSalva);
    }







}
