package facade;

import subsistemax.SubSistemaXService;
import subsistemay.CepApi;

//Classe que representa um facade
public class Facade {

	//metodo que simplefica a integraçao em "Dois sistemas diferentes (SubSistemaX e SubSistemaY)"
	public void preencherEndereco(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().consultarCidadePorCep(cep);
		String uf = CepApi.getInstancia().consultarUfPorCep(cep);
		
		SubSistemaXService.gravarCliente(nome, cep, cidade, uf);
		
	}
	
}
