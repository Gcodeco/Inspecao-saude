package com.java.inspecao_de_saude.repositores;

import com.java.inspecao_de_saude.model.Militar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilitarRepository extends JpaRepository<Militar, Long> {
}
