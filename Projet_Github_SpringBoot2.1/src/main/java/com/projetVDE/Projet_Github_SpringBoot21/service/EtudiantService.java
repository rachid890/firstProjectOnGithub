package com.projetVDE.Projet_Github_SpringBoot21.service;

import com.projetVDE.Projet_Github_SpringBoot21.model.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant creer(Etudiant etudiant);
    List<Etudiant> lire();
    Etudiant modifier(long id, Etudiant etudiant);
    String supprimer(long id);

}
