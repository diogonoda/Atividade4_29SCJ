import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Stack;

public class Exercicio01 {

	public static void main(String[] args) {
		//Exercicio 01
	    System.out.println("Solucao para exercicio 01");
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
					System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
					
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
	}
}				
