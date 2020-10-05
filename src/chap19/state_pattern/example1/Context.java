package chap19.state_pattern.example1;

public interface Context {
	
	public void setClock(int hour); 				// 시간설정
	public void changeState(State state); 			// 상태전환
	public void callSecurityCenter(String msg); 	// 경비센터 호출
	public void recordLog(String msg); 				// 경비센터 기록
}
