
public class TesteAlexa {

	public static void main (String []args) {
		Apresentacoes apresentacoes = new Apresentacoes();
		Menu menu = new Menu();
		
		//apresentacoes.inicio();
		//apresentacoes.pergunta();
		//apresentacoes.desenho();
		
		Boolean comprar = true;
		
		 
		while(comprar) {
		  
			apresentacoes.inicio();
			apresentacoes.desenho();
		  
			if (apresentacoes.pergunta()) {
		    
				menu.mostraMenu(); // Dentro do menu faz a compra e finaliza compra
		    
				//FechamentoCompra.escolhePagamento() // Trabalha com a classe TipoPagamento 
		    
				//FechamentoCompra.imprimeNota() 
		    
				//comprar = FechamentoCompra.continuarCompra() // Retorna boolean
		  
				apresentacoes.fim();
		    
				comprar = false;
		
			} else {
				//Apresentacoes.fim();
				comprar = false;
			}

		}
	}		
}

