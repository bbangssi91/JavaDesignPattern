package chap05.singleton_pattern.example2;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		TicketMaker obj = TicketMaker.getInstance();
		
		IntStream.range(0, 10).forEach((int i) -> System.out.println(obj.getNextTicketNumber()));

	}

}
