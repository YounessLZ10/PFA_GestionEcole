package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Etudiant;
import ma.xproce.pfa_gestion_ecole.dao.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService implements EtudiantManager {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public boolean supprimerEtudiant(Etudiant etudiant) {
        try {
            etudiantRepository.delete(etudiant);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean supprimerEtudiantParId(Integer id) {
        try {
            etudiantRepository.deleteById(Long.valueOf(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> listerEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant trouverEtudiantParId(Integer id) {
        return etudiantRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
