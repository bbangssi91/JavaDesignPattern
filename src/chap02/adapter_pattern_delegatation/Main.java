package chap02.adapter_pattern_delegatation;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("위임을 이용한 Adapter Pattern");
		p.printStrong();
		p.printWeak();
		
	}

}
