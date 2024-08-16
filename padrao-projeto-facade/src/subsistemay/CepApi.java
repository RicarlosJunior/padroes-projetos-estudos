package subsistemay;

public class CepApi {
	
	private static CepApi instancia;
	
	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		if(instancia == null) {
			instancia = new CepApi();
		}
		return instancia;
	}
	
	public String consultarCidadePorCep(String cep) {
		return "Goiania";
	}
	
	public String consultarUfPorCep(String cep) {
		return "GO";
	}
}
