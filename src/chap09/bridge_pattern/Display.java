package chap09.bridge_pattern;

public class Display {
	
	private DisplayImpl displayImpl;
	
	// Constructor
	public Display(DisplayImpl displayImpl) {
		this.displayImpl = displayImpl;
	}
	
	/**
	 * 표현의 전처리를 하는 메소드
	 * 
	 * @return void
	 */
	public void open() {
		displayImpl.rawOpen();
	}
	
	/**
	 * 표현을 하는 메소드
	 * 
	 * @return void
	 */
	public void print() {
		displayImpl.rawPrint();
	}
	
	/**
	 * 표현의 후처리를 하는 메소드
	 * 
	 *	@return void 
	 */
	public void close() {
		displayImpl.rawClose();
	}
	
	/**
	 * 표현을 마치면 display하는 메소드
	 * 
	 * @return void
	 */
	public final void display(){
		open();
		print();
		close();
	}
	
	
}
