package esprit.twin.repositories;

import esprit.twin.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
Etudiant findByCin(Long cin);



}
