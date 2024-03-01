package esprit.twin.services;

import esprit.twin.entities.*;
import esprit.twin.repositories.ChambreRepository;
import esprit.twin.repositories.EtudiantRepository;
import esprit.twin.repositories.ReservationRepository;
import esprit.twin.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor

public class ReservationServiceImpl implements IReservationService {
    ReservationRepository reservationRepository;
    ChambreRepository chambreRepository;
    EtudiantRepository etudiantRepository;
    UniversiteRepository universiteRepository;


    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservation(String id) {
        return reservationRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);

    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);

    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite( String nomUniversite) {
        return reservationRepository.findbyNomUni(nomUniversite);

    }
    @Scheduled(cron = "*/5 * * * * *")
    void planifier(){
        System.out.println(reservationRepository.findbyNomUni("UNI"));

    }

}
