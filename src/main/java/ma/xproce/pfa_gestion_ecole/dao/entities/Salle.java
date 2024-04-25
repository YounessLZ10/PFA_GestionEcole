package ma.xproce.pfa_gestion_ecole.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num_salle ;
    private Integer capacite ;
    private String type ;
    private String batiment ;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "etudiant_salle",
            joinColumns = @JoinColumn(name = "salle_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    private Collection<Etudiant> etudiants = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    @ManyToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;
}
