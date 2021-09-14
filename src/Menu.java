
import java.util.List;

public class Menu {
	
	
	Estoque estoque = new Estoque();
	Apresentacoes apresentacoes = new Apresentacoes();
	
	public void mostraMenu() {
		
		System.out.println("ok");
		
		apresentacoes.inicio();
		
		estoque.mostraEstoque();
		
	}

}