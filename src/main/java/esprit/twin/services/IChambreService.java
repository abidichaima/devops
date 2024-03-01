package esprit.twin.services;

import esprit.twin.entities.Chambre;
import esprit.twin.entities.TypeChambre;

import java.util.List;

public interface IChambreService {

    Chambre addChambre(Chambre chambre);

    Chambre getChambre(Long id);

    void deleteChambre(Long id);

    List<Chambre> getAllChambres();

    Chambre updateChambre(Chambre chambre);
     List<Chambre> getChambresParNomUniversite( String nomUniversite) ;

     List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre
            typeC) ;

     List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(
            String nomUniversite,TypeChambre type) ;
}
