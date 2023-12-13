package it.accenture.gareservice.controller;

import it.accenture.gareservice.model.Gara;
import it.accenture.gareservice.repository.GaraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/challenges")
public class GaraController {

   @Autowired
   private GaraRepository garaRepository;

    @PostMapping
    public Gara saveGara(@RequestBody Gara gara) {
    return garaRepository.save(gara);
    }

    @GetMapping("/{id}")
    public Optional<Gara> findGaraById(@PathVariable Long id) {
        return  garaRepository.findById(id);
    }

    @GetMapping
    public List<Gara> findAllGara() {
       List<Gara>  gare=(List<Gara>) garaRepository.findAll();
        return gare;
    }

    @DeleteMapping("{id}")
    public void deleteGara(@PathVariable Long id) {
      garaRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Gara updateGara(@PathVariable Long id,@RequestBody Gara gara)
    {
            Optional<Gara> race = findGaraById(id);
            //primo punto controllare che la gara sia piena.
            //secondo se è presente aggiorna,altrimenti dai un messaggio di errore.
        //!race.isEmpty())
            if (race.isPresent()){
                Gara g=race.get();
                g.setNome(gara.getNome());
                return garaRepository.save(g);
            }else{
                throw new RuntimeException("Non è possibile trovare la gara");
            }


    }
}
