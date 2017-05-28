
public class Aviao extends Thread {
   	private String nomeVoo;
   	private Aeroporto aeroporto;
    	
   	public Aviao(String nomeVoo, Aeroporto aeroporto){
   		this.nomeVoo = nomeVoo;
   		this.aeroporto = aeroporto;
   	}
    	
   	public void decolar(){
   		System.out.println("Aviao voo " + nomeVoo + " iniciando decolagem!");
   	}
    	
   	public void voar(){
   		System.out.println("Aviao voo " + nomeVoo + " em viagem!");
    		
   		try {
			Thread.sleep(4_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

   		System.out.println("Fim do voo " + nomeVoo +"! Preciso aterrissar");
   	}
    	
   	public void aterrissar(){
   		System.out.println("Aviao voo " + nomeVoo + " em processo de aterrissagem!");	    		
   	}
    	
   	@Override
   	public void run() {
   		aeroporto.aguardarPistaDisponivel();
		decolar();
   		voar();
    		
   		aeroporto.aguardarPistaDisponivel();
		aterrissar();
   	}
}
