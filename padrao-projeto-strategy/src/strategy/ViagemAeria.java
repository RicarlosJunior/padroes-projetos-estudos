package strategy;

//Classe que representa a implementa��o concreta da minha "estrategia"
public class ViagemAeria implements Viagem{

	@Override
	public void locomover() {
		System.out.println("Locomovendo pelo ar!");
		
	}
	
}

