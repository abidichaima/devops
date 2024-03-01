package esprit.twin.services;

import esprit.twin.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);

    Universite getUniversite(Long id);

    void deleteUniversite(Long id);

    List<Universite> getAllUniversites();

    Universite updateUniversite(Universite universite);
     Universite affecterFoyerAUniversite (long idFoyer, String
            nomUniversite) ;
     Universite desaffecterFoyerAUniversite (long idUniversite) ;

}
