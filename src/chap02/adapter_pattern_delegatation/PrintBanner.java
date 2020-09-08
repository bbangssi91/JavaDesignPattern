package chap02.adapter_pattern_delegatation;

public class PrintBanner implements Print{

	private Banner banner;
	
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
