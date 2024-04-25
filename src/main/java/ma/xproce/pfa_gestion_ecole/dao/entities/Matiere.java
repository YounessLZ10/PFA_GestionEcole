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
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_matiere;
    private String nom_matiere ;
    private Double Coeff_matiere ;
    private Double heures_cours ;
    private Double heures_tp ;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "etudiant_matiere",
            joinColumns = @JoinColumn(name = "matiere_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    private Collection<Etudiant> etudiants = new ArrayList<>();

    @OneToMany(mappedBy = "matiere", fetch = FetchType.LAZY)
    private Collection<Professeur> professeurs;
}
