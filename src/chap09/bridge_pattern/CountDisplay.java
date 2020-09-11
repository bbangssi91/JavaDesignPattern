package chap09.bridge_pattern;

public class CountDisplay extends Display{

	// Constructor
	public CountDisplay(DisplayImpl displayImpl) {
		super(displayImpl);
	}
	
	/**
	 * 매개변수로 넘어온 횟수만큼 display를 반복하는 메소드
	 * 
	 * @param	times
	 * @return 	void
	 */
	public void multiDisplay(int times) {
		open();
		for(int i = 0; i < times; i++) print();		
		close();
	}
	
	
}
