package chap21.proxy_pattern.example1;

public class Printer implements Printable{

	private String name;
	
	// Default Constructor
	public Printer() {
		heavyJob("Printer의 인스턴스를 생성중");
	}
	
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer의 인스턴스 ( " + name + " )을 생성 중");
	}

	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
	
	/**
	 * 무거운 일 (1000ms)에 한번씩 마침표(.) 표시하는 메소드
	 * @param string
	 */
	private void heavyJob(String msg) {
		System.out.print(msg);
		for(int i = 0; i < 5; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println();
		System.out.println("[완료]");
	}
	
	
}
