package padroesprojetos.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import padroesprojetos.spring.model.Cliente;
import padroesprojetos.spring.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	@Operation(summary = "Consultar todos os clientes", description = "Recurso que consulta todos clientes", tags = "Clientes")
	public ResponseEntity<Iterable<Cliente>> buscarTodos(){
		return ResponseEntity.ok(clienteService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	@Operation(summary = "Consultar por id", description = "Recurso que consulta um cliente por id", tags = "Clientes")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Integer id){
		return ResponseEntity.ok(clienteService.buscarPorId(id));
	}
	
	@PostMapping
	@Operation(summary = "Inserir", description = "Recurso que cria um novo cliente", tags = "Clientes")
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
		clienteService.inserir(cliente);
		return ResponseEntity.ok(cliente);
	}

	@PutMapping("/{id}")
	@Operation(summary = "Atualizar", description = "Recurso que atualiza um cliente", tags = "Clientes")
	public ResponseEntity<Cliente> atualizar(@PathVariable Integer id, @RequestBody Cliente cliente){
		clienteService.atualizar(id, cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping("/{id}")
	@Operation(summary = "Deletar", description = "Recurso que deleta um cliente", tags = "Clientes")
	public ResponseEntity<Cliente> deletar(@PathVariable Integer id){
		clienteService.deletar(id);
		return ResponseEntity.ok().build();
	}
}
