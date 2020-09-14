package chap09.bridge_pattern.example1;

import chap09.bridge_pattern.example1.func.CountDisplay;
import chap09.bridge_pattern.example1.func.Display;
import chap09.bridge_pattern.example1.impl.StringDisplayImpl;

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
