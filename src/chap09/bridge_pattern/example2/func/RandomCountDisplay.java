package chap09.bridge_pattern.example2.func;

import java.util.Random;

import chap09.bridge_pattern.example2.impl.DisplayImpl;

public class RandomCountDisplay extends CountDisplay{

	private Random random = new Random();
	
	public RandomCountDisplay(DisplayImpl displayImpl) {
		super(displayImpl);		
	}
	
	/**
	 * 0 이상 times 미만인 경우에만 랜덤 횟수만큼 표시하는 메소드
	 * 
	 * @param times
	 * @return void
	 * @throws Exception 
	 */
	public void randomDisplay(int times) throws Exception {
		
		try 
		{
			multiDisplay(random.nextInt(times));
		}
		catch (Exception e) 
		{
			throw new Exception(">> [0 을 초과하는 정수를 입력하시오.]");
		}
	}
	
}
