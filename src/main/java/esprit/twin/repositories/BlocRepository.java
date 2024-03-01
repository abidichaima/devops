package esprit.twin.repositories;

import esprit.twin.entities.Bloc;
import esprit.twin.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
List<Bloc> findByFoyerBloc(Foyer foyer);

}
