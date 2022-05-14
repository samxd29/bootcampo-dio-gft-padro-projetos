package Strategy;

public class Prata implements Desconto{

	@Override
	public Double gerarValorDesconto(TipoCliente tipo) {
		
		return TipoCliente.PRATA.getValorDesconto();
	}

}
