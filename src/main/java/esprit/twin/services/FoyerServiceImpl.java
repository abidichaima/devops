package esprit.twin.services;

import esprit.twin.entities.Bloc;
import esprit.twin.entities.Foyer;
import esprit.twin.entities.Universite;
import esprit.twin.repositories.BlocRepository;
import esprit.twin.repositories.FoyerRepository;
import esprit.twin.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    FoyerRepository foyerRepository;
    UniversiteRepository universiteRepository;
    BlocRepository blocRepository;


    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer getFoyer(Long id) {
        return foyerRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);

    }

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);

    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite uni = universiteRepository.findById(idUniversite).orElse(null);
       // foyer.getListBloc().forEach(bloc -> bloc.setFoyerBloc(foyer));
        Set<Bloc> blocs = foyer.getListBloc();
        for (Bloc bloc : blocs) {
            bloc.setFoyerBloc(foyer);
        }
        uni.setFoyerUni(foyer);
        return foyerRepository.save(foyer);
    }
}
