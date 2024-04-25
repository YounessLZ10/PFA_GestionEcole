package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Salle;
import ma.xproce.pfa_gestion_ecole.dao.repositories.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class SalleService implements SalleManager {

    @Autowired
    private SalleRepository salleRepository;

    @Override
    public Salle ajouterSalle(Salle salle) {
        try {
            return salleRepository.save(salle);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public boolean supprimerSalle(Salle salle) {
        try {
            salleRepository.delete(salle);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean supprimerSalleParId(Integer id) {
        try {
            salleRepository.deleteById(Long.valueOf(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Salle modifierSalle(Salle salle) {
        try {
            return salleRepository.save(salle);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public Salle trouverSalleParId(Integer id) {
        try {
            return salleRepository.findById(Long.valueOf(id)).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public List<Salle> listerSalles() {
        try {
            return salleRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public Collection<Salle> trouverSallesParEcole(Integer idEcole) {
        try {
            return salleRepository.findByEcole_IdEcole(idEcole);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public Collection<Salle> trouverSallesParProfesseur(Integer idProfesseur) {
        try {
            return salleRepository.findByProfesseur_IdProf(idProfesseur);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }
}