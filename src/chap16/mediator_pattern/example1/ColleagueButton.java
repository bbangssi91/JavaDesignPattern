package chap16.mediator_pattern.example1;

import java.awt.Button;

/**
 * Colleague의 인터페이스 구현, 버튼을 나타내는 클래스
 */
public class ColleagueButton extends Button implements Colleague{

	private static final long serialVersionUID = -1840767743071374258L;
	
	private Mediator mediator;
	
	// Constructor
	public ColleagueButton(String caption) {
		super(caption); // init Button constructor
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled); // Mediator에서 유효|무효를 지시
	}
	


}
