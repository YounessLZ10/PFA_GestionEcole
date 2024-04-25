package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Matiere;

import java.util.List;

public interface MatiereManager {

    Matiere ajouterMatiere(Matiere matiere);
    boolean supprimerMatiere(Matiere matiere);
    boolean supprimerMatiereParId(Integer id);
    Matiere modifierMatiere(Matiere matiere);
    List<Matiere> listerMatieres();

    Matiere trouverMatiereParId(Integer id);
}
