package chap18.memento_pattern_example1;

import chap18.memento_pattern_example1.game.Gamer;
import chap18.memento_pattern_example1.game.Memento;

public class Main {

	public static void main(String[] args){
		Gamer gamer = new Gamer(100); // 최초 소지금은 100
		Memento memento = gamer.createMemento(); // 최초의 상태를 저장
		
		for(int i = 0; i < 100; i++) 
		{
			System.out.println("====> Stage " + i);
			System.out.println("현재상태 : " + gamer);
			
			gamer.bet(); // 게임 시작
			
			System.out.println("현재 소지금 : " + gamer.getMoney());
			
			// Memento 취급 결정
			if(gamer.getMoney() > memento.getMoney()) // 돈이 남아있으면 
			{
				System.out.println(">> 많이 증가했으므로 현재 상태 저장");
				gamer.createMemento();
			}
			else if(gamer.getMoney() < memento.getMoney() / 2)
			{
				System.out.println(">> 많이 감소했으므로 이전 상태로 복원");
				gamer.restoreMemento(memento);
			}
			
			// Time Waiting
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println();
			
		}
		

	}

}
