package ar.edu.unlp.info.bd2.repository;

import ar.edu.unlp.info.bd2.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    Optional<Client> getById(Long id);

}