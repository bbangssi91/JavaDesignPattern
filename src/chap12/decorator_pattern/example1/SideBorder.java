package chap12.decorator_pattern.example1;

/**
 * 문자열의 좌우에 정해진 문자를 장식하는 클래스
 */
public class SideBorder extends Border{

	private char borderChar;
	
	public SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() {
		return (1+ display.getColumns() + 1); // 내용물 양쪽에 장식 문자 수 더한 것
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

	
	
}
