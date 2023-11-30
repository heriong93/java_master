package chapter7;

public class FriendExe {
	Friend[] storage = new Friend[10];
	//1:등록 2:목록 3:조회
	
	public boolean addFriend(Friend friend) { //1.등록
		for(int i = 0; i < storage.length; i++) {
			if(storage[i] == null) {
				storage[i] = friend;
				return true;
			}
		}
		return false;
	}
	
	public Friend[] friendList() {   //2.목록
		for (int i = 0; i < storage.length; i++) {
			if(storage[i] != null) { 
				return storage;
			}
		}
		return null;
	}
	//결과값이 null여부로 체크 x 
	public Friend[] searchFriend(String name) { //3.조회(이름으로)
		Friend[] result = new Friend[10];
		for(int i = 0 ; i < storage.length; i++) {
			if(storage[i].getName().equals(name)) {
				result[i] = storage[i];
			}
		}
		return null;
	}
		//반환 유형이 정해져있음. 
		Friend[] result = new Friend[10]; //여기에 값을 담아 반환해줘야함
		return result;
	/결과 값이 null여부로 체크
	public Friend searchPhone(String phone) { //3.조회(번호로)
		return null;
	}
	
}
