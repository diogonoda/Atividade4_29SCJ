
public class Exercicio03 {
	static String padRight(String string, int padding) {
	     return String.format("%1$-" + padding + "s", string);  
	}

	public static void main(String[] args) {
		for (Cores cor : Cores.values()) {
			System.out.println(padRight(cor.getNomeCor(), 8) + " | " + cor.getCodCor());
		}
		
		System.out.println(Cores.Branco.getCodCor());
	}
}
