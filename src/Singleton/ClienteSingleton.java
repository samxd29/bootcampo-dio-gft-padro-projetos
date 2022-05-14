package Singleton;

public class ClienteSingleton {
	
	private static ClienteSingleton instanciaCliente;
	
	private ClienteSingleton() {}
	
	public static ClienteSingleton getInstanciaCliente() {
		if(instanciaCliente == null) {
			instanciaCliente = new ClienteSingleton();
		}
		return instanciaCliente;
	}

}
