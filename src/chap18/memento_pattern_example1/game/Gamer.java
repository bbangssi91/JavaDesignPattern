package chap18.memento_pattern_example1.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gamer {

	private int money;
	private ArrayList<String> fruits = new ArrayList<>();
	private Random random = new Random();
	private static String[] fruitsName = {"사과", "포도", "바나나", "귤"};
	
	// Constructor
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void bet() {
		
		int dice = random.nextInt(6) + 1;
		
		if(dice == 1) // 
		{
			money += 100;
			System.out.println("소지금이 증가하였습니다.");
		}
		else if(dice == 2) 
		{
			money /= 2;
			System.out.println("소지금이 절반이 되었습니다.");
		}
		else if(dice == 6) 
		{
			String f = getFruit();
			System.out.println("과일 (" + f + ") 을 받았습니다.");
			fruits.add(f);
		}
		else 
		{
			System.out.println("변한 것이 없습니다.");
		}
		
		
	}
	
	/**
	 * 현재의 상태를 스냅샷 찍는 메소드
	 * 
	 * @return memento
	 */
	public Memento createMemento() {
		Memento memento = new Memento(money); // 현재 Gamer의 상태를 Memento 인스턴스에 저장
		Iterator<String> it = fruits.iterator();
		
		while(it.hasNext()) 
		{
			String f = it.next();
			if(f.startsWith("맛있는"))
			{
				memento.addFruit(f);
			}
		}
		
		return memento;
	}
	
	/**
	 * undo를 실행하는 메소드
	 * Memento 인스턴스를 기초로 자신의 상태를 복원
	 * 
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}
	
	@Override
	public String toString() {
		return "[money = " + money + ", fruits = " + fruits + " ]";
	}
	
	private String getFruit() {
		String prefix = "";
		if(random.nextBoolean()) {
			prefix = "Delicious";
		}
		
		return prefix + fruitsName[random.nextInt(fruitsName.length)];
	}
	
	
	
}
