package chap12.decorator_pattern.example1;

/**
 * 복수 행으로 구성되는 문자열을 표시하기 위한 추상클래스
 * Template Method Pattern으로 구성
 */
public abstract class Display {

	public abstract int getColumns(); 				// 가로 문자수를 얻는다.
	public abstract int getRows(); 					// 세로 문자수를 얻는다.
	public abstract String getRowText(int row); 	// row번째의 문자열을 얻는다.
	
	public final void show() {
		for(int i = 0; i < getRows(); i++) 
		{
			System.out.println(getRowText(i));
		}
	}
	
}
