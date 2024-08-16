package strategy;

//Classe que representa o contexto dentro do padrao de projeto Strategy
public class Viajante {

	private Viagem viagem;

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	
	public void locomover() {
		viagem.locomover();
	}
}
