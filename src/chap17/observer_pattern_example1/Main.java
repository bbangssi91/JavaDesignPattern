package chap17.observer_pattern_example1;

public class Main {

	public static void main(String[] args) {
		//NumberGenerator numberGenerator = new RandomNumberGenerator();
		NumberGenerator incGenerator = new IncrementalNumberGenerator(10, 50, 5);
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		incGenerator.addObserver(observer1);
		incGenerator.addObserver(observer2);
		/*		
		numberGenerator.addObserver(observer1);
		numberGenerator.addObserver(observer2);
		numberGenerator.execute();
		*/
		incGenerator.execute();
	}

}
