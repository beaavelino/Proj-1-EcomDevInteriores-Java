
public class TesteIvan{

    public static void main(String[] args) {
    	Menu2 menu = new Menu2();
    	Menu2 lM = new Menu2("G5-1","Luminaria de mesa", 119.99);
        Menu2 Pol = new Menu2("G5-2","Poltrona", 799.99);
        Menu2 AM = new Menu2("G5-3","Abajur", 109.99);
        Menu2 Est = new Menu2("G5-4","Estante", 380.99);
        Menu2 Esc = new Menu2("G5-5","Escrivaninha", 539.99);
        Menu2 CdE = new Menu2("G5-6","Cadeira de escrit�rio", 649.99);
        Menu2 CBox = new Menu2("G5-7","Cama Box", 850.99);
        Menu2 CGamer = new Menu2("G5-8","Cadeira Gamer", 999.99);
        Menu2 MCentro = new Menu2("G5-9","Mesa de centro", 220.99);
        Menu2 Sofa = new Menu2("G5-10","Sof�", 950.99);
    	
        
        //menu.boasVindas();
        menu.setOpcaoCompra(Menu2.getOpcaoCompra());
        
        if(Menu2.getOpcaoCompra()=='S') {
        	
    	lM.listaDeProdutos();
    	Pol.listaDeProdutos();
        AM.listaDeProdutos();
        Est.listaDeProdutos();
        Esc.listaDeProdutos();
        CdE.listaDeProdutos();
        CBox.listaDeProdutos();
        CGamer.listaDeProdutos();
        MCentro.listaDeProdutos();
        Sofa.listaDeProdutos();

        menu.recebeCodigo();
        }
        else {
        	menu.opcoes();
        }
    }
}