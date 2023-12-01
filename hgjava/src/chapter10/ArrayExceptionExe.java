package chapter10;

public class ArrayExceptionExe {
	public static void main(String[] args) {
		
		//배열의 범위를 벗어난 위치에 값 참조 
		int[] numAry = { 2,5,7};
		try {
			for(int i = 0; i <= 3; i++) {
				System.out.println(numAry[i]); //4번째 값이 없을때 출력하라고 하니 에러가 뜸. error:ArrayIndexOutOfBoundsException// Index 3 out of bounds for length 3
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("end of program");
		}
		
	}
}
