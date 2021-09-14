
import java.util.List;

public class Menu {
	
	
	Estoque estoque = new Estoque();
	Apresentacoes apresentacoes = new Apresentacoes();
	
	public void mostraMenu() {
		
		
		apresentacoes.inicio();
		
		estoque.mostraEstoque();
		
	}

}