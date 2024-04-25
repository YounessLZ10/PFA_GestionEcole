package ma.xproce.pfa_gestion_ecole.dao.repositories;

import ma.xproce.pfa_gestion_ecole.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Etudiant findByNom(String nom);

    List<Etudiant> findByPrenom(String prenom);

    List<Etudiant> findByTel(String tel);

    List<Etudiant> findByEmail(String email);

    List<Etudiant> findByFiliere(String filiere);

    List<Etudiant> findByGroupe(String groupe);

    Etudiant findByNomAndPrenom(String nom, String prenom);

    Etudiant findByNomAndTel(String nom, String tel);

    Etudiant findByEmailAndFiliere(String email, String filiere);

    Etudiant findByPrenomAndGroupe(String prenom, String groupe);

    List<Etudiant> findByFiliereAndGroupe(String filiere, String groupe);

    List<Etudiant> findByFiliereAndGroupeAndNom(String filiere, String groupe, String nom);

    List<Etudiant> findByGroupeAndTelStartingWith(String groupe, String prefix);

    void deleteByNom(String nom);

    long count();

    boolean existsByNom(String nom);
}
