package chapter5;

public class ArrayExe3 {
	public static void main(String[] args) {
		String[] nameAry = {"홍길동", "김길동","박길동","홍길동","옹길동"};
		
		String search = "홍길동";
		int count = 0;
		
		for(String names : nameAry) {
			if(names.equals(search)) {
				count ++;
			}
		}
		System.out.println(search+"은 총"+count + "명입니다");
		
		int[] scores = {88,68,72,89,92,70};
		int maxScore = 0; 
		
		for(int eachScore : scores) {
			if(eachScore > maxScore) {
				maxScore = eachScore;
			}
		}System.out.println("최고 점수는"+maxScore+"입니다");
		
		
	}//end main

}//end class