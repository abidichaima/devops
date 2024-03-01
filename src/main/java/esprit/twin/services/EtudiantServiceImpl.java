package esprit.twin.services;

import esprit.twin.entities.Etudiant;
import esprit.twin.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
/*    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
         this.etudiantRepository= etudiantRepository ;
    }
*/
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);

    }
}

