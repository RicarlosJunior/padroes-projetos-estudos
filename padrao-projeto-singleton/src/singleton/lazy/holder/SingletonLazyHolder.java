package singleton.lazy.holder;


//Classe que vai representar nosso padrao de projeto sigleton
//essa versao tem como caracteristica um consumo e um uso de memoria
//otimizado
public class SingletonLazyHolder {
	
	//uma inner class que tem como objetivo encapsular a instancia
	private static class Holder{
		
		//Um singleton tem por caracteristica uma instancia dele mesmo
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
		
	//Aqui esta o "pulo do gato" para garantir que ninguem vai instanciar
	//essa classe o construtor deve ser privado
	private SingletonLazyHolder() {
		super();
	}
	
	//para acessar essa instancia unica eu preciso de metodo
	public static SingletonLazyHolder getInstancia() {
		return Holder.instancia;
	}
	
}
