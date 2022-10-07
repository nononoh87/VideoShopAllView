package a_statement;

import java.sql.*;

public class SelectEmpDept {

	public static void main(String[] args) {
		
	try {
		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버로딩 성공2");
		
		// 2. 연결 객체 얻어오기 ( 내 IP : 192.168.0.12 )
					String ur1 = "jdbc:oracle:thin:@192.168.0.12:1521:xe";
					String user = "scott";
					String pass= "tiger";
		Connection con = DriverManager.getConnection(ur1, user, pass);
		System.out.println("디비 연결 성공2");
		
		// 3. SQL 문장 만들기 (*****)
		//		-> 20번 부서의 사원들의 정보 - 사번, 사원명, 월급, 부서명, 근무지
		String sql = "SELECT e.empno, e.ename, e.sal, d.dname, d.loc FROM emp e left outer join dept d on e.deptno = d.deptno where  d.deptno = 20";
		//String sql = "SELECT e.empno, e.ename, e.sal, d.dname, d.loc FROM emp e, dept d WHERE e.deptno = d.deptno and  d.deptno = 20";
		// 4. 전송객체 얻어오기
		Statement stmt = con.createStatement();
		
		// 5. SQL 전송
		/*		- ResultSet executeQuery() : SELECT
		/*		- int executeUpdate() : INSERT / DELETE / UPDATE
		 */ 
		ResultSet a = stmt.executeQuery(sql);
		while(a.next()) {
			int empno = a.getInt("EMPNO");
			String ename =a.getString("ENAME");
			int sal = a.getInt("SAL");
			String dname =a.getString("DNAME");
			String loc =a.getString("LOC");
			
			System.out.println(empno +"/"+ ename +"/"+ sal +"/"+ dname +"/"+ loc );
		}
		
		// 6. 닫기
		a.close();
		stmt.close();
		con.close();
		
	} catch (Exception e) {
		System.out.println("DB 실패 :" + e);
	}
	
	}

}
