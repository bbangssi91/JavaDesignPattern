package chap07.builder_pattern.example1;

public class Director {
	
	private Builder builder; 
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	
	/**
	 * 문서 구축을 위한 메소드
	 */
	public void construct() {
		
		builder.makeTitle("Greetings"); 	// 문서구축
		builder.makeString("아침 혹은 낮에");		// 타이틀
		builder.makeItems(new String[] {	// 개별항목
				"안녕하세요.",
				"좋은 아침입니다",
		});
		System.out.println();
		
		builder.makeString("밤에");
		builder.makeItems(new String[] {
				"안녕하세요.",
				"안녕히 주무세요.",
				"안녕히 계세요."
		});
		
		builder.close(); // 문서 완성
	}
			
}
