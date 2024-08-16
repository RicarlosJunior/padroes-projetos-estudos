import singleton.eager.SingletonEager;
import singleton.lazy.SingletonLazy;
import singleton.lazy.holder.SingletonLazyHolder;

public class Main {
	public static void main(String[] args) {
		
		//Design Pattern Criacional Singleton
		
		
		//Testando Singleton Lazy
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonLazy lazy1 = SingletonLazy.getInstancia();
		System.out.println(lazy1);
		
		SingletonLazy lazy2 = SingletonLazy.getInstancia();
		System.out.println(lazy2);
		
		
		//Testando Singleton Eager
		SingletonEager earg = SingletonEager.getInstancia();
		System.out.println(earg);
		
		SingletonEager earg1 = SingletonEager.getInstancia();
		System.out.println(earg1);
		
		SingletonEager earg2 = SingletonEager.getInstancia();
		System.out.println(earg2);
		
		
		//Testando Singleton LazyHolder
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		SingletonLazyHolder holder1 = SingletonLazyHolder.getInstancia();
		System.out.println(holder1);
		
		SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
		System.out.println(holder2);
		
		
		
	}
}
