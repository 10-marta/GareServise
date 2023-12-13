package it.accenture.gareservice.repository;

import it.accenture.gareservice.model.Gara;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GaraRepository extends CrudRepository<Gara,Long> {

}
