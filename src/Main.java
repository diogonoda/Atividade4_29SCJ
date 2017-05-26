public class Main {

	public static void main(String[] args) {
		//Exercicio 01
	    /*System.out.println("Solucao para exercicio 01");
	    System.out.println("------------------------------");
		class MessagePrinter extends Thread {
			@Override
			public void run() {
				Stack<String> messageList = new Stack<>();
				
				messageList.push("Mensagem1");
				messageList.push("Mensagem2");
				messageList.push("Mensagem3");
				messageList.push("Mensagem4");
				
				while(!messageList.isEmpty()){
					System.out.println(messageList.pop());
					
					try {
						Thread.sleep(20_000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		class DateTimePrinter extends Thread {
			@Override
			public void run() {
				while(true){
					System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));
					
					try {
						Thread.sleep(10_000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		MessagePrinter messagePrinter = new MessagePrinter();
		DateTimePrinter dateTimePrinter = new DateTimePrinter();

		class ThreadStatePrinter extends Thread{
			@Override
			public void run() {
				while(true){
					System.out.println("Status da thread de mensagens: " + messagePrinter.getState());
					System.out.println("Status da thread de horário: " + dateTimePrinter.getState());

					try {
						Thread.sleep(5_000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		ThreadStatePrinter threadStatePrinter = new ThreadStatePrinter();
		
		messagePrinter.start();
		
		dateTimePrinter.start();
		
		threadStatePrinter.start();
		*/
				
		//Exercicio 02
	    System.out.println("\n\n\nSolucao para exercicio 02");
	    System.out.println("------------------------------");
	    class Aeroporto extends Thread{
	    	private String nomeAeroporto;
	    	private boolean pistaDisponivel = true;
	    	
	    	public Aeroporto(String nomeAeroporto){
	    		this.nomeAeroporto = nomeAeroporto;
	    	}
	    	
	    	public boolean aguardarPistaDisponivel(){
	    		return true;
	    	}
	    	
	    	public void alterarEstadoPista(){
	    		pistaDisponivel = !pistaDisponivel;
	    	}
	    	
	    	@Override
	    	public void run() {
	    		while(true){
					try{
						sleep(1_000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
	    			
		    		System.out.println(pistaDisponivel);
	    		}
	    	}
	    }
	    
	    class Aviao extends Thread{
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
					Thread.sleep(2_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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
	    
	    Aeroporto aeroporto = new Aeroporto("Barra Funda");
	    Aviao aviaoTAN = new Aviao("", )
	    
	    aeroporto.alterarEstadoPista();
	    aeroporto.run();
	}

}
