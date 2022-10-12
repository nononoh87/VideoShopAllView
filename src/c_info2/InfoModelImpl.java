package c_info2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl implements InfoModel { // implements : 부모의 메소드를 반드시 오버라이딩(재정의)해야 한다.

	// final로 선언한 경우 변수 부분 대문자로 표기
	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // 127.0.0.1 : 본인 컴퓨터
	final static String USER = "scott";
	final static String PASS = "tiger";

	public InfoModelImpl() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(DRIVER); // Class.forName() 을 이용해서 드라이버 로드
		System.out.println("드라이버로딩 성공");
	}

	/*
	 * 사용자 입력값을 받아서 DB에 저장하는 역할
	 */
	@Override
	public void insertInfo(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null; // Connection 데이터베이스와 연결하는 객체.
		PreparedStatement ps = null; // PreparedStatement
		try {
			con = DriverManager.getConnection(URL, USER, PASS); // (연결문자열, USER, PASS) 으로 Connection 객체를 생성합니다.

			// 3. sql 문장 (#)
			String sql = " INSERT INTO info_tab (name, jumin, tel, gender, age, home)      " + " VALUES(?,?,?,?,?,?)";

			// 4. 전송객체
			ps = con.prepareStatement(sql);

			// 세팅 - #
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getGender());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getHome());

			// 5. 전송
			ps.executeUpdate();	// INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다.

		} finally {
			// 6. 닫기 (필수) : Connection 의 갯수는 사용하는 사용자의 수보다
			ps.close();
			con.close();
		}
	} // end of insertInfo()
	/*
	 * 전체 info_tab의 레코드 검색
	 */

	@Override
	public ArrayList<InfoVO> selectAll() throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // ResultSet 객체를 반환한다.
		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. SQL 문장
			String sql = "SELECT* FROM info_tab";

			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);

			// 5. 전송
			rs = ps.executeQuery(); // ResultSet 객체의 값을 반환한다, 객체에 결과값을 담을 수 있다.

			ArrayList<InfoVO> list = new ArrayList<InfoVO>();
			while (rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));

				list.add(vo);
			}
			return list;

		} finally {
			// 6. 닫기 (필수) : Connection 의 갯수는 사용하는 사용자의 수보다
			rs.close();
			ps.close();
			con.close();
		}
	} // end of selectInfo()

	public InfoVO selectByTel(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		InfoVO vo = new InfoVO();
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			// 3.sql 문장
			String sql = "SELECT * FROM info_tab WHERE tel=?";
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			// 5. 전송
			rs = ps.executeQuery();
			if (rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setId(rs.getString("jumin"));
				vo.setTel(rs.getString("tel"));
				vo.setGender(rs.getString("gender"));
				vo.setAge(rs.getInt("age"));
				vo.setHome(rs.getString("home"));
			}

		} finally {
			// 6. 닫기 (필수) : Connection 의 갯수는 사용하는 사용자의 수보다

			ps.close();
			con.close();
		}
		return vo;
	} // end of selectByTel

	/*
	 * 메소드명 : delete 인자 : 전화번호 리턴값 : 삭제한 행 수 역할 : 전화번호를 넘겨받아 해당 전화번호의 레코드 삭제
	 */

	@Override
	public int delete(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			// 3.sql 문장
			String sql = "DELETE FROM info_tab WHERE tel=?";
			// 4. 정송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			// 5. 전송
			int a = ps.executeUpdate(); // INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다.
			return a;

		} finally {
			// 6. 닫기 (필수) : Connection 의 갯수는 사용하는 사용자의 수보다
			ps.close();
			con.close();
		}

	}

	@Override
	public void modify(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			// 3. sql 문장
			String sql = "UPDATE info_tab SET name = ?, jumin = ?, gender = ?, age = ?, home = ? WHERE tel=?";
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getGender());
			ps.setString(4, Integer.toString(vo.getAge()));
			ps.setString(5, vo.getHome());
			ps.setString(6, vo.getTel());

			// 5. 전송
			ps.executeUpdate(); // INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다.

		} finally {
			// 6. 닫기 (필수) : Connection 의 갯수는 사용하는 사용자의 수보다
			ps.close();
			con.close();
		}
	}// end of modify()

}// infoModelImpl
