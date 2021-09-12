
public class Produto {
	private String codigo;
	private String nome;
	private double preco;
	private int estoque = 10;
	private int carrinho = 0;
	
	Estoque estoque1 = new Estoque();
	
	public Produto(String codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String codigo, String nome, double preco, int estoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public void retornaEstoqueMenu() {
		System.out.print(codigo);
		espacoNome(codigo, 18);
		System.out.print(nome);
		espacoNome(nome, 30);
		System.out.print("         " + preco + "               " + this.estoque + "\n");
	}

	public void retornaCarrinhoMenu() {
		System.out.print(codigo);
		espacoNome(codigo, 18);
		System.out.print(nome);
		espacoNome(nome, 30);
		System.out.print("         " + preco + "               " + carrinho + "\n");
	}
	public void inicia() {
		estoque1.inicializaEstoque();
	}
	public int getEstoque() {
		return this.estoque;
	}

	public void tiraEstoque(int estoque) {
		this.estoque -= estoque;
	}

	public int Carrinho() {
		return carrinho;
	}

	public void acrescentaCarrinho(int carrinho) {
		this.carrinho += carrinho;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public static void espacoNome(String nome, int y) {
		int espacos = y - nome.length();

		for (int x = 0; x < espacos; x++) {
			System.out.print(" ");
		}
	}

}
