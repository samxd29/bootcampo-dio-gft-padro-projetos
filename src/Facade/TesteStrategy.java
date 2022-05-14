package Facade;

public class TesteStrategy {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.emitirNotaFiscal("98648964621", 20);
	}

}
