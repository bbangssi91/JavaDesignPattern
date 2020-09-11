package chap07.builder_pattern.example1;

import java.util.stream.IntStream;

public class TextBuilder extends Builder{

	private StringBuffer sb = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		sb.append("========================\n");
		sb.append("『" + title + "』\n");
		sb.append("\n");
	}

	@Override
	public void makeString(String str) {
		sb.append('■' + str + "\n"); // 글머리 기호 붙은 문자열
		sb.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		IntStream.range(0, items.length)
				 .forEach((int i) -> sb.append(" ⊙" + items[i] + "\n")); // 글머리 기호 붙은 항목
		sb.append("\n");
	}

	@Override
	public void close() {
		sb.append("========================\n");
	}

	/**
	 * 완성한 문서(결과)를  String 타입으로 리턴한다.
	 * 
	 * @return String
	 */
	public String getResult() {
		return sb.toString();
	}
	
}
