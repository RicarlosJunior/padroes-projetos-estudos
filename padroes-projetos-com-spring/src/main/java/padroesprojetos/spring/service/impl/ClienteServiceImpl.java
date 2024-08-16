package padroesprojetos.spring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import padroesprojetos.spring.model.Cliente;
import padroesprojetos.spring.model.ClienteRepository;
import padroesprojetos.spring.model.Endereco;
import padroesprojetos.spring.model.EnderecoRepository;
import padroesprojetos.spring.service.ClienteService;
import padroesprojetos.spring.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
	    Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		
		//Aqui temos algumas regras!
		salvarClienteComEndereco(cliente);
	}

	
	@Override
	public void atualizar(Integer id, Cliente cliente) {
		//Aqui temos algumas regras!
		Optional<Cliente> clienteBancoDados = clienteRepository.findById(id);
		
		
		//Verifica se o cliente existe no banco de dados para atualizar
		if(clienteBancoDados.isPresent()) {
			salvarClienteComEndereco(cliente);
		}
		
	}

	@Override
	public void deletar(Integer id) {
		clienteRepository.deleteById(id);
	}

	
	private void salvarClienteComEndereco(Cliente cliente) {
		//Verificar se o endereço do cliente ja exite (pelo cep)
		String cep = cliente.getEndereco().getCep();
		
		//Faz uma consulta no banco de dados atraves do enderecoRepository passando o cep, 
		//caso ja exista o endereço é retornado! Caso não o metodo orElseGet é acionado
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			
			//Caso o endereço ainda nao exista no banco de dados e feito uma consulta via api no ViaCep
			//atraves do viaCepService chamando o endpoint consultarCep
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			
			//Com o novo endereço retornado pela consultar grava no banco de dados e 
			//retorna o novoEndereco
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		
		//seta o endereço no objeto cliente
		cliente.setEndereco(endereco);
		
		//agora sim é feito o insert de cliente (com endereço existente ou novo endereço)
		clienteRepository.save(cliente);
	}

	
}
