
public class TesteAlexa {

	public static void main (String []args) {
		Apresentacoes apresentacoes = new Apresentacoes();
		Menu menu = new Menu();
<<<<<<< HEAD
=======
		
>>>>>>> 68f1930a843f7ea0e43d4c80bd6a49be2e97a432
		
		
		Boolean comprar = true;
		
		 
		while(comprar) {
		  
			apresentacoes.inicio();
			apresentacoes.desenho();
		  
			if (apresentacoes.pergunta()) {
<<<<<<< HEAD
		    
=======
		  	 		    
>>>>>>> 68f1930a843f7ea0e43d4c80bd6a49be2e97a432
				menu.mostraMenu(); // Dentro do menu faz a compra e finaliza compra
		    
				//fechamentoCompra.escolhePagamento() // Trabalha com a classe TipoPagamento 
		    
				//fechamentoCompra.imprimeNota() 
		    
				//comprar = FechamentoCompra.continuarCompra() // Retorna boolean
		  
				//apresentacoes.fim();
				comprar = false;
		    
				comprar = false;
		
			} else {
<<<<<<< HEAD
				//Apresentacoes.fim();
=======
				apresentacoes.fim();
>>>>>>> 68f1930a843f7ea0e43d4c80bd6a49be2e97a432
				comprar = false;
			}

		}
	}		
}

