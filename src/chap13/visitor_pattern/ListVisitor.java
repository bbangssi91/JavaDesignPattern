package chap13.visitor_pattern;

import java.util.Iterator;

public class ListVisitor extends Visitor{

	private String currentDir = ""; // 현재 주목하고 있는 디렉터리의 이름 저장
	
	@Override
	public void visit(File file) {
		System.out.println(currentDir + "/" + file);
		
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentDir + "/" + directory);
		
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		
		Iterator<Entry> it = directory.iterator();
		
		while(it.hasNext()) 
		{
			Entry entry = it.next();
			entry.accept(this);
		}
		
		currentDir = saveDir;
				
	}
	
	

}
