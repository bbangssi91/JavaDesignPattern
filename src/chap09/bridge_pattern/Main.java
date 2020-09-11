package chap09.bridge_pattern;

public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Moon"));
		Display d2 = new Display(new StringDisplayImpl("Hello, World"));
		
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Bridge Pattern"));
		
		d1.display();
		d2.display();
		d3.display();
	}

}
