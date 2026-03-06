package exam03;

public class ChangeTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 15;
		long lyNum1 = 20;
		byte byNum1 = 0;
		
		// 자동형변환
		lyNum1 = num1;
		
		// 강제형변환
		byNum1 = (byte)num1;
		
		int num2 = 130;
		byte byNum2 = 0;
		
		byNum2 = (byte)num2;
		
		System.out.println("형변환1 int " + num1 + "---> long" + lyNum1);
		System.out.println("형변환2 int " + num1 + "---> byte" + byNum1);
		System.out.println("형변환3 int " + num2 + "---> byte" + byNum2);
		

	}

}
