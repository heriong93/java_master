package chap13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class TypingSpeedGame {
	public static void main(String[] args) {
		String word = "Check CDK v2 applications for best practices using a combination on available rule packs.";
		String[] words = word.split(" ");
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		for (String str : words) {
			list.add(str);
		}
		boolean run = true;
		while (run) {
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			// 사용자 입력값과 컬렉션 값과 비료해서 같은 단어 있으면 하나씩 삭제
			String inputWord = sc.nextLine();
			System.out.println("삭제할 단어");
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(inputWord)) {
					list.remove(inputWord);
				}
			}
			System.out.println("삭제완료. 남은 글 수:" + list.size());
			if (list.size() == 0) {
				System.out.println("성공! 소요된 시간:");
				run = false;
			}
		} // end of while
	}

}
