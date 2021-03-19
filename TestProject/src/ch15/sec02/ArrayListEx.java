package ch15.sec02;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>(5);
		
		Employee e1 = new Employee(100, "ÀÌ»ç¿ø", 56000.55);
		Employee e2 = new Employee(200, "È«±æµ¿", 66000.55);
		Employee e3 = new Employee(300, "±è°úÀå", 76000.55);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			Employee emp = list.get(i);
			System.out.println(emp);
		}
	}

}
