
public class TesteAlexa {

	public static void main (String []args) {
		Apresentacoes apresentacoes = new Apresentacoes();
		Menu menu = new Menu();
		
		
		
		Boolean comprar = true;
		 
		while(comprar) {
		  
			apresentacoes.inicio();
			apresentacoes.desenho();
		  
			if (apresentacoes.pergunta()) {
		  	 		    
				menu.mostraMenu(); // Dentro do menu faz a compra e finaliza compra
		    
				//fechamentoCompra.escolhePagamento() // Trabalha com a classe TipoPagamento 
		    
				//fechamentoCompra.imprimeNota() 
		    
				//comprar = FechamentoCompra.continuarCompra() // Retorna boolean
		  
				//apresentacoes.fim();
				comprar = false;
		    
		
			} else {
				apresentacoes.fim();
				comprar = false;
			}

		}
	}		
}

