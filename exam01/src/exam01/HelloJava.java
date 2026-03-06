package exam01;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주석
		/*
		 * 여러줄로
		 * 주석을 쓸 수 있다
		 */
		
		// 정수형 타입 선언
		int num1 = 10;
		byte byNum = 20;
		
		// 실수
		double doubleNum = 30.3111;
		float flNum = 33.12f; // float 쓸떄는 f를 붙혀야함
		
		// 문자
		char ch = 'A';
		
		// 문자열
		String str = "날씨";
		
		// 논리형
		boolean b = false;
		
		// 문장이 끝나고 줄이 바뀌는 명령
		System.out.println(num1);
		System.out.println(byNum);
		System.out.print(doubleNum +"\n");
		System.out.println(ch);
		System.out.println(str);
		System.out.println(b);
		

	}

}
