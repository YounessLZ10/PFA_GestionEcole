package ma.xproce.pfa_gestion_ecole.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emploi_du_temps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nom_matiere ;
    private String jour ;
    private Double duree_seance ;
    private String heure_seance ;
}
