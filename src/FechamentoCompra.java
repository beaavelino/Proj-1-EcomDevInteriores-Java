
public class FechamentoCompra {
	private String nome;
	private double preco;
	private int estoque = 10;
	private int carrinho = 0;
	private double valorTotal = 0.0, valorFinal = 0.0, valorImposto = 0.0, imposto = 0.00, juros = 0.0, taxaCartao = 0.0;
	private double somatorio;
	private int tipoPagamento = 1;
	private String nomeUsuario = "Usuario anonimo";
	private String cpfUsuario = "000.000.000-0";
	
	Estoque estoque1 = new Estoque();
	
	public FechamentoCompra() {
	}
	

	public void incio() {
		System.out.print("\n\t\t\t    N O T A    F I S C A L\n");
		linha();
		System.out.print("Itens    \t\t\t  QtUnit \t VlUnit \t TotalUnit\n\n");
	}
	

	
	public void linha () {
		System.out.println("--------------------------------------------------------------------------------");
	}

	
}