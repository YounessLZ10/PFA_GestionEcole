package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Salle;

import java.util.Collection;
import java.util.List;

public interface SalleManager {
    Salle ajouterSalle(Salle salle);
    boolean supprimerSalle(Salle salle);
    boolean supprimerSalleParId(Integer id);
    Salle modifierSalle(Salle salle);
    Salle trouverSalleParId(Integer id);
    List<Salle> listerSalles();
    Collection<Salle> trouverSallesParEcole(Integer idEcole);
    Collection<Salle> trouverSallesParProfesseur(Integer idProfesseur);
}