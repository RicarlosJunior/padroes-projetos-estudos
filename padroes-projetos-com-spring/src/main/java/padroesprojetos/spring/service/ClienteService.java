package padroesprojetos.spring.service;

import padroesprojetos.spring.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Integer id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Integer id, Cliente cliente);
	
	void deletar(Integer id);
	
}
