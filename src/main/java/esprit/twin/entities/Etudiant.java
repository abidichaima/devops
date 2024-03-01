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
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany
    private Set<Reservation> listReservation;

}
