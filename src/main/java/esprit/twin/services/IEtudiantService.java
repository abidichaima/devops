package esprit.twin.services;

import esprit.twin.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    Etudiant getEtudiant(Long id);

    void deleteEtudiant(Long id);

    List<Etudiant> getAllEtudiants();

    Etudiant updateEtudiant(Etudiant etudiant);


}
