package chapter11.object;

public class MathExe {
	public static void main(String[] args) {
		long result = (long) Math.round(-1.7);
		System.out.println("round:" + result);
		//61~100
		for (int i = 1; i <= 10; i++) {
			int r = 61+ (int) (Math.random() * 40); // 0 <= x < 40
			System.out.println(r);
		}
		//1~ 6까지의 수. 
		int[] numbers = new int [5];
		//중복되지 않는 값을 배열에 저장
		//1.1~6 숫자 생성
		for(int i = 0; i < numbers.length;i++) {
			boolean exist = false; 
			
			int random = 1 +(int)(Math.random()*6);
			for(int j = 0 ; j < i ;j++) {
				if(numbers[j] == random)
					exist = true;
			}
			if(exist) {
				i--;
				continue;
			}
			numbers[i] = random;
			System.out.println(random);
		
			
//			System.out.println(random);
//			int nrep = random;
//			if(nrep != random ) {
//				numbers[i] += nrep;
//				
//			}System.out.println(nrep);
//			
//				
			}
			
		//2.생성된 값이 배열에 있는지 체크 
		//3.없으면 추가 
			
		//4.배열에 값이 다 저장되면 종료 
			
		}
		
	}

