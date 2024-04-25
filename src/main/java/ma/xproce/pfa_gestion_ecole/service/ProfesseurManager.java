package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Professeur;

import java.util.Collection;
import java.util.List;

public interface ProfesseurManager {
    Professeur ajouterProfesseur(Professeur professeur);
    boolean supprimerProfesseur(Professeur professeur);
    boolean supprimerProfesseurParId(Integer id);
    Professeur modifierProfesseur(Professeur professeur);
    Professeur trouverProfesseurParId(Integer id);
    List<Professeur> listerProfesseurs();
    Collection<Professeur> trouverProfesseursParEcole(Integer idEcole);
}