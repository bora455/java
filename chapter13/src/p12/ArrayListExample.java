package p12;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> List = new ArrayList<Board>();
		
		List.add(new Board("����1", "����1", "�۾���1"));
		List.add(new Board("����2", "����2", "�۾���2"));
		List.add(new Board("����3", "����3", "�۾���3"));
		List.add(new Board("����4", "����4", "�۾���4"));
		List.add(new Board("����5", "����5", "�۾���5"));

		List.remove(2);
		List.remove(3);
		
		for(int i=0; i<List.size(); i++) {
			Board board = List.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}
