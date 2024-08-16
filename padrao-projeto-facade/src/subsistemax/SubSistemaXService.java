package subsistemax;

public class SubSistemaXService {
	
	private SubSistemaXService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String uf) {
		System.out.println("Cliente salvo com sucesso!");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(uf);
		
	}
	
}
