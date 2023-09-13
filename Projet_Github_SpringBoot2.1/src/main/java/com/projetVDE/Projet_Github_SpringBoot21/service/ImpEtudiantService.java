package com.projetVDE.Projet_Github_SpringBoot21.service;

import com.projetVDE.Projet_Github_SpringBoot21.model.Etudiant;
import com.projetVDE.Projet_Github_SpringBoot21.repository.EtudiantRepository;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
@Service
@AllArgsConstructor
public class ImpEtudiantService implements EtudiantService{

   @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant creer(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> lire() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant modifier(long id, Etudiant etudiant) {
        return etudiantRepository.findById(id)
                .map(E -> {
                    E.setTel(etudiant.getTel());
                    E.setMail(etudiant.getMail());
                    E.setNom(etudiant.getNom());
                    E.setAdresse(etudiant.getAdresse());
                    return etudiantRepository.save(E);
                }).orElseThrow(()-> new NullPointerException("etudiant introuvable"));
    }

    @Override
    public String supprimer(long id) {
        etudiantRepository.deleteById(id);
        return "L'etudiant à bien été supprimer";
    }
}
