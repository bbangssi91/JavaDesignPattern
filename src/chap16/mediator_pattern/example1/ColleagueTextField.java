package chap16.mediator_pattern.example1;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Colleague 인터페이스를 구현, 텍스트 입력을 실행하는 클래스
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague{

	private static final long serialVersionUID = -7908185398907915324L;
	
	private Mediator mediator;
	
	// Constructor
	public ColleagueTextField(String text, int columns) {
		super(text, columns); // init TextField constrctor 
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled); // Mediator에서 유효|무효를 지시
		setBackground(enabled ? Color.WHITE : Color.LIGHT_GRAY);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged(); // 상태가 변경되면 mediator에 통지
	}

	
	
}
