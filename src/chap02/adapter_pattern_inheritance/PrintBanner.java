package chap02.adapter_pattern_inheritance;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
		
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
