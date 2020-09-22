package chap16.mediator_pattern.example1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Colleague 인터페이스를 구현, 체크박스를 나타내는 클래스
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague{

	private static final long serialVersionUID = -579961420628666007L;

	private Mediator mediator;
	
	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
		super(caption, group, state);
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled); // Mediator에서 유효|무효를 지시
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		mediator.colleagueChanged(); // 상태가 변경되면 mediator에 통지
	}
	
}
