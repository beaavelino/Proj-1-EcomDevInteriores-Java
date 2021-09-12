
public class TesteAlexa {

	public static void main (String []args) {
		Apresentacoes apresentacoes = new Apresentacoes();
		
		//apresentacoes.inicio();
		//apresentacoes.pergunta();
		//apresentacoes.desenho();
		
		Boolean comprar = true;
		 
		while(comprar) {
		  
			apresentacoes.inicio();
			apresentacoes.desenho();
		  
			if (apresentacoes.pergunta()) {
		  	 
		    
				//Menu.mostraMenu(); // Dentro do menu faz a compra e finaliza compra
		    
				//FechamentoCompra.escolhePagamento() // Trabalha com a classe TipoPagamento 
		    
				//FechamentoCompra.imprimeNota() 
		    
				//comprar = FechamentoCompra.continuarCompra() // Retorna boolean
		  
				apresentacoes.fim();
		    
		
			} //else {
				//Apresentacoes.fim();
			//}

		}
	}		
}

