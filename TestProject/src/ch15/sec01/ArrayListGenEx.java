package ch15.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Serviet/JSP");
		list.add(2,"Database");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : "+size);
		
		System.out.println();		

		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		
		System.out.println();
		
		System.out.println("2 : "+list.get(2));
		
		list.remove(2);
		list.remove(2);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
	}

}
