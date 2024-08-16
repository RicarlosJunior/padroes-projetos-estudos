package strategy;

public class Main {
	public static void main(String[] args) {
		
		//Design Pattern Comportamental Strategy
		
		//Testando a "estrategia" de locomover atraves do polimorfismo de Viagem  
		//(viagemAeria, viagemAquatica, viagemTerreste Referencias da Interface Viagem)
		Viagem viagemAeria = new ViagemAeria();
		Viagem viagemAquatica = new ViagemAquatica();
		Viagem viagemTerreste = new ViagemTerrestre();
		
		//Viagente que representa o contexto da "estrategia"
		Viajante viajante = new Viajante();
		
		viajante.setViagem(viagemAeria);
		viajante.locomover();
		viajante.setViagem(viagemAquatica);
		viajante.locomover();
		viajante.setViagem(viagemTerreste);
		viajante.locomover();
		
	}
}
