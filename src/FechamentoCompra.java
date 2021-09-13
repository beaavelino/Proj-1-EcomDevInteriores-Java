
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
	
	public FechamentoCompra(String nome, double preco, double somatorio) {
		this.nome = nome;
		this.preco = preco;
		this.somatorio = somatorio;
	}

	public FechamentoCompra(String nome, double preco, int estoque, double somatorio) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.somatorio = somatorio;
	}

	public void incio() {
		System.out.print("\n\t\t\t    N O T A    F I S C A L\n");
		linha();
		System.out.print("Itens  \t\t\t\t  QtUnit \t VlUnit \t TotalUnit\n\n");
	}
	
	public void valores() {
		for (int i = 0; i < 10; i++) {
			if (carrinho != 0) {
				System.out.print(nome);
				somatorio = carrinho * preco;
				System.out.printf("     " + carrinho + "\t\t " + preco + "\t\t " + "%.2f \n", somatorio);

			}
		}
	}



	public static void espacoNome(String nome, int y) {
		int espacos = y - nome.length();

		for (int x = 0; x < espacos; x++) {
			System.out.print(" ");
		}
	}
	
	public void linha () {
		System.out.println("--------------------------------------------------------------------------------");
	}

	
}