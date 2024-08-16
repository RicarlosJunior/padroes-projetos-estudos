package singleton.eager;


//Classe que vai representar nosso padrao de projeto sigleton
//Essa versao vai ser o sigleton "apressado"
public class SingletonEager {

	//Um singleton tem por caracteristica uma instancia dele mesmo
	//nesse caso ja definimos o atributo e ja instanciamos ele
	private static SingletonEager instancia = new SingletonEager();
		
	//Aqui esta o "pulo do gato" para garantir que ninguem vai
	//instanciar essa classe o construtor deve ser privado
	private SingletonEager() {
		super();
	}
	
	//para acessar essa instancia unica definimos um metodo get
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
}
