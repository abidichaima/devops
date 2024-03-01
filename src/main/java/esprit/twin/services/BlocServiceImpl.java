package esprit.twin.services;


import esprit.twin.entities.Bloc;
import esprit.twin.entities.Chambre;
import esprit.twin.repositories.BlocRepository;
import esprit.twin.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
  /*  public BlocServiceImpl(BlocRepository blocRepository) {
         this.blocRepository=blocRepository ;
    }*/ // na7ouh khater zedna il allargconstructor twali direct yaaml constructeur fih les attribut ili declarythom

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBloc(Long id) {
        return blocRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);

    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);

    }
    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long
            idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).orElse(null);
        for(Long id : numChambre){
            Chambre ch=chambreRepository.findById(id).orElse(null);
            ch.setBlocChambre(bloc);
            chambreRepository.save(ch);
        }
        return bloc;
    }
}
