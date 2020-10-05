package chap21.proxy_pattern.example1;

public class PrinterProxy implements Printable{
	
	private String name;
	private Printer real;
	
	// Default Constructor
	public PrinterProxy() {
	}
	
	// Constructor
	public PrinterProxy(String name) {
		this.name = name;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		
		if(real != null) 
		{
			real.setPrinterName(name); // 본인에게도 설정
		}
		
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
		
	}

	private synchronized void realize() { // 본인을 생성
		if(real == null) real = new Printer(name);
		
	}
	
	
	
}
