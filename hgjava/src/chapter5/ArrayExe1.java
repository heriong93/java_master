package chapter5;

public class ArrayExe1 {

	public static void main(String[] args) {
		int a = 10;
		int[] ary = {10,20,33}; //�����ϸ鼭 �ʱ� �� ���ϴ� ���
		//int sum = ary[0] + ary[1]+ary[2]; //�ε��� ������ �ҷ����� 
		int sum = 0;
		for(int i = 0; i< ary.length; i++) {    //���� �������� for������ �ݺ����� �����°� ���� ary.length ��ŭ ������
			sum = sum + ary[i];
		}
		System.out.println("�հ��"+sum+"�Դϴ�");
		
		
		int [] intAry = new int[5];
		System.out.println(intAry[0]); //0�̶�� ������ �ʱ�ȭ�Ǿ����� 
		
		double[] heights = new double[3];
		System.out.println(heights[0]);  // 0.0���� ���� 
		
		String[] names = new String[10]; // ������ ������ִ� ���
		names[0] = "ȫ�浿";  //���� ����ش�
		names[1] = "�ڱ浿";
		names[2] = "��浿";
		names[3] = "���浿";
		names[4] = "�˱浿";
		System.out.println(names[2]);
		System.out.println(names[5]); //���� ���� ������ null �� ����
		
	}//end main

}//end class
