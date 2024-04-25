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

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_etudiant ;
    private String name ;
    private String prenom ;
    private String tel ;
    private String email ;
    private String filiere ;
    private String groupe ;

    @ManyToMany(mappedBy = "etudiants", fetch = FetchType.EAGER)
    private Collection<Matiere> matieres = new ArrayList<>();

    @ManyToMany(mappedBy = "etudiants", fetch = FetchType.EAGER)
    private Collection<Salle> salles = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;

    @ManyToOne
    @JoinColumn(name = "emploi_du_temps_id")
    private Emploi_du_temps emploiDuTemps;

    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
    private Collection<Notes> notes;
}
