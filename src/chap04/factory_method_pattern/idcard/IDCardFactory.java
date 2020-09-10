package chap04.factory_method_pattern.idcard;

import java.util.ArrayList;
import java.util.List;

import chap04.factory_method_pattern.framework.Factory;
import chap04.factory_method_pattern.framework.Product;

public class IDCardFactory extends Factory{

	private List<String> owners = new ArrayList<>();
	
	@Override
	protected Product createProduct(String owner) {
		System.out.println(">> IDCardFactory : call createProduct()");
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
		
	}

	public List<String> getOwners() {
		return owners;
	}
}
