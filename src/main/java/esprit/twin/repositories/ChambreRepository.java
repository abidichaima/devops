package esprit.twin.repositories;

import esprit.twin.entities.Bloc;
import esprit.twin.entities.Chambre;
import esprit.twin.entities.Reservation;
import esprit.twin.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByBlocChambreFoyerBlocUniNomUniversite(String nomUniversite);

    @Query("select ch from Chambre ch where ch.blocChambre.foyerBloc.uni.nomUniversite=?1")
    List<Chambre> findByUniversite(String nomUniversite);

    List<Chambre> findByTypeCAndBlocChambreIdBloc(Long b, TypeChambre type);

    List<Chambre> findByBlocChambreFoyerBlocUniNomUniversiteAndTypeC(String nomUniversite, TypeChambre type);


    @Query("SELECT c FROM Chambre c WHERE c.blocChambre = :b AND c.typeC = :type")
    List<Chambre> findByBlocAndType(@Param("b") Bloc b, @Param("type") TypeChambre type);


}
