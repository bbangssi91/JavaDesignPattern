package chap12.decorator_pattern.example1;

/**
 * 장식을 표시하는 추상 클래스이지만, 문자열 표시를 실행하는 
 * Display 클래스의 하위클래스로 정의
 */

public abstract class Border extends Display{
	
	protected Display display;
	
	// Constructor
	protected Border(Display display) {
		this.display = display;
	}
	
}
