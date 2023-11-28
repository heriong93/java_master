package chapter6;

public class MeberApp {

	public static void main(String[] args) {
		
	
		Member[] members = new Member[10];
		
		members[0] = new Member(1,"hong","010-1231-3423","male");
		members[1] = new Member(2,"park","010-5656-3434", "female");
		members[2] = new Member(3,"choi","010-7878-4344","female");
		
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null && members[i].getGender().equals("female"))
				members[i].showInfo();
		}
		}//end of main

	static void test1(){
		Member mem1 = new Member(); //인스턴스 생성 ()실행 호출 
		System.out.println(mem1);
//		mem1.membNum = 10;  //private 로 설정하면 이건 사용할 수 없음
		mem1.setMembNum(10);  // 이렇게 메소드를 통해서 설정해줘야함 
//		mem1.memName = "hong";
		mem1.setMemName("hong");
//		mem1.phone = "010-1234-5677";
		mem1.setPhone("010-2323-4545");
//		mem1.gender = "male";
		mem1.setGender("male");
				
		
		mem1.showInfo();
		
		Member mem2 = new Member(11,"Hwang");
		mem2.phone = "010-3434-4545";
		
		mem2.showInfo();
		
		Member mem3 = new Member(12,"park", "010-2323-3434","female");
		mem3.showInfo(); //반환유형:void 
		String msg = mem3.showAllInfo();  //반환유형:String 
		System.out.println(msg);
}//end of test1
}//end of main
