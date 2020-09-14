package chap10.strategy_pattern.example1;

public class RoadStrategy implements MovableStrategy{

	@Override
	public void move() {
		System.out.println("도로를 통해 이동");
	}
	
}
