package it.accenture.gareservice.repository;

import it.accenture.gareservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
