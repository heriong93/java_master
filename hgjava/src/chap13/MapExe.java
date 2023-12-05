package chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExe {
public static void main(String[]args) {
	//키: 값 쌍으로 구성 
	Map <String, String> map = new HashMap <String, String>();
	
	//추가
	map.put("홍길동", "80");
	map.put("김길동", "85");
	map.put("박혜령", "90");
	map.put("홍길동", "90");  //키 값이 같아지면 대체됨 
	
	//
	String result = map.get("홍길동");
	
	//전체 목록
	Set<String> set = map.keySet(); //key값만 빼와서 
	for(String key : set) {
		System.out.println("key:"+ key+"value:" +map.get(key) );
	}
}//end main
}//end class
