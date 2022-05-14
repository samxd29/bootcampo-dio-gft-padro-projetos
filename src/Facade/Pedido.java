package Facade;

import Facade.service.ApiPedidos;
import Facade.service.NotaFiscalService;

public class Pedido {
	
	public void emitirNotaFiscal(String cpfCliente, int numeroPedido) {
		
		String nomeCliente = ApiPedidos.getApiPedidos().getNomeCliente(cpfCliente);
		String produto = ApiPedidos.getApiPedidos().getProduto(numeroPedido);
		Double valorPedido = ApiPedidos.getApiPedidos().getValorPedido(numeroPedido);
		
		NotaFiscalService.geraNotaFiscal(nomeCliente, produto, valorPedido);
	}

}
