package br.com.ebac.animal.service.controllers;

import br.com.ebac.animal.service.entidades.Animal;
import br.com.ebac.animal.service.entidades.Funcionarios;
import br.com.ebac.animal.service.repositories.AnimalRepository;
import br.com.ebac.animal.service.repositories.FuncionariosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    private FuncionariosRepository repository;

    public FuncionariosController(FuncionariosRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<Funcionarios> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private Funcionarios create(@RequestBody Funcionarios funcionarios){
        return repository.save(funcionarios);
    }

    @GetMapping("/quantidadeAnimaisResgatados")
    public List<Object[]> quantidadeAnimaisResgatadosPorFuncionario() {
        return repository.countAnimaisResgatadosPorFuncionario();
    }

}
