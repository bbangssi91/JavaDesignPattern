package chap19.state_pattern.example1;

public class Main {

	public static void main(String[] args) {
		SafeFrame safeFrame = new SafeFrame("State Pattern");
		
		while(true) 
		{
			for(int hour = 0; hour < 24; hour++) 
			{
				safeFrame.setClock(hour); // 시간설정
				
				try 
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			
		}// end while

	} // end main
}
