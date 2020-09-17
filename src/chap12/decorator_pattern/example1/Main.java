package chap12.decorator_pattern.example1;

public class Main {

	public static void main(String[] args) {
		/**
		 * 인스턴스 역할
		 * b1 : Hello, World를 장식없이 표현한 것
		 * b2 : b1에 대해서 '#' 문자로 좌우에 장식을 한 것
		 * b3 : b2에 대해서 전체 장식을 한 것
		 * b4 : "안녕하세요."에 여러 겹으로 장식을 한 것
		 */
		Display b1 = new StringDisplay("Hello, World");
		Display b2 = new SideBorder(b1, '#');
		Display b3 = new FullBorder(b2);
		
		b1.show();
		b2.show();
		b3.show();
		
		Display b4 = 
						new SideBorder(
							new FullBorder(
								new FullBorder(
									new SideBorder(
										new FullBorder(
											new StringDisplay(" Decorator Pattern ")
										), 
									'*'
									)	
								)
							), 
						'/'
						);
		
		b4.show();
		
		
	}

}
