package chap19.state_pattern.example1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SafeFrame extends Frame implements ActionListener, Context{
	
	private static final long serialVersionUID = 5792851049878051970L;
	
	// Frame Component 객체 선언
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10, 60);
	private Button buttonUse = new Button("Use");
	private Button buttonAlarm = new Button("Alarm");
	private Button buttonPhone = new Button("Call");
	private Button buttonExit = new Button("Exit");
	
	// 현재 State는 낮
	private State state = DayState.getInstance();
	
	// Constructor
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		
		// textClock 배치
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		
		// textScreen 배치
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		
		// save button to panel
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		
		add(panel, BorderLayout.SOUTH);
		
		// display panel
		pack();
		setVisible(true);
		
		// set Action Listener 
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);		
	}

	/**
	 * 버튼 눌렸을 때 이벤트 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		
		if(e.getSource() == buttonUse) 			state.doUse(this); 		// 1. 금고사용 버튼
		else if(e.getSource() == buttonAlarm) 	state.doAlarm(this);	// 2. 비상벨 버튼
		else if(e.getSource() == buttonPhone) 	state.doPhone(this); 	// 3. 일반통화 버튼
		else if(e.getSource() == buttonExit) 	System.exit(0); 		// 4. 종료 버튼
		else 									System.out.println("?");
	}
	
	/**
	 * 시간 설정 메소드
	 */
	@Override
	public void setClock(int hour) {
		String clockString = "현재 시간 : ";
		if(hour < 10) 
		{
			clockString += "0" + hour + ":00";
		}
		else 
		{
			clockString += hour + ":00";
		}
		
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	/**
	 * 상태변화 메소드
	 */
	@Override
	public void changeState(State state) {
		System.out.println(this.state + " -> " + state + " 로 state 변경");
		this.state = state;
	}

	/**
	 * 경비센터 호출 메소드
	 */
	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("call! " + msg + "\n");
	}

	/**
	 * 경비센터 기록 메소드
	 */
	@Override
	public void recordLog(String msg) {
		textScreen.append("record ... " + msg + "\n");
	}

	
	
}
