package com.projetVDE.Projet_Github_SpringBoot21.repository;

import com.projetVDE.Projet_Github_SpringBoot21.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
