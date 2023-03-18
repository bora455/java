package p12;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> List = new ArrayList<Board>();
		
		List.add(new Board("제목1", "내용1", "글쓴이1"));
		List.add(new Board("제목2", "내용2", "글쓴이2"));
		List.add(new Board("제목3", "내용3", "글쓴이3"));
		List.add(new Board("제목4", "내용4", "글쓴이4"));
		List.add(new Board("제목5", "내용5", "글쓴이5"));

		List.remove(2);
		List.remove(3);
		
		for(int i=0; i<List.size(); i++) {
			Board board = List.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}
