package singleton.lazy;


//Classe que vai representar nosso padrao de projeto sigleton
//Essa versao vai ser o sigleton "preguiçoso"
public class SingletonLazy {

	//Um singleton tem por caracteristica uma instancia dele mesmo
	private static SingletonLazy instancia;
		
	//Aqui esta o "pulo do gato" para garantir que ninguem vai 
	//instanciar essa classe o construtor deve ser privado
	private SingletonLazy() {
		super();
	}
	
	//para acessar essa instancia unica definimos um metodo get
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}
