package br.com.ebac.animal.service.controllers;

import br.com.ebac.animal.service.entidades.Animal;
import br.com.ebac.animal.service.repositories.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted(){
        return repository.findAdopted();
    }
}
