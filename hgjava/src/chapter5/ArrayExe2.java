package chapter5;

public class ArrayExe2 {

	public static void main(String[] args) {
		
		//������ ���� �� �ִ� �迭�� ����(ũ��� 10���� ������ ����).
		int [] intAry = new int [10];
		//���� �̸��� intAry => 10~100 ��� ���� 
		for(int i = 0 ; i < intAry.length; i++) {  //�� ������ ������ �̷��� for �� ���
			intAry[i] = (i + 1) *10; 
		}
//		intAry[0] = 10;
//		intAry[1] = 20;
//		intAry[2] = 30;
//		intAry[3] = 40;
//		intAry[4] = 50;
//		intAry[5] = 60;
//		intAry[6] = 70;
//		intAry[7] = 80;
//		intAry[8] = 90;
//		intAry[9] = 100;
		
		//���
		
		int sum = 0;    //50���� ū ���� ����
		double avg = 0;
		int count = 0;
		for (int num : intAry) {
			System.out.println(num);         //�ٸ� ���
			if(num >50) {
				sum += num;
				count ++;   //50���� ū ���� ����� ���ϱ� ���� 50�� ���������� 1++���� 
			}
		}
		avg = sum / count;
		System.out.println("50���� ū ���� �հ�"+ sum);
		System.out.println("50���� ū ���� ���"+ (avg));  
			
////		for(int i = 0; i <intAry.length; i++) {
////			System.out.println(intAry[i]);
////			
//		}
//		
		

	}//end main

}//end class
