

public class TesteFechamentoCompra {

	public static void main(String[] args) {
		FechamentoCompra fechamentoCompra = new FechamentoCompra();
		Estoque estoque = new Estoque();
		
		//Produto produto = new Produto();
		
		estoque.retiraEstoque(estoque.consultaProduto("G5-1"), 2);
		estoque.retiraEstoque(estoque.consultaProduto("G5-5"), 2);
		estoque.retiraEstoque(estoque.consultaProduto("G5-12"), 2);
		
		fechamentoCompra.incio();
		estoque.mostraNota();
		
		//produto.retornaCarrinhoNota();
		
	}
}
