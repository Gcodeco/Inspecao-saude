package com.java.inspecao_de_saude.repositores;

import com.java.inspecao_de_saude.model.InspecaoDeSaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspecaoDeSaudeRepository extends JpaRepository<InspecaoDeSaude, Long> {
}
