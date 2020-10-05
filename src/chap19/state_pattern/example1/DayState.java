package chap19.state_pattern.example1;

public class DayState implements State{

	private static final DayState singleton = new DayState();
	
	// private Constructor
	private DayState() {
	}
	
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		if(hour < 9 || hour >= 17)
		{
			context.changeState(NightState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("금고사용 (주간)");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨 사용 (주간)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("일반통화 (주간)");
	}
 
	@Override
	public String toString() {
		return "[주간]";
	}
	
	
}
