package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Ecole;

import java.util.List;

public interface EcoleManager {

    Ecole ajouterEcole(Ecole ecole);
    boolean supprimerEcole(Ecole ecole);
    boolean supprimerEcoleParId(Integer id);
    Ecole modifierEcole(Ecole ecole);
    List<Ecole> listerEcoles();

    Ecole trouverEcoleParId(Integer id);
}
