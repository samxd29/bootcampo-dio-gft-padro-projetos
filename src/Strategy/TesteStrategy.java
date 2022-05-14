package Strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		
		Diamante diamante = new Diamante();
		Ouro ouro = new Ouro();
		Prata prata = new Prata();
	
		Cliente cliente = new Cliente();
		cliente.setNome("Joaozinho");
		cliente.setTipoCliente(TipoCliente.OURO);
		cliente.setValorDesconto(diamante);
		cliente.concederDesconto();

	}

}
