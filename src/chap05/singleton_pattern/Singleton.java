package chap05.singleton_pattern;

public class Singleton {
	// 다른 클래스에서 Singleton 인스턴스 호출 금지
	private final static Singleton singleton = new Singleton();
	
	// Constructor
	public Singleton() {
		System.out.println(">> create Instance");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}
