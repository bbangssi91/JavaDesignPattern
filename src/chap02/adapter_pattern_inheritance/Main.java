package chap02.adapter_pattern_inheritance;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("상속을 이용한 Adapter Pattern");
		p.printStrong();
		p.printWeak();
		
	}

}
