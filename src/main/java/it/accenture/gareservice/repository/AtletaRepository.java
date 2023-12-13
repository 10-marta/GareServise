package it.accenture.gareservice.repository;

import it.accenture.gareservice.model.Atleta;
import org.springframework.data.repository.CrudRepository;

public interface AtletaRepository  extends CrudRepository<Atleta,Long> {
}
