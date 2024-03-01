package esprit.twin.controllers;

import esprit.twin.entities.Chambre;
import esprit.twin.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;

    @PostMapping("/chambre")
    Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @GetMapping("/chambre/{id}")
    Chambre retrieveChambre(@PathVariable long id) {
        return chambreService.getChambre(id);
    }

    @GetMapping("/chambre")
    List<Chambre> retrieveChambres() {
        return chambreService.getAllChambres();
    }

    @DeleteMapping("/chambre/{id}")
    void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }

    @PutMapping("/chambre")
    Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }
    
}
