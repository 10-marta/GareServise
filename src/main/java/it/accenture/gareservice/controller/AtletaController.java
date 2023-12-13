package it.accenture.gareservice.controller;

import it.accenture.gareservice.model.Atleta;
import it.accenture.gareservice.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/athletes")
public class AtletaController {

    @Autowired
    private AtletaRepository atletaRepository;


    @PostMapping
    public Atleta saveAtleta(@RequestBody Atleta atleta){
        return atletaRepository.save(atleta);
    }

    @GetMapping("/{id}")
    public Optional<Atleta> findByIdAtleta(@PathVariable("id") Long id ){return  atletaRepository.findById(id);}
    @GetMapping
    public List<Atleta> findAllAtleta()
    {
        List<Atleta> atleta=(List<Atleta>) atletaRepository.findAll();
        return atleta;
    }

    @DeleteMapping("{id}")
    public void deleteAtleta(@PathVariable("id") Long id){
       atletaRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Atleta update(@PathVariable("id") Long id,@RequestBody Atleta atleta)
    {
        Optional<Atleta> runner=findByIdAtleta(id);
        if(runner.isPresent()){
            Atleta a=runner.get();
            a.setNome(atleta.getNome());
            a.setCognome(atleta.getCognome());
            a.setCategoria(atleta.getCategoria());
            return atletaRepository.save(a);
        }else {
            throw new RuntimeException("Non è possibile trovare l'atleta");
        }
    }



}
