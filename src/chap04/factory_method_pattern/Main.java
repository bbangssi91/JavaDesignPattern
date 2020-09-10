package chap04.factory_method_pattern;

import chap04.factory_method_pattern.framework.Factory;
import chap04.factory_method_pattern.framework.Product;
import chap04.factory_method_pattern.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Cole");
		Product card2 = factory.create("Emma");
		Product card3 = factory.create("Jack");
		
		System.out.println("===========");
		
		card1.use();
		card2.use();
		card3.use();
		
	}

}
