package chap10.strategy_pattern.example1;

public class Moving {
	
	private MovableStrategy movableStrategy;
			
	public void setMovableStrategy(MovableStrategy movableStrategy) {
		this.movableStrategy = movableStrategy;
	}

	public void move() {
		movableStrategy.move();
	}
	
}
