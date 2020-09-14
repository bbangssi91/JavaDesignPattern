package chap09.bridge_pattern.example2;

import chap09.bridge_pattern.example2.func.RandomCountDisplay;
import chap09.bridge_pattern.example2.impl.CharDisplayImpl;
import chap09.bridge_pattern.example2.impl.StringDisplayImpl;

public class Main {

	public static void main(String[] args) {
		RandomCountDisplay randomCountDisplay = new RandomCountDisplay(
													new StringDisplayImpl("Bridge Pattern add-method")
													);
		
		try 
		{
			randomCountDisplay.randomDisplay(7);
			//randomCountDisplay.randomDisplay(0); // nextInt() 메소드 호출 할때, 0이하 정수를 매개변수로 넘겨주면 IllegalArgumentException 발생
			
			randomCountDisplay = new RandomCountDisplay(new CharDisplayImpl('A'));
			randomCountDisplay.randomDisplay(5);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
