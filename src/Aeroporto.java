public class Aeroporto extends Thread {
   	private String nomeAeroporto;
   	private boolean pistaDisponivel = true;
    	
   	public Aeroporto(String nomeAeroporto){
   		this.nomeAeroporto = nomeAeroporto;
   	}
    	
   	public synchronized void aguardarPistaDisponivel(){
   		try{
   			wait();
   		}catch(InterruptedException e){
   			e.printStackTrace();
   		}
   	}
    	
   	public synchronized void alterarEstadoPista(){
   		pistaDisponivel = !pistaDisponivel;
   		
   		if(pistaDisponivel){
   			System.out.println("Disponivel");
   	   		notify();
   		}else{
   			System.out.println("Pista Fechada");
   		}   		
   	}
    	
   	@Override
   	public void run() {
   		while(true){
   			alterarEstadoPista();
   			
			try{
				sleep(3_000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
   		}
   	}
}