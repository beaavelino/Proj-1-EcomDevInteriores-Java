import java.util.Scanner;

public class Apresentacoes {
	private Scanner leia = new Scanner(System.in);

	public void inicio() {
		System.out.print("----Bem vindo a Devs de int[e]=riores!----");
		System.out.print("\n  -----Programando o seu conforto!-----\n"); 
	}
	//metodo		
	public boolean pergunta() {
		
		System.out.print("\nDeseja comprar algo? ");
		
		char respostaUsuario;
		boolean respostaBoolean = false;
		
		do {
			respostaUsuario = leia.nextLine().toLowerCase().charAt(0);
			
			if (respostaUsuario == 's' || respostaUsuario == 'S') {
			
				System.out.print("\nIremos te apresentar nossos produtos!");
				respostaBoolean = true;
			}		
			else if (respostaUsuario == 'n' || respostaUsuario == 'N') {
				System.out.print("\nAté logo!");
				respostaBoolean = false;
			}
			else {
				System.out.println("Caracter inválido!! ");
				System.out.print("\nDigite um novo caracter: ");
			}
			
		} while (respostaUsuario != 's' || respostaUsuario != 'n');
		
		return respostaBoolean;
	}		
	
}	
