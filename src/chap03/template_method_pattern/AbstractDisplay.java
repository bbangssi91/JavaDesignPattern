package chap03.template_method_pattern;

public abstract class AbstractDisplay {
	
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	/**
	 * open() 실행 후, 5번을 print()를 반복한다.
	 * 단, print()의 구체적인 구현은 하위클래스에서 처리하도록 한다.
	 * 작업을 마치면 close()를 실행한다.
	 */
	public final void display() {
		
		open();
		
		for(int i = 0; i < 5; i++)
		{
			print();
		}
		
		close();
	}// end display
	
}
