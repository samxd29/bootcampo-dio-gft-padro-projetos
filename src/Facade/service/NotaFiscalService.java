package Facade.service;

public class NotaFiscalService {
	
	public static void geraNotaFiscal(String nomeCliente, String produto, double valorPedido) {
		System.out.println("Nota Fiscal gerada com sucesso");
		System.out.println(nomeCliente);
		System.out.println(produto);
		System.out.println(valorPedido);
	}

}
