package chapter5;

public class ArrayExe3 {
	public static void main(String[] args) {
		String[] nameAry = {"ȫ�浿", "��浿","�ڱ浿","ȫ�浿","�˱浿"};
		
		String search = "ȫ�浿";
		int count = 0;
		
		for(String names : nameAry) {
			if(names.equals(search)) {
				count ++;
			}
		}
		System.out.println(search+"�� ��"+count + "���Դϴ�");
		
		int[] scores = {88,68,72,89,92,70};
		int maxScore = 0; 
		
		for(int eachScore : scores) {
			if(eachScore > maxScore) {
				maxScore = eachScore;
			}
		}System.out.println("�ְ� ������"+maxScore+"�Դϴ�");
		
		
	}//end main

}//end class
