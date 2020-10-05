package chap21.proxy_pattern.example1;

/**
 * Printer 클래스와 PrinterProxy클래스는 
 * 같은 Printable 인터페이스를 구현하고 있기 때문에 실제 호출하는 클래스가 어떤 쪽이던 상관없음
 */
public class Main {

	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice");
		System.out.println("현재 이름 : " + p.getPrinterName());
		p.setPrinterName("Bob");
		System.out.println("현재 이름 : " + p.getPrinterName());
		p.print("Hello World");

		/**
		 * Printable p = new Printer();
		 */
	}

}
