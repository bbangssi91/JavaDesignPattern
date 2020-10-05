package chap19.state_pattern.example1;

public interface State {

	public void doClock(Context context, int hour); 	// 시간이 설정되었을 때
	public void doUse(Context context); 				// 금고가 사용되었을 때
	public void doAlarm(Context context); 				// 비상벨이 눌러졌을 때
	public void doPhone(Context context); 				// 일반통화를 할 때
}
