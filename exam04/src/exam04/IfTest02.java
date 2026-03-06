package exam04;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로부터 입력받는 값을 기다렸다가 들어요면 가져온다
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이 입력: ");
		int age = scan.nextInt(); // 정수값 입력 대기
		
		if(age > 19) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}
		
		// 스캐너 사용 후 닫아줘야 함
		scan.close();
	}

}
