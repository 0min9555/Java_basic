package ch15.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list = new ArrayList<Book>(5);
		
		Book b1 = new Book("1001","자바","홍길동",20000,"21-01-01","서울출판사");
		Book b2 = new Book("1002","파이썬","이몽룡",20000,"21-02-01","사울출판사");
		Book b3 = new Book("1003","C","성춘향",20000,"21-01-03","우울출판사");
		Book b4 = new Book("1004","Spring","김대리",20000,"21-04-01","수울출판사");
		Book b5 = new Book("1005","jsp","박과장",20000,"21-05-01","소울출판사");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		System.out.println(list.size());
		
		//출력
		for(int i=0;i<list.size();i++) {
			Book book = list.get(i);
			System.out.println(book);
		}
		
		}

}
