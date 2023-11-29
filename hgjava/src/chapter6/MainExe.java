package chapter6;

public class MainExe {
	public static void main(String[] args) {

		String[] strs = { "1.asd", "2.adad", "3.asdq", "4.qwrqr", "5.qrewte", "6.qrwqwrwr", "7.qweadz", "8.asdadasd" };
		int page = 1;
		int start = (page - 1) * 5; // start가 0이기 때문에 -1 로 시작
		int end = page * 5;

		for (int i = 0; i < strs.length; i++) {
			if (i >= start && i < end) {
				System.out.println(strs[i]);
			}
		}

		int cnt = 36;

		int totalPage = (int) Math.ceil(cnt / 5.0); // 게시물을 페이지 수로 나누기 위해 계산
		System.out.println(totalPage);

		for (int i = 0; i < totalPage; i++) {
			System.out.println(i + " ");
		}

	}
}
