package chap13;

import java.util.List;
import java.util.ArrayList;

public class ListExe {
	public static void main(String[] args) {
		String[] strs = { "Mon", "Tue", "10" };
		strs[0] = "Wed"; // 기존 배열식
		strs[0] = null; // 기존 배열식 삭제
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		List<String> list = new ArrayList<String>(); // 컬렉션
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		list.remove(0); // 삭제 - 첫번째 위치의 값을 삭제하겠다 ->or-> list.remove("Apple") -> 이렇게 써도됨.출력시 Apple 출력안됨
		list.set(0, "바나나"); // Apple 삭제되면 Banana가 값이 0이 됨. 값을 변경할 수도 있음
		list.clear(); // 전체 요소 삭제
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 컬렉션의 크기 변경
		for (int i = 0; i < 100; i++) {
			list.add("" + i);
			System.out.println(list.get(i));
		}
		// 이름저장
		List<String> names = new ArrayList<String>();
		names.add("홍길동"); // index값이 0: 첫번째
		names.add("김길동"); // index 1
		names.add("박철수"); // index2
		String search = "길동";
		int cnt = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).indexOf(search) != -1) {
				cnt++;
			}
		}
		System.out.println(search+"은"+cnt+"명입니다");
	}
}
