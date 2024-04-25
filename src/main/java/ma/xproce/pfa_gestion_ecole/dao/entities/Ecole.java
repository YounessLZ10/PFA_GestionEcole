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
public class Ecole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ecole;
    private String nom ;
    private String adresse ;
    private String directeur ;
    private String tel ;

    @OneToMany(mappedBy = "ecole", fetch = FetchType.LAZY)
    private Collection<Etudiant> etudiants;

    @ManyToMany(mappedBy = "ecoles", fetch = FetchType.EAGER)
    private Collection<Professeur> professeurs = new ArrayList<>();

    @OneToMany(mappedBy = "ecole", fetch = FetchType.LAZY)
    private Collection<Salle> salles;
}
