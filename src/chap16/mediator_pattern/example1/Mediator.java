package chap16.mediator_pattern.example1;

/**
 * 중개인의 인터페이스(API)를 결정하는 인터페이스
 */
public interface Mediator {

	public void createColleagues();
	public void colleagueChanged(); // 상태가 변경될 때, 해당 메소드 호출됨
}
