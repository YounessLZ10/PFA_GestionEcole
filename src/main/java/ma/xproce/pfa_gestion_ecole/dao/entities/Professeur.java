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
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prof ;
    private String NomComplet_prof ;
    private String tel ;
    private String email ;

    @ManyToOne
    @JoinColumn(name = "matiere_id")
    private Matiere matiere;

    @OneToMany(mappedBy = "professeur", fetch = FetchType.LAZY)
    private Collection<Salle> salle;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "professeur_ecole",
            joinColumns = @JoinColumn(name = "professeur_id"),
            inverseJoinColumns = @JoinColumn(name = "ecole_id")
    )
    private Collection<Ecole> ecoles = new ArrayList<>();

    @OneToOne(mappedBy = "professeur")
    private Emploi_du_temps emploiDuTemps;

    @OneToMany(mappedBy = "professeur", fetch = FetchType.LAZY)
    private Collection<Notes> notes;
}
