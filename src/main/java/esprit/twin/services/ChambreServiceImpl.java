package esprit.twin.services;

import esprit.twin.entities.Bloc;
import esprit.twin.entities.Chambre;
import esprit.twin.entities.TypeChambre;
import esprit.twin.repositories.BlocRepository;
import esprit.twin.repositories.ChambreRepository;
import esprit.twin.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class ChambreServiceImpl implements IChambreService {
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;

    /* public ChambreServiceImpl(ChambreRepository chambreRepository) {
          this.chambreRepository=chambreRepository ;
     }
 */
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambre(Long id) {
        return chambreRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);

    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);

    }

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {
        return chambreRepository.findByBlocChambreFoyerBlocUniNomUniversite(nomUniversite);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre
            typeC) {
        Bloc bloc = blocRepository.findById(idBloc).orElse(null);

        //return chambreRepository.findByTypeCaAndAndBlocChambre(bloc, typeC);
        return chambreRepository.findByBlocAndType(bloc, typeC);
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(
            String nomUniversite, TypeChambre type) {
        List<Chambre> ch = chambreRepository.findByBlocChambreFoyerBlocUniNomUniversiteAndTypeC(nomUniversite, type);
        Date currentDate = new Date();
        List<Chambre> chambres = new ArrayList<Chambre>();

        for (Chambre c :ch){
            if(c.getListReservation().isEmpty()){
                chambres.add(c);
            }
        }
        return chambres;
    }

}

