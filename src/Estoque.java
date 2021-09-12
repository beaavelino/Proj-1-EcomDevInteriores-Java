import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<Produto> produtos = new ArrayList<>();

	public void inicializaEstoque() {
		produtos.add(new Produto("G5-1", "Luminaria de mesa", 119.99));
		produtos.add(new Produto("G5-2", "Poltrona", 799.99));
		produtos.add(new Produto("G5-3", "Abajur", 109.99));
		produtos.add(new Produto("G5-4", "Estante", 380.99));
		produtos.add(new Produto("G5-5", "Escrivaninha", 539.99));
		produtos.add(new Produto("G5-6", "Cadeira de escritório", 649.99));
		produtos.add(new Produto("G5-7", "Cama Box", 850.99));
		produtos.add(new Produto("G5-8", "Cadeira Gamer", 999.99));
		produtos.add(new Produto("G5-9", "Mesa de centro", 220.99));
		produtos.add(new Produto("G5-10", "Sofá", 950.99));

	}

	public void mostraEstoque() {
		inicializaEstoque();
		linha();
		System.out.print("Codigo");
		Produto.espacoNome("Codigo", 18);
		System.out.print("Produto");
		Produto.espacoNome("Produto", 30);
		System.out.print("         " + "Preço" + "           " + "Estoque\n");
		linha();
		for (Produto produto : produtos) {

			produto.retornaEstoqueMenu();

		}
		System.out.println("");
	}
	public void mostraEstoque1() {
		linha();
		System.out.print("Codigo");
		Produto.espacoNome("Codigo", 18);
		System.out.print("Produto");
		Produto.espacoNome("Produto", 30);
		System.out.print("         " + "Preço" + "           " + "Estoque\n");
		linha();
		for (Produto produto : produtos) {

			produto.retornaEstoqueMenu();

		}
		System.out.println("");
	}

	public Produto consultaProduto(String codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo().equals(codigo)) {
				return produto;
			}
		}
		return new Produto("G5-11", "codigo errado", 0, 0);
	}

	public void retiraEstoque(Produto produto, int quantidade) {
		produto.tiraEstoque(quantidade);
	}

	public static void linha() {
		System.out.println("--------------------------------------------------------------------------------");
	}

}
// List<String> nomes = new ArrayList<>();

// List <Produto> lista = new ArrayList<>();

// lista.add(new Produto("G5-1","Luminaria de mesa", 119.99));

/*
 * Menu Pol = new Menu("G5-2","Poltrona", 799.99); Menu AM = new
 * Menu("G5-3","Abajur", 109.99); Menu Est = new Menu("G5-4","Estante",
 * 380.99)); Menu Esc = new Menu("G5-5","Escrivaninha", 539.99)); Menu CdE = new
 * Menu("G5-6","Cadeira de escritório", 649.99)); Menu CBox = new
 * Menu("G5-7","Cama Box", 850.99)); Menu CGamer = new
 * Menu("G5-8","Cadeira Gamer", 999.99)); Menu MCentro = new
 * Menu("G5-9","Mesa de centro", 220.99)); Menu Sofa = new Menu("G5-10","Sofá",
 * 950.99));
 * 
 */
