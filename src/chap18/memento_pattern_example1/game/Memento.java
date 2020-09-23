package chap18.memento_pattern_example1.game;

import java.util.ArrayList;
/**
 * game 패키지 외부에서 인스턴스를 수정하지 못하도록 
 * 전부 접근제한자 default로 설정
 */
public class Memento {

	int money;
	ArrayList<String> fruits;
	
	// Constructor
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	
	public int getMoney() { // 소지금을 얻는다 (narrow interface)
		return money;
	}
	
	void addFruit(String fruit) { // 과일을 추가한다 (wide interface)
		fruits.add(fruit);
	}
	
	ArrayList<String> getFruits(){ // 과일을 얻는다 (wide interface)
		return (ArrayList<String>) fruits.clone();
	}
	
}
