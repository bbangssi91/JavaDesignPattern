package chap04.factory_method_pattern.idcard;

import chap04.factory_method_pattern.framework.Product;

public class IDCard extends Product {

	private String owner;
	
	// Constructor
	public IDCard(String owner) {
		System.out.println(">> IDCard constructor : " + owner);
		System.out.println(owner + " 의 카드를 만듭니다.");
		System.out.println();
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println(owner + " 의 카드를 사용합니다.");

	}
	public String getOwner() {
		return owner;
	}
}
