package esprit.twin.services;

import esprit.twin.entities.Foyer;
import esprit.twin.entities.Universite;
import esprit.twin.repositories.FoyerRepository;
import esprit.twin.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
 /*   public UniversiteServiceImpl( UniversiteRepository universiteRepository) {
           this.universiteRepository = universiteRepository ;
    }*/

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);

    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);

    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String
            nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).orElse(null);

        Universite uni = universiteRepository.findByNomUniversite(nomUniversite);
        uni.setFoyerUni(foyer);
        return universiteRepository.save(uni);

    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite uni = universiteRepository.findById(idUniversite).orElse(null);
        uni.setFoyerUni(null);
        return universiteRepository.save(uni);
    }

}
