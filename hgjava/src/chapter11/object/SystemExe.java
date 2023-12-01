package chapter11.object;

public class SystemExe {
	public static void main(String[] args) {
		//System : 1970년 1월 1일 0시 
		//1000 초*60 분* 60 시* 24 일 
		long dayCnt = 1000 * 60 * 60 * 24* 365;
		long cur = System.currentTimeMillis(); //현재 시점의 Date 를 밀리세컨즈 단위로
		System.out.println(cur/dayCnt);  //
		
		long start = System.currentTimeMillis();
		long sum = 0;
		for(int i = 1; i <= 100000000 ; i++) {
			sum += i; 
		}
		System.out.println("누적합: "+sum);
		long end = System.currentTimeMillis();
		System.out.println("걸린시간: "+ (end - start));
	}
}
