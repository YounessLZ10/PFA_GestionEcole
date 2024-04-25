package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Emploi_du_temps;
import ma.xproce.pfa_gestion_ecole.dao.repositories.EmploiDuTempsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploiDuTempsService implements EmploiDuTempsManager {

    @Autowired
    private EmploiDuTempsRepository emploiDuTempsRepository;

    @Override
    public Emploi_du_temps ajouterEmploiDuTemps(Emploi_du_temps emploiDuTemps) {
        return emploiDuTempsRepository.save(emploiDuTemps);
    }

    @Override
    public boolean supprimerEmploiDuTemps(Emploi_du_temps emploiDuTemps) {
        try {
            emploiDuTempsRepository.delete(emploiDuTemps);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean supprimerEmploiDuTempsParId(Integer id) {
        try {
            emploiDuTempsRepository.deleteById(Long.valueOf(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Emploi_du_temps modifierEmploiDuTemps(Emploi_du_temps emploiDuTemps) {
        return emploiDuTempsRepository.save(emploiDuTemps);
    }

    @Override
    public List<Emploi_du_temps> listerEmploisDuTemps() {
        return emploiDuTempsRepository.findAll();
    }

    @Override
    public Emploi_du_temps trouverEmploiDuTempsParId(Integer id) {
        return emploiDuTempsRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
