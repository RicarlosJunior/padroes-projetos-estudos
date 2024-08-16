package padroesprojetos.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import padroesprojetos.spring.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
