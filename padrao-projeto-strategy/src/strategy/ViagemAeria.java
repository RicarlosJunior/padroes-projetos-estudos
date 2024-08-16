package strategy;

//Classe que representa a implementação concreta da minha "estrategia"
public class ViagemAeria implements Viagem{

	@Override
	public void locomover() {
		System.out.println("Locomovendo pelo ar!");
		
	}
	
}

