package esprit.twin.controllers;

import esprit.twin.entities.Etudiant;
import esprit.twin.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/etudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("/etudiant/{id}")
    Etudiant retrieveEtudiant(@PathVariable long id) {
        return etudiantService.getEtudiant(id);
    }

    @GetMapping("/etudiant")
    List<Etudiant> retrieveEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @DeleteMapping("/etudiant/{id}")
    void deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
    }

    @PutMapping("/etudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }
}
