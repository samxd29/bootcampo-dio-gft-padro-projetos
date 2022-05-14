package Strategy;

public class Ouro implements Desconto{

	@Override
	public Double gerarValorDesconto(TipoCliente tipo) {
		
		return TipoCliente.OURO.getValorDesconto();
	}

}
