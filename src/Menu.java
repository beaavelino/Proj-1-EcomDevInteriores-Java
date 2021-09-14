
import java.util.List;

public class Menu {
	
	
	Estoque estoque = new Estoque();
	
	public void mostraMenu() {
		
		System.out.println("ok");
		
		cabecalho();
		
		estoque.mostraEstoque();
		
	}

	
	public void cabecalho() {
		System.out.print("\n-----------------------Bem vindo a Devs de int[e]=riores!-----------------------");
		System.out.print("\n----------------------------Programando o seu conforto!-------------------------\n"); 
	}

}