package exam04;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int score = scan.nextInt();
		
		if (score >= 90 ) {
			System.out.println("점수 : " + score + " A");
		} else if (score >= 80) {
			System.out.println("점수 : "+ score + " B");
		} else if (score >= 70) {
			System.out.println("점수 : "+ score + " C");
		} else {
			System.out.println("점수 : " + score + " D");
		}
		
		scan.close();

	}

}
