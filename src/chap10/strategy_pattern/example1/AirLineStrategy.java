package chap10.strategy_pattern.example1;

public class AirLineStrategy implements MovableStrategy{

	@Override
	public void move() {
		System.out.println("항로를 통해 이동");
	}
	
}
