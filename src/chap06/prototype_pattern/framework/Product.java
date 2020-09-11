package chap06.prototype_pattern.framework;

public interface Product extends Cloneable{
	
	public abstract void use(String s);
	public abstract Product createClone(); // 인스턴스를 복사하기 위함
}
