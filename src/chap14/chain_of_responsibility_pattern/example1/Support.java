package chap14.chain_of_responsibility_pattern.example1;

public abstract class Support {

	private String name;
	private Support next;
	
	// Constructor
	public Support(String name) {
		this.name = name; 
	}
	
	public Support setNext(Support next) { // 떠넘기는 곳을 설정
		this.next = next;
		return next;
	}
	
	// Template Method Pattern
	public final void support(Trouble trouble) {
		
		if(resolve(trouble)) 
		{
			done(trouble);
		}
		else if(next != null) 
		{
			next.support(trouble);
		}
		else
		{
			fail(trouble);
		}
		
	}

	// 하위클래스에서 구현할 곳을 상정
	protected abstract boolean resolve(Trouble trouble);

	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
		
	}
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
		
	}
	
	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	
}
