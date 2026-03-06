package exam02;

public class OperatorExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		byte byNum1 = 10;
		long lyNum1 = 20;
		double dyNum1 = 33.3333;
		
		// byte끼리 더했는데 결과는 int로 뜬다
		// byte byResult = byNum1 + byNum1;
		
		int inResult1 = byNum1 + byNum1;
		
		long lnResult1 = lyNum1 + num1;
		
		inResult1 = byNum1 + num1;
		
		int target = 10;
		
		System.out.println(target % 3);
	}

}
