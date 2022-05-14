package Facade.service;

public class ApiPedidos {

	private static ApiPedidos instanciaAPI = new ApiPedidos();
	
	private ApiPedidos() {}
	
	public static ApiPedidos getApiPedidos() {
		return instanciaAPI;
	}
	
	public String getNomeCliente(String cpf) {
		return "Joe Baden";
	}
	
	public String getProduto(int numeroPedido) {
		return "Arroz tio joao 5kg";
	}
	
	public Double getValorPedido(int numeroPedido) {
		return 100d;
	}
}
