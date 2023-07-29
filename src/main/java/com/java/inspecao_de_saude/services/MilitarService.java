package com.java.inspecao_de_saude.services;

import com.java.inspecao_de_saude.client.MilitarClient;
import com.java.inspecao_de_saude.dto.MilitarDTO;
import com.java.inspecao_de_saude.model.InspecaoDeSaude;
import com.java.inspecao_de_saude.model.Militar;
import com.java.inspecao_de_saude.repositores.MilitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MilitarService {

    @Autowired
    private MilitarRepository militarRepository;

    @Autowired
    private MilitarClient militarClient;

    public MilitarDTO buscarInfomcaoMilitar(Long id)
            throws  Exception{
        return militarClient.buscarInformacaoMilitar(id);

    }

    public Militar salvar (MilitarDTO militarDTO, InspecaoDeSaude inspecaoDeSaude){
        Militar militar = new Militar();
        militar.setNome(militarDTO.getName());
        militar.setAltura(militarDTO.getHeight());
        militar.setPeso(militarDTO.getMass());
        militar.setCorCabelo(militarDTO.getHair_color());
        militar.setCorPele(militarDTO.getSkin_color());
        militar.setCorOlhos(militarDTO.getEye_color());
        militar.setAnoNascimento(militarDTO.getBirth_year());
        militar.setGenero(militarDTO.getGender());
        militar.setInspecaoDeSaude(inspecaoDeSaude);
        return militarRepository.save(militar);
    }



}
