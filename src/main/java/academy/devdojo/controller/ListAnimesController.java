package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ListAnimesController {

    List<String> animes = new ArrayList<>();

    public ListAnimesController() {
        animes.add("Final Fantasy");
        animes.add("Dragon Ball");
        animes.add("Galaxia");
        animes.add("Solo Leveling");
        animes.add("Attack on Titan");
    }

    @GetMapping("/v1/animes")
    public List<String> getAnimes() {
        return animes;
    }
}