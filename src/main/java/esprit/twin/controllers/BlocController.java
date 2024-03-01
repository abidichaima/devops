package esprit.twin.controllers;

import esprit.twin.entities.Bloc;
import esprit.twin.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocController {
    IBlocService blocService;

    @PostMapping("/bloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("/bloc/{id}")
    Bloc retrieveBloc(@PathVariable long id) {
        return blocService.getBloc(id);
    }

    @GetMapping("/bloc")
    List<Bloc> retrieveBlocs() {
        return blocService.getAllBlocs();
    }

    @DeleteMapping("/bloc/{id}")
    void deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }

    @PutMapping("/bloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

}
