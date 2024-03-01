package esprit.twin.controllers;

import esprit.twin.entities.Reservation;
import esprit.twin.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/reservation")
    Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/reservation/{id}")
    Reservation retrieveReservation(@PathVariable String id) {
        return reservationService.getReservation(id);
    }

    @GetMapping("/reservation")
    List<Reservation> retrieveReservations() {
        return reservationService.getAllReservations();
    }

    @DeleteMapping("/reservation/{id}")
    void deleteReservation(@PathVariable String id) {
        reservationService.deleteReservation(id);
    }

    @PutMapping("/reservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @PostMapping("/getReservation/{nomUniversite}")
    List<Reservation> getReservationNom(@PathVariable String nomUniversite) {
        return reservationService.getReservationParAnneeUniversitaireEtNomUniversite( nomUniversite);
    }
}
