package esprit.twin.controllers;

import esprit.twin.entities.Foyer;
import esprit.twin.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerController {
    IFoyerService foyerService;

    @PostMapping("/foyer")
    Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @GetMapping("/foyer/{id}")
    Foyer retrieveFoyer(@PathVariable long id) {
        return foyerService.getFoyer(id);
    }

    @GetMapping("/foyer")
    List<Foyer> retrieveFoyers() {
        return foyerService.getAllFoyers();
    }

    @DeleteMapping("/foyer/{id}")
    void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
    }

    @PutMapping("/foyer")
    Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @PostMapping("/addFoyerUni/{idUniversite}")
    Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,@PathVariable long idUniversite) {
        return  foyerService.ajouterFoyerEtAffecterAUniversite(foyer,idUniversite);
    }

    }
