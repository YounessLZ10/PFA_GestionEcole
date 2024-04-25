package ma.xproce.pfa_gestion_ecole.service;

import ma.xproce.pfa_gestion_ecole.dao.entities.Ecole;
import ma.xproce.pfa_gestion_ecole.dao.repositories.EcoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcoleService implements EcoleManager {

    @Autowired
    private EcoleRepository ecoleRepository;

    @Override
    public Ecole ajouterEcole(Ecole ecole) {
        return ecoleRepository.save(ecole);
    }

    @Override
    public boolean supprimerEcole(Ecole ecole) {
        try {
            ecoleRepository.delete(ecole);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean supprimerEcoleParId(Integer id) {
        try {
            ecoleRepository.deleteById(Long.valueOf(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Ecole modifierEcole(Ecole ecole) {
        return ecoleRepository.save(ecole);
    }

    @Override
    public List<Ecole> listerEcoles() {
        return ecoleRepository.findAll();
    }

    @Override
    public Ecole trouverEcoleParId(Integer id) {
        return ecoleRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
