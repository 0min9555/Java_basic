package ch15.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list = new ArrayList<Book>(5);
		
		Book b1 = new Book("1001","�ڹ�","ȫ�浿",20000,"21-01-01","�������ǻ�");
		Book b2 = new Book("1002","���̽�","�̸���",20000,"21-02-01","������ǻ�");
		Book b3 = new Book("1003","C","������",20000,"21-01-03","������ǻ�");
		Book b4 = new Book("1004","Spring","��븮",20000,"21-04-01","�������ǻ�");
		Book b5 = new Book("1005","jsp","�ڰ���",20000,"21-05-01","�ҿ����ǻ�");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		System.out.println(list.size());
		
		//���
		for(int i=0;i<list.size();i++) {
			Book book = list.get(i);
			System.out.println(book);
		}
		
		}

}
