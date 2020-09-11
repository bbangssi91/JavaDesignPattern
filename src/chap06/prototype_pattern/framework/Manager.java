package chap06.prototype_pattern.framework;

import java.util.HashMap;

public class Manager {
	
	private HashMap<String, Object> showcase = new HashMap<>();
	
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	
	public Product create(String protoName) {
		Product p = (Product) showcase.get(protoName);
		return p.createClone();
	}
	
	
}
