package esprit.twin.services;

import esprit.twin.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);

    Bloc getBloc(Long id);

    void deleteBloc(Long id);

    List<Bloc> getAllBlocs();

    Bloc updateBloc(Bloc bloc);

     Bloc affecterChambresABloc(List<Long> numChambre, long
            idBloc) ;


}
