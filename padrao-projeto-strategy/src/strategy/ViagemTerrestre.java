package strategy;

//Classe que representa a implementação concreta da minha "estrategia"
public class ViagemTerrestre implements Viagem {

	@Override
	public void locomover() {
		System.out.println("Locomovendo por terra!");
		
	}

}
