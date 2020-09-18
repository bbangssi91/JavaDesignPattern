package chap14.chain_of_responsibility_pattern.example1;

/**
 * limit 에서 지정한 번호 미만의 트러블을 해결하는 클래스
 */

public class LimitSupport extends Support{

	private int limit;
	
	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		
		if(trouble.getNumber() < limit) return true; // limit보다 작을 때만 true 리턴
		return false;
	}

}
