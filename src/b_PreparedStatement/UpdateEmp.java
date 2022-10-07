package b_PreparedStatement;

import java.sql.*;



public class UpdateEmp {

	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 성공");
			
			// 2. 연결 객체 얻어오기 ( 내 IP : 192.168.0.12 )
			String ur1 = "jdbc:oracle:thin:@192.168.0.12:1521:xe";
			String user = "scott";
			String pass= "tiger";
			
			Connection con = DriverManager.getConnection(ur1, user, pass);
			System.out.println("디비 연결 성공2");
		// UPDATE table_name SET column=value WHERE condition;
		//입력값
		int empno = 7698;
		String ename = "아무개";
		int sal = 15000;
		
		String sql = "UPDATE emp SET ename = ?, sal = ?  WHERE empno = ?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, ename);
		stmt.setInt(2, sal);
		stmt.setInt(3, empno);
		
		int result =stmt.executeUpdate();
		System.out.println(result +"행을 실행");
		
		con.close();

		} catch (Exception e) {
			System.out.println("DB 실패 :" + e);
		}	
	
	}

}
