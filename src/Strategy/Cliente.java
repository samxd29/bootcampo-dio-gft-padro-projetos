package Strategy;

public class Cliente {
	
	private String nome;
	private TipoCliente tipoCliente;
	private Desconto desconto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public void setValorDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public void concederDesconto() {
		System.out.println(desconto.gerarValorDesconto(this.tipoCliente));
	}
	

}
