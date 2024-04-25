package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Professeur;
import ma.xproce.pfa_gestion_ecole.dao.repositories.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ProfesseurService implements ProfesseurManager {

    @Autowired
    private ProfesseurRepository professeurRepository;

    @Override
    public Professeur ajouterProfesseur(Professeur professeur) {
        try {
            return professeurRepository.save(professeur);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public boolean supprimerProfesseur(Professeur professeur) {
        try {
            professeurRepository.delete(professeur);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean supprimerProfesseurParId(Integer id) {
        try {
            professeurRepository.deleteById(Long.valueOf(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Professeur modifierProfesseur(Professeur professeur) {
        try {
            return professeurRepository.save(professeur);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public Professeur trouverProfesseurParId(Integer id) {
        try {
            return professeurRepository.findById(Long.valueOf(id)).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public List<Professeur> listerProfesseurs() {
        try {
            return professeurRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }

    @Override
    public Collection<Professeur> trouverProfesseursParEcole(Integer idEcole) {
        try {
            return professeurRepository.findByEcoles_IdEcole(idEcole);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // ou renvoyer une exception appropriée
        }
    }
}