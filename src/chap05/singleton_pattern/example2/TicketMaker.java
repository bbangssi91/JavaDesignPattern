package chap05.singleton_pattern.example2;

public class TicketMaker {
	
	private final static TicketMaker singleton = new TicketMaker(); 
	
	private int ticket = 1000;
	
	private TicketMaker() {
		System.out.println(">> create Instance");
	}
			
	public static TicketMaker getInstance() {
		return singleton;
	}
	
	// multi thread 상황에서 Thread-safe 하기위해 synchronized 키워드 사용
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
	
}
