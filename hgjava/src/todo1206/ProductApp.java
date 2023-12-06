package todo1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap13.Member;
import todo1205.Emp;

public class ProductApp {
	public static void main(String[] args) {
		List<InOut> inout = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		ProductExe exe = new ProductExe();
		InOutExe iexe = new InOutExe();
		String num = null;
		String name = null;

		while (run) {
			System.out.println("1.상품관리 2.입출고 관리 3.종료");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				System.out.println("1) 등록 2) 수정 3) 목록");
				int one = Integer.parseInt(sc.nextLine());
				switch (one) {
				case 1:
					System.out.println("상품코드 입력>>");
					num = sc.nextLine();
					System.out.println("상품명 입력>>");
					name = sc.nextLine();
					System.out.println("상품 가격 입력>>");
					int price = Integer.parseInt(sc.nextLine());
					System.out.println("수량 입력>>");
					int amount = Integer.parseInt(sc.nextLine());
					exe.addList(new Product(num, name, price, amount));
					break;
				case 2:
					System.out.println("수정할 상품코드 입력>>");
					num = sc.nextLine();
					System.out.println("수정할 가격>>");
					price = Integer.parseInt(sc.nextLine());
					if (exe.modifyPrice(num, price)) {
						System.out.println("수정 완료");
					} else {
						System.out.println("수정에 실패하였습니다");
					}
					break;
				case 3:
					System.out.println("상품코드/" + "\t상품명/" + "\t가격");
					System.out.println("============================");
					exe.showList();

					break;
				}// end of innerswitch
				continue;
			case 2:
				System.out.println("1) 판매 2) 구매 3) 재고");
				int two = Integer.parseInt(sc.nextLine());
				switch (two) {
				case 1:
					System.out.println("판매 상품코드 입력>>");
					num = sc.nextLine();
					System.out.println("판매 날짜 입력>>");
					String date = sc.nextLine();
					System.out.println("판매 수량 입력>>");
					int amount = Integer.parseInt(sc.nextLine());
					String sale = "판매";
					exe.addList(new InOut(num, date, amount, sale));
					if (iexe.sellItem(num, date, amount, sale)) {
						System.out.println("판매 등록 완료");
					} else {
						System.out.println("판매 등록에 실패하였습니다");
					}
					break;
				case 2:
					System.out.println("구매 상품코드 입력>>");
					num = sc.nextLine();
					System.out.println("구매 날짜 입력>>");
					String datep = sc.nextLine();
					System.out.println("구매 수량 입력>>");
					int amountp = Integer.parseInt(sc.nextLine());
					String salep = "구매";
					iexe.addList(new InOut(num, datep, amountp, salep));
					if (iexe.addItems(num, datep, amountp, salep)) {
						System.out.println("구매 등록 완료");
					} else {
						System.out.println("구매 등록에 실패하였습니다");
					}
					break;
				case 3:
					System.out.println("상품코드/" + "\t재고수량");
					iexe.showList();
					break;
				}// end of innerswitch2
				break;
			case 4: 
				run = false;
			}// end of switch
		} // end of while
		System.out.println("end of prog");

	}// end of main
}// end of class
