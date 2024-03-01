package esprit.twin.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    //lezem nzydouha .string sinn fel base yabda yzyd feha par default 0 1 2 ili houma il ordre mt il attribut (simple,double,trple ..)
    private TypeChambre typeC;

    @ManyToOne
    private Bloc blocChambre;
    //OneToMany unidirectionnelle , le fleche devant reservation donc l implementation se fait dans l'autre (chambre) et sans mapped by

    @OneToMany
    private Set<Reservation> listReservation;
}
