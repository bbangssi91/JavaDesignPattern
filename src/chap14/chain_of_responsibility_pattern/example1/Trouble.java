package chap14.chain_of_responsibility_pattern.example1;

/**
 * 발생한 트러블을 나타내는 클래스
 * 트러블 번호를 반환한다
 */
public class Trouble {
	
	private int number; // 트러블 번호
	
	public Trouble(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return "[Trouble " + number + "]";
	}
	
}
