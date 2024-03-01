package esprit.twin.controllers;

import esprit.twin.entities.Universite;
import esprit.twin.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;

    @PostMapping("/universite")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @GetMapping("/universite/{id}")
    Universite retrieveUniversite(@PathVariable long id) {
        return universiteService.getUniversite(id);
    }

    @GetMapping("/universite")
    List<Universite> retrieveUniversites() {
        return universiteService.getAllUniversites();
    }

    @DeleteMapping("/universite/{id}")
    void deleteUniversite(@PathVariable Long id) {
        universiteService.deleteUniversite(id);
    }

    @PutMapping("/universite")
    Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }
}
