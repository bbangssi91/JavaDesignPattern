package chap16.mediator_pattern.example1;

/**
 * 회원의 인터페이스(API)를 결정하는 인터페이스
 */
public interface Colleague {

	public void setMediator(Mediator mediator);
	public void setColleagueEnabled(boolean enabled);
}
