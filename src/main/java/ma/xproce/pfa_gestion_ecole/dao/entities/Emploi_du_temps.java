package ma.xproce.pfa_gestion_ecole.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emploi_du_temps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_matiere;
    private String nom_matiere ;
    private String jour ;
    private Double duree_seance ;
    private String heure_seance ;

    @OneToMany(mappedBy = "emploiDuTemps", fetch = FetchType.LAZY)
    private Collection<Etudiant> etudiants;

    @OneToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;
}
