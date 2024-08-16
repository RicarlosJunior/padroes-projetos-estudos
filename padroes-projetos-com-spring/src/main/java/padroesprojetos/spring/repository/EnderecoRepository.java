package padroesprojetos.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import padroesprojetos.spring.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{

}
