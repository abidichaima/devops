package esprit.twin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Reservation implements Serializable {
    @Id
    //@GeneratedValue(strategy =  GenerationType.IDENTITY) ; elle est de type string

    private  String idReservation;
    private   Date anneeUniversitaire;
    private  boolean estValide;
    //ManyToMany bidirectionnelle

    @ManyToMany(mappedBy = "listReservation",fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Etudiant> listEtudiant;
}
