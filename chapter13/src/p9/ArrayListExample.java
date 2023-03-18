package p9;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> List = new ArrayList<String>();
		
		List.add("Java");
		List.add("JDBC");
		List.add("Servlet/JSP");
		List.add(2, "Database");
		List.add("iBATIS");
		
		int size = List.size();
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		System.out.println();
		
		String skill = List.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<List.size(); i++) {
			String str = List.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		List.remove(2);
		List.remove(2);
		List.remove("iBATIS");
		
		for(int i=0; i<List.size(); i++) {
			String str = List.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
