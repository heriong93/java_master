package chapter11.object;

import java.util.HashSet;

public class HashSetExe {
	public static void main(String[] args) {
		
		//배열 -> 컬렉션 (List, Set, Map)
		
		HashSet <String> set = new HashSet<String>(); //Object는 상위존재라 모든 타입 다 담을 수 있음. 그렇기 때문에 <type>을 미리 지정해주는 것이 좋다 
		set.add("Hong");
		set.add("Hwang");
		set.add("Park");
		set.add("Hong"); //중복된 값은 허용하지 않는 컬렉션 
		
		for(Object name : set) {
			System.out.println(name); //set : 출력시 중복된 hong은 출력되지 않고 제거됨 
		}
		HashSet <Member> members = new HashSet<Member>(); //이제 Member ->members 의 인스턴스만 담을 수 있음
		members.add(new Member("홍길동",20));
		members.add(new Member("김길동",21));
		members.add(new Member("박길동",22));
		members.add(new Member("홍길동",20));
		for(Member mem : members) {
			System.out.println(mem.toString());
		}
		
	}
}
