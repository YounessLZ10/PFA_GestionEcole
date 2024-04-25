package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Etudiant;

import java.util.List;

public interface EtudiantManager {

    Etudiant ajouterEtudiant(Etudiant etudiant);
    boolean supprimerEtudiant(Etudiant etudiant);
    boolean supprimerEtudiantParId(Integer id);
    Etudiant modifierEtudiant(Etudiant etudiant);
    List<Etudiant> listerEtudiants();

    Etudiant trouverEtudiantParId(Integer id);
}
