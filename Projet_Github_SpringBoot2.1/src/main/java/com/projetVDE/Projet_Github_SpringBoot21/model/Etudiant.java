package com.projetVDE.Projet_Github_SpringBoot21.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "Etudiant")
@Getter
@Setter
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int tel;
    private String nom;
    private String mail;
    private String adresse;


}
