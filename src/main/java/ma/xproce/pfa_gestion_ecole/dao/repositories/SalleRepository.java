package ma.xproce.pfa_gestion_ecole.dao.repositories;

import ma.xproce.pfa_gestion_ecole.dao.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Long> {
    List<Salle> findByBatiment(String batiment);

    List<Salle> findByCapaciteGreaterThanEqual(Integer capacite);

    Collection<Salle> findByEcole_IdEcole(Integer idEcole);

    Collection<Salle> findByProfesseur_IdProf(Integer idProfesseur);
}
