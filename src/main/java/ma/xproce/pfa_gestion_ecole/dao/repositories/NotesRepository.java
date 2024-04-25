package ma.xproce.pfa_gestion_ecole.dao.repositories;

import ma.xproce.pfa_gestion_ecole.dao.entities.Etudiant;
import ma.xproce.pfa_gestion_ecole.dao.entities.Matiere;
import ma.xproce.pfa_gestion_ecole.dao.entities.Notes;
import ma.xproce.pfa_gestion_ecole.dao.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesRepository extends JpaRepository<Notes, Long> {
    List<Notes> findByEtudiant(Etudiant etudiant);

    List<Notes> findByProfesseur(Professeur professeur);

    List<Notes> findByMatiere(Matiere matiere);

    List<Notes> findByEtudiant_IdEtudiant(Integer idEtudiant);

    List<Notes> findByIdMatiere(Integer idMatiere);

    List<Notes> findByEtudiant_IdEtudiantAndIdMatiere(Integer idEtudiant, Integer idMatiere);
}