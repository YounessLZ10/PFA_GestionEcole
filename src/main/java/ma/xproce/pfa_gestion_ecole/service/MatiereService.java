package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Matiere;
import ma.xproce.pfa_gestion_ecole.dao.repositories.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereService implements MatiereManager {

    @Autowired
    private MatiereRepository matiereRepository;

    @Override
    public Matiere ajouterMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public boolean supprimerMatiere(Matiere matiere) {
        try {
            matiereRepository.delete(matiere);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean supprimerMatiereParId(Integer id) {
        try {
            matiereRepository.deleteById(Long.valueOf(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Matiere modifierMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public List<Matiere> listerMatieres() {
        return matiereRepository.findAll();
    }

    @Override
    public Matiere trouverMatiereParId(Integer id) {
        return matiereRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
