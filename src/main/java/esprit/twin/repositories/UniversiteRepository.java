package esprit.twin.repositories;

import esprit.twin.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findByNomUniversite(String nomUni);
}
