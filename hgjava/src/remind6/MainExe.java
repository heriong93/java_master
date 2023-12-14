package remind6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib 
// ojdbc6_g > java 폴더에 옮기고 > classpath 설정하기 
// add > apply > package explorer 에서 확인 

public class MainExe {
		static Connection conn;
	public static void main(String[] args) {
			//jdbc lib
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			//순서1
			Class.forName("oracle.jdbc.OracleDriver");
			//순서2
			conn = DriverManager.getConnection(url,"dev","dev");
			System.out.println("연결성공!");
			//select();
			String sql = "INSERT INTO student (stu_num, stu_name, eng_score, math_score)\r\n"
					+ "VALUES (?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "23-003");
			psmt.setString(2, "박씨");
			psmt.setInt(3, 80);
			psmt.setInt(4, 85);
			
			//입력, 수정,삭제일 경우 = executeUpdate();
			
			int r = psmt.executeUpdate();
			if(r==1) {
				System.out.println("입력성공");
			}
		}catch(Exception e){
				e.printStackTrace();
			System.out.println("Driver 없음");
	}
		

}//end main 
	public static void select() throws Exception {
		
		String sql ="select * from student";
		PreparedStatement psmt =conn.prepareStatement(sql);
		
		//조회 =executeQuery();
		//입력성공 시 sql 에서 조회해보면 업데이트 확인 가능함
		ResultSet rs = psmt.executeQuery();
		//while 사용 시 값이 있는 동안 계속 루핑 돌면서 실행될것임 
		while(rs.next()) {
			System.out.println("번호:"+rs.getString("stu_num")+"이름:"+rs.getString("stu_name")+"영어:"+rs.getInt("eng_score")+"수학:"+rs.getInt("math_score"));
			
		}
	}
}//end class