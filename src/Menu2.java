
import java.util.Scanner;

public class Menu2 {
	private String nome, codigo;
	private double preco;
	private static int estoque;
	private static int codigoDigitado;
	private static char opcaoCompra;
	
	 public Menu2(String codigo, String nome, double preco) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.preco = preco;
	 }
	 public Menu2() {
	 }
	 
	 public void listaDeProdutos() {
		 System.out.print(codigo);
		 espacoNome(codigo, 18);
		 System.out.print(nome);
		 espacoNome(nome, 36);
		 System.out.print("         "+preco+"          "+estoque+"\n");
	 }
	 public static void espacoNome(String nome, int y) {
		 int espacos = y - nome.length();
		 for(int x=0; x <espacos;x++) {
			 System.out.print
			 (" ");
		 }
	 }
	 
	public int getCodigoDigitado() {
		return codigoDigitado;
	}
	public void setCodigoDigitado(int codigoDigitado) {
		Menu2.codigoDigitado = codigoDigitado;
	}
	public static char getOpcaoCompra() {
		return opcaoCompra;
	}
	public void setOpcaoCompra(char opcaoCompra) {
		Menu2.opcaoCompra = opcaoCompra;
	}
	
	/*public void boasVindas() {
		System.out.print("Bem vindo a Devs de int[e]=riores!\n");
		System.out.print("\nProgramando o seu conforto!\n"); 
		Scanner ler = new Scanner(System.in);
		System.out.print("\nGostaria de iniciar as compras? Digite S/N: ");
		Menu2.opcaoCompra = ler.next().toUpperCase().charAt(0);	
	}*/
	public void recebeCodigo() {
		Scanner ler = new Scanner(System.in);
		do {
		 System.out.print("\nDigite o codigo do produto que deseja comprar G-: ");
		Menu2.codigoDigitado = ler.nextInt();
		if(Menu2.codigoDigitado >=1 && Menu2.codigoDigitado <=10) {
			System.out.println("AQUI ELE MOSTRARIA O ITEM");
		}
		else {
			System.out.println("Codigo invalido");
		}}
		while(Menu2.codigoDigitado <1 && Menu2.codigoDigitado >10);
	}
		public void opcoes() {
	
	 if (opcaoCompra == 'N')
		{
			System.out.print("\nObrigado, ate breve!\n");
		}
		else if (opcaoCompra != 'S' || opcaoCompra != 'N')
		{
			System.out.print("\nOpcao invalida!\n");
		}
	}
}
	