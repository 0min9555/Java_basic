package ch11.sec07;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "java";
		String name = "홍길동";
		String tel = "010-1234-5678";
		
		String text = "회원 ID : {0} \n회원이름 : {1} \n회원전화 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		System.out.println("-------------");
		
		String sql = "insert into member values({0}, {1}, {2})";
		Object[] arguments = {"'Java'", "'홍길동'", "'010-1234-5678'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
	}

}
