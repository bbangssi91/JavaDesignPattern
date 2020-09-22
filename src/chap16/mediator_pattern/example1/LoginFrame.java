package chap16.mediator_pattern.example1;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Mediator 인터페이스 구현, 로그인 다이얼로그를 나타내는 클래스
 */
public class LoginFrame extends Frame implements ActionListener, Mediator{

	private static final long serialVersionUID = 2381906532199932557L;

	private ColleagueCheckbox checkLogin;
	private ColleagueCheckbox checkGuest;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;
	
	
	// Constructor
	// Colleague들을 생성하고, 배치한 후에 표시를 실행
	public LoginFrame(String title) {
		super(title);
		setBackground(Color.LIGHT_GRAY);
		
		// 레이아웃 매니저를 사용하여 4x2 그리드 생성
		setLayout(new GridLayout(4, 2));
		
		// Colleague들의 생성
		createColleagues();
		// 배치
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		// 유효|무효 초기 지정
		colleagueChanged();
		
		// display
		pack();
		setVisible(true);
		
	}
	
	
	
	@Override
	public void createColleagues() {
		
		// Colleague 생성
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		buttonOk = new ColleagueButton("Ok");
		buttonCancel = new ColleagueButton("Cancel");
		
		// Mediator의 세트
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		// EventListner 세트
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
		
	}

	/**
	 * Colleague에서의 통지로 Colleague의 유효|무효를 판정함
	 */
	@Override
	public void colleagueChanged() {
		// Guest에 체크되어있을 경우 Username과 Password를 disable 처리한다
		if(checkGuest.getState()) 
		{
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		}
		else 
		{
			textUser.setColleagueEnabled(true);
			userpassChanged();
		}
		
	}

	private void userpassChanged() {
		if(textUser.getText().length() > 0) // username에 텍스트가 입력되어있을 때, 
		{
			textPass.setColleagueEnabled(true); // password 활성화
			if(textPass.getText().length() > 0) // password값이 입력되어 있을 때,
			{
				buttonOk.setColleagueEnabled(true); // ok 버튼 활성화
			}
			else
			{
				buttonOk.setColleagueEnabled(false); // 아니면 ok 버튼 비활성화
			}
		}
		else // username에 텍스트가 입력되어있지 않으면,
		{
			textPass.setColleagueEnabled(false); // password 비활성화
			buttonOk.setColleagueEnabled(false); // ok 버튼 비활성화
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		System.exit(0);
		
	}
	
	
	
}
