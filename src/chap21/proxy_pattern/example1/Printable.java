package chap21.proxy_pattern.example1;

public interface Printable {

	public void setPrinterName(String name); // 이름 설정
	public String getPrinterName(); // 이름 취득
	public void print(String string); // 문자열 표시
	
}
