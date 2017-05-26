
public class Exercicio02 {

	public static void main(String[] args) {
		//Exercicio 02
	    System.out.println("\n\n\nSolucao para exercicio 02");
	    System.out.println("------------------------------");
	    
	    Aeroporto aeroporto = new Aeroporto("Barra Funda");
	    Aviao aviaoTAN = new Aviao("TAN 123", aeroporto);
	    Aviao aviaoOLE = new Aviao("OLE 111", aeroporto);
	    Aviao aviaoLINHA = new Aviao("LINHA 222", aeroporto);
	    
	    aeroporto.start();
	    aviaoTAN.start();
	    aviaoOLE.start();
	    aviaoLINHA.start();
	}
}
