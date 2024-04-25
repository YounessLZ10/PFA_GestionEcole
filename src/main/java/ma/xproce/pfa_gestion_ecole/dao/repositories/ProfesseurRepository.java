package ma.xproce.pfa_gestion_ecole.dao.repositories;

import ma.xproce.pfa_gestion_ecole.dao.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
    Professeur findByNomCompletProf(String nomCompletProf);

    Professeur findByEmail(String email);

    Collection<Professeur> findByEcoles_IdEcole(Integer idEcole);
}