package strategy;

//Classe que representa a implementa��o concreta da minha "estrategia"
public class ViagemTerrestre implements Viagem {

	@Override
	public void locomover() {
		System.out.println("Locomovendo por terra!");
		
	}

}
