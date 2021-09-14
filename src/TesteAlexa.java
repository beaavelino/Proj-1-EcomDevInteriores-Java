
public class TesteAlexa {

	public static void main (String []args) {
		Apresentacoes apresentacoes = new Apresentacoes();
		Menu menu = new Menu();
		Estoque estoque = new Estoque();
		FechamentoCompraDeivit fechamento = new FechamentoCompraDeivit();

		Boolean comprar = true;
		 
		while(comprar) {
		  
			apresentacoes.inicio();
			apresentacoes.desenho();
		  
			if (apresentacoes.pergunta()) {
				
				fechamento.cadastrarUsuario();
				
				do {

					menu.mostraMenu(estoque); // Dentro do menu faz a compra e finaliza compra
					
					menu.escolheItem(estoque);
					
					fechamento.mostraCarrinho(estoque);
		    
				} while (menu.perguntaContinuarCompra());
				
				if (estoque.carrinhoVazio()) {
					apresentacoes.fim();
					comprar = false;
				} else {
					
					fechamento.mostraCarrinho(estoque);
					
					int tipoDePagamento = fechamento.tipoDePagamento(estoque.ValorTotal());
					
					fechamento.pagamento(tipoDePagamento);
					
					fechamento.imprimeNota(estoque);
				}
				//System.out.println(estoque.carrinhoVazio());
				//fechamentoCompra.escolhePagamento() // Trabalha com a classe TipoPagamento 
		    
				//fechamentoCompra.imprimeNota() 
		    
				//comprar = FechamentoCompra.continuarCompra() // Retorna boolean
		  
				//apresentacoes.fim();
				comprar = false;
		    
				comprar = false;
		
			} else {
				apresentacoes.fim();
				comprar = false;
			}

		}
	}		
}

