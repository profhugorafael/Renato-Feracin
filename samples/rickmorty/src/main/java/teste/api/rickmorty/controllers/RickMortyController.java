package teste.api.rickmorty.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.api.rickmorty.integrations.Character;
import teste.api.rickmorty.integrations.CharacterRepository;

@RestController
@RequestMapping("/api")
public class RickMortyController {

    @Autowired
    CharacterRepository characterRepository;

    @GetMapping(value = "/character/{idPersonagem}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Character consultarPersonagem(@PathVariable Integer idPersonagem){
        return characterRepository.consultarPersonagem(idPersonagem);
    }

}
