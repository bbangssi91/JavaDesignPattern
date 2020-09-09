package chap02.adapter_pattern_inheritance;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Adapter Pattern by Using Inheritance");
		p.printStrong();
		p.printWeak();
		
	}

}
