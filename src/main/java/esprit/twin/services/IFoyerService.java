package esprit.twin.services;

import esprit.twin.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    Foyer getFoyer(Long id);

    void deleteFoyer(Long id);

    List<Foyer> getAllFoyers();

    Foyer updateFoyer(Foyer foyer);

     Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;
}
