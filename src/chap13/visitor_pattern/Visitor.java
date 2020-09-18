package chap13.visitor_pattern;

public abstract class Visitor {

	public abstract void visit(File file);
	public abstract void visit(Directory directory);
	
}
