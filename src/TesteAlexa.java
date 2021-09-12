
public class TesteAlexa {

	public static void main(String[] args) {
		Apresentacoes apresentacoes = new Apresentacoes();
		
		//apresentacoes.inicio();
		//apresentacoes.pergunta();
		
		Boolean comprar = true;
		 
		while(comprar) {
		  
			apresentacoes.inicio();
		  
			if (apresentacoes.pergunta()) {
		  	 
				//Apresentacoes.desenho();
		    
				//Menu.mostraMenu(); // Dentro do menu faz a compra e finaliza compra
		    
				//FechamentoCompra.escolhePagamento() // Trabalha com a classe TipoPagamento 
		    
				//FechamentoCompra.imprimeNota() 
		    
				//comprar = FechamentoCompra.continuarCompra() // Retorna boolean
		  
				//Apresentacoes.fim();
		    
		
			} //else {
				//Apresentacoes.fim();
			//}
		  
		}
	}
}
