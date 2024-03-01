package esprit.twin.repositories;

import esprit.twin.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

    @Query("select r from Reservation r join Chambre c on r member of " +
            " c.listReservation where c.blocChambre.foyerBloc.uni.nomUniversite=?1")
    List<Reservation> findbyNomUni(String nom);
}
