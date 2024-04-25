package ma.xproce.pfa_gestion_ecole.dao.repositories;

import ma.xproce.pfa_gestion_ecole.dao.entities.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EcoleRepository extends JpaRepository<Ecole, Long> {
    Ecole findByNom(String nom);

    List<Ecole> findByDirecteur(String directeur);

    List<Ecole> findByAdresse(String adresse);

    List<Ecole> findByTelStartingWith(String prefix);

    List<Ecole> findByAdresseAndDirecteur(String adresse, String directeur);

    List<Ecole> findByAdresseOrDirecteur(String adresse, String directeur);


    List<Ecole> findByTelIsNull();

    List<Ecole> findByTelIsNotNull();

    void deleteByNom(String nom);


    long count();


    boolean existsByNom(String nom);
}
