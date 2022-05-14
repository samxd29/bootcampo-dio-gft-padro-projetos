package Strategy;

public enum TipoCliente {

	PRATA(10d), OURO(50d), DIAMANTE(100d);
	
	private Double valorDesconto;

	private TipoCliente(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}
	
	
}
