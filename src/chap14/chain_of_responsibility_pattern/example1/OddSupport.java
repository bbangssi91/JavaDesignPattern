package chap14.chain_of_responsibility_pattern.example1;

/**
 * 홀수 번호의 트러블을 처리하는 클래스
 */

public class OddSupport extends Support{

	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(trouble.getNumber() % 2 == 1) return true; // 홀수일때만 true 리턴
		return false;
	}

}
