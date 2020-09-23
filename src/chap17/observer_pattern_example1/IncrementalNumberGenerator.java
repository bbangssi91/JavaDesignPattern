package chap17.observer_pattern_example1;

public class IncrementalNumberGenerator extends NumberGenerator{
	
	private int curNum;
	private int endNum;
	private int incrementNum;
	
	public IncrementalNumberGenerator(int curNum, int endNum, int incrementNum) {
		this.curNum = curNum;
		this.endNum = endNum;
		this.incrementNum = incrementNum;
	}
	
	@Override
	public int getNumber() {
		return curNum;
	}

	@Override
	public void execute() {
		while(curNum < endNum)
		{
			notifyObservers();
			curNum += incrementNum;
		}
		
	}

}
