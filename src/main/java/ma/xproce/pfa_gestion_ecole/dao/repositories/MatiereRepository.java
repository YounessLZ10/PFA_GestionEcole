package ma.xproce.pfa_gestion_ecole.dao.repositories;

import ma.xproce.pfa_gestion_ecole.dao.entities.Etudiant;
import ma.xproce.pfa_gestion_ecole.dao.entities.Matiere;
import ma.xproce.pfa_gestion_ecole.dao.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
    Matiere findByNomMatiere(String nomMatiere);

    List<Matiere> findByCoeffMatiere(Double coeffMatiere);

    List<Matiere> findByHeuresCours(Double heuresCours);

    List<Matiere> findByHeuresTp(Double heuresTp);

    List<Matiere> findByCoeffMatiereGreaterThanEqual(Double coeffMatiere);

    List<Matiere> findByHeuresCoursGreaterThanEqual(Double heuresCours);

    List<Matiere> findByHeuresTpGreaterThanEqual(Double heuresTp);

    List<Matiere> findByNomMatiereContaining(String nomMatiere);

    void deleteByNomMatiere(String nomMatiere);

    long count();

    boolean existsByNomMatiere(String nomMatiere);
}
