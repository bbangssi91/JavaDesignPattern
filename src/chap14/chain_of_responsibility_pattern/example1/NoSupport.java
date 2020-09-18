package chap14.chain_of_responsibility_pattern.example1;

/**
 * 아무것도 문제를 처리하지 않는 클래스
 */
public class NoSupport extends Support{

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}

}
