package chap17.observer_pattern_example1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 수를 생성하는 추상클래스
 * 수의 생성과 수를 취득하는 부분은 하위 클래스에서 구현(subclass responsibility)
 */
public abstract class NumberGenerator {

	private ArrayList<Observer> observers = new ArrayList<>();
	
	// Observer를 저장
	public void addObserver(Observer observer) { 
		observers.add(observer);
	}

	// Observer를 삭제
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	
	// Observer에 알림
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		
		while(it.hasNext()) 
		{
			Observer obs = it.next();
			obs.update(this);
		}	
	}
	
	// 수를 취득
	public abstract int getNumber();
	
	// 수를 생성
	public abstract void execute();
	
}
