package esprit.twin.services;

import esprit.twin.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);

    Reservation getReservation(String id);

    void deleteReservation(String id);

    List<Reservation> getAllReservations();

    Reservation updateReservation(Reservation reservation);



     List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(  String nomUniversite) ;

}
