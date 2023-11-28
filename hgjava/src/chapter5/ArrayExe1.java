package chapter5;



	public class ArrayExe1 {

		public static void main(String[] args) {
			int a = 10;
			int[] ary = {10,20,33}; //선언하면서 초기 값 정하는 방법
			//int sum = ary[0] + ary[1]+ary[2]; //인덱스 값으로 불러오기 
			int sum = 0;
			for(int i = 0; i< ary.length; i++) {    //값이 여려개면 for문으로 반복시켜 돌리는게 편함 ary.length 만큼 돌려라
				sum = sum + ary[i];
			}
			System.out.println("합계는"+sum+"입니다");
			
			
			int [] intAry = new int[5];
			System.out.println(intAry[0]); //0이라는 값으로 초기화되어있음 
			
			double[] heights = new double[3];
			System.out.println(heights[0]);  // 0.0으로 나옴 
			
			String[] names = new String[10]; // 공간만 만들어주는 방법
			names[0] = "홍길동";  //값을 담아준다
			names[1] = "박길동";
			names[2] = "김길동";
			names[3] = "서길동";
			names[4] = "옹길동";
			System.out.println(names[2]);
			System.out.println(names[5]); //값이 없기 때문에 null 로 나옴
			
		}//end main

	}//end class