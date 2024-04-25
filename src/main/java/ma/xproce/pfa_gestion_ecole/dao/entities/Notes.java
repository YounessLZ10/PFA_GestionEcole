package ma.xproce.pfa_gestion_ecole.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_note;
    private Integer id_etudiant ;
    private Integer id_matiere ;
    private Double note ;

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;
}
