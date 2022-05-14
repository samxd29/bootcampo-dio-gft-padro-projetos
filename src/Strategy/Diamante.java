package Strategy;

public class Diamante implements Desconto {

	@Override
	public Double gerarValorDesconto(TipoCliente tipo) {
		
		return TipoCliente.DIAMANTE.getValorDesconto();
	}

}
