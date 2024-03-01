package esprit.twin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
//bloc parent par rapport au foyer (si on va ajouter cascade ca sera ici    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
//fetch=FetchType.EAGER))
//le lazy ay haja toufa b many et ay haja toufa b one rahi eager
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  long idBloc;

    private String nomBloc;

    private long capaciteBloc;
    //manyToOne bidirectionnnelle

    @JsonIgnore
    @ManyToOne
    private Foyer foyerBloc;
    //mapped by prend le nom de l'entite

    @OneToMany(mappedBy = "blocChambre")
    private Set<Chambre> listChambre;

}
