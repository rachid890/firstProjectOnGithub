package com.projetVDE.Projet_Github_SpringBoot21.Controlleur;

import com.projetVDE.Projet_Github_SpringBoot21.model.Etudiant;

import com.projetVDE.Projet_Github_SpringBoot21.service.ImpEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {

@Autowired
    private ImpEtudiantService impEtudiantService;

@GetMapping("/read")
    public List<Etudiant> afficheretudiant() {
    return impEtudiantService.lire();
}

@PostMapping("/creat")
    public Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant) {
    return impEtudiantService.creer(etudiant);
}

@PutMapping("/update")
    public Etudiant modefierEtudiant(@PathVariable long id,Etudiant etudiant){
    return impEtudiantService.modifier(id, etudiant);
}

@DeleteMapping("/delete")
    public String suprimerEtudiant(@PathVariable long id) {
    return impEtudiantService.supprimer(id);
}
}

