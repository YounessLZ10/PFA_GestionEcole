package ma.xproce.pfa_gestion_ecole.dao.repositories;

import ma.xproce.pfa_gestion_ecole.dao.entities.Emploi_du_temps;
import ma.xproce.pfa_gestion_ecole.dao.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmploiDuTempsRepository extends JpaRepository<Emploi_du_temps, Long> {
    Emploi_du_temps findByNomMatiere(String nomMatiere);

    List<Emploi_du_temps> findByJour(String jour);

    List<Emploi_du_temps> findByDureeSeance(Double dureeSeance);

    List<Emploi_du_temps> findByHeureSeance(String heureSeance);

    Emploi_du_temps findByNomMatiereAndJour(String nomMatiere, String jour);

    Emploi_du_temps findByNomMatiereAndHeureSeance(String nomMatiere, String heureSeance);

    List<Emploi_du_temps> findByJourAndDureeSeance(String jour, Double dureeSeance);

    List<Emploi_du_temps> findByJourAndHeureSeance(String jour, String heureSeance);

    List<Emploi_du_temps> findByDureeSeanceAndHeureSeance(Double dureeSeance, String heureSeance);

    void deleteByNomMatiere(Integer nomMatiere);

    long count();

    boolean existsByNomMatiere(Integer nomMatiere);
}
