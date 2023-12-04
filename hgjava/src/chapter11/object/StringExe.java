package chapter11.object;

public class StringExe {
	public static void main(String[] args) {
		String []fileNames = {"c:/images/prod/sample.jpg",    //1) 파일명 가져오기 
							"d:/test/sample/americano.png", 
							"d:/goods/test/2023/mocha.jpg"};
		for(String file: fileNames) {                           //1)파일명 가져오기
			System.out.println(findFileName2(file));
		}

		String[] numbers = { "980304-1234567", "980304-2234567", "010201-3456789", "020104-4456789", "0301053545678" };  //2)성별 구별하기 
		for (String no : numbers) {
			System.out.println(findGender2(no));
		}

		byte[] b1 = "Hello".getBytes(); // 각 문자열의 값을 byte로 출력
		for (byte b : b1) {
			System.out.println(b);
		}
		String name = new String(new byte[] { 65, 66, 67, 68, 69 }); // 각 문자의 char값을 입력해준다.
		name = new String(b1);
		System.out.println(name);

		char c1 = name.charAt(0); // index 맨 앞에 있는 값을 char타입으로 가져온다
		System.out.println(c1);
	}

	// 성별을 반환
	static String findGender(String ssn) {  //2)성별 구별하기 
		char gender = ssn.charAt(7);
		char gender2 = ssn.charAt(6);
		if(ssn.length() == 14) {
			if (gender == '1' || gender == '3') {
				return "남"; // 남 or 여 구분
			} else if(gender == '2' || gender == '4') {
				return "여";
			}else {
				return "값이 유효하지 않습니다";}
		}else if(ssn.length() == 13){
			if (gender == '1' || gender == '3') {
				return "남"; // 남 or 여 구분
			} else if(gender == '2' || gender == '4') {
				return "여";
			}else {
				return "값이 유효하지 않습니다";}
		}else {
			return "값이 유효하지 않습니다";
			
		}
	}//end of findGengder
		//2) 성별 구별하기 
		static String findGender2(String ssn) { //다른 방식으로 계산
			int pos = ssn.length() -7;
			switch(ssn.charAt(pos)) {
			case '1':
			case '3':
				return "남";
			case '2':
			case '4':
				return "여";
			}
			return "오류";
		}//end of findGender2
		
		//1)파일명을 가져오기
	static String findFileName(String file) {  
		int findsl = file.lastIndexOf("/");
		int finddot = file.indexOf("."); 
		for(int i = 0; i < file.length();i++){
		}
		return file.substring(findsl+1,finddot);
	}//end of findFileName
	
	static String findFileName2(String file) {
		int pos = 0 ;
		while(true) {
			int pos2 = file.indexOf("/",pos);
			if(pos2 == -1) {
				break;
			}pos2++;
			pos = pos2;
		}
		return file.substring(pos);
	}//end of findFileName2
		
		// 생년월일 = 1,2,3,4
	}
