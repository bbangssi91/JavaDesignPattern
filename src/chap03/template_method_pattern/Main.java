package chap03.template_method_pattern;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay abstractDisplay = new CharDisplay('A');
		abstractDisplay.display();
				
		abstractDisplay = new StringDisplay("Template Method Pattern");
		abstractDisplay.display();
				
	}

}
