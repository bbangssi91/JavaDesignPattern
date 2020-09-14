package chap09.bridge_pattern.example2.impl;

public class CharDisplayImpl extends DisplayImpl{

	private char ch;
	
	public CharDisplayImpl(char ch) {
		this.ch = ch;		
	}
	
	
	@Override
	public void rawOpen() {
		System.out.println(">> Start CharDisplayImpl");
	}

	@Override
	public void rawPrint() {
		System.out.println("[" + ch + "]");		
	}

	@Override
	public void rawClose() {
		System.out.println(">> End CharDisplayImpl");
	}
	
	
	
}
