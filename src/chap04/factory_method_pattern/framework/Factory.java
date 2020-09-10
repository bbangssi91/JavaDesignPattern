package chap04.factory_method_pattern.framework;

public abstract class Factory {
	
	// Using Template Method Pattern
	public final Product create(String owner) {
		System.out.println(">> Factory : call create()");
		Product product = createProduct(owner);
		registerProduct(product);
		return product;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
	
}
