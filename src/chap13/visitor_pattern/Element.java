package chap13.visitor_pattern;

public interface Element {

	public void accept(Visitor v);
	
}
