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
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFoyer;
    String nomFoyer;
    private  long capaciteFoyer;
    //OneToOne bidirectionnelle dans les deux entites

    @OneToOne(mappedBy="foyerUni")
    private  Universite uni;
    //oneToMany bidirectionnelle donc on a besoin de mapped by (il est dans le fils le moins cardinalite )

    @OneToMany(mappedBy = "foyerBloc",cascade = CascadeType.ALL)
    private  Set<Bloc> listBloc;

}
