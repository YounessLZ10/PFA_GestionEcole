package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Emploi_du_temps;

import java.util.List;

public interface EmploiDuTempsManager {

    Emploi_du_temps ajouterEmploiDuTemps(Emploi_du_temps emploiDuTemps);
    boolean supprimerEmploiDuTemps(Emploi_du_temps emploiDuTemps);
    boolean supprimerEmploiDuTempsParId(Integer id);
    Emploi_du_temps modifierEmploiDuTemps(Emploi_du_temps emploiDuTemps);
    List<Emploi_du_temps> listerEmploisDuTemps();

    Emploi_du_temps trouverEmploiDuTempsParId(Integer id);
}
