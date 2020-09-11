package chap06.prototype_pattern;

import chap06.prototype_pattern.framework.Product;

public class MessageBox implements Product{

	private char decoChar;
	
	// Constructor
	public MessageBox(char decoChar) {
		this.decoChar = decoChar;
	}
	
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		
		outerDesign(length); // top 
		System.out.println(decoChar + " " + s + " " + decoChar); // content
		outerDesign(length); // bottom
	}

	@Override
	public Product createClone() {
		Product p = null;
			
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return p;
	}

	private void outerDesign(int length) {
		for(int i = 0; i < length + 4; i++) System.out.print(decoChar);
		System.out.println();
	}

}
