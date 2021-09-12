
public class TesteGus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		
		Estoque estoque = new Estoque();
		
				
		menu.mostraMenu();
		
		
		
		Produto produto = estoque.consultaProduto("G5-1");

		if (produto.getEstoque() == 0) {
			System.out.println("Produto indisponivel!");
		}
		produto.tiraEstoque(2);
		
		produto = estoque.consultaProduto("G5-2");

		if (produto.getEstoque() == 0) {
			System.out.println("Produto indisponivel!");
		}
		produto.tiraEstoque(3);
		menu.mostraMenu1();
	
	}

}
