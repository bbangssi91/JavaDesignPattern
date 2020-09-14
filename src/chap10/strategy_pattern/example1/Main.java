package chap10.strategy_pattern.example1;

public class Main {

	public static void main(String[] args) {
		Moving train = new Train();
		Moving bus = new Bus();
		Moving airplane = new Airplane();
		
		train.setMovableStrategy(new RailLoadStrategy());
		train.move();
		
		bus.setMovableStrategy(new RoadStrategy());
		bus.move();

		airplane.setMovableStrategy(new AirLineStrategy());
		airplane.move();
		
	}

}
