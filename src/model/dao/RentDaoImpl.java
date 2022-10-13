package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.RentDao;

public class RentDaoImpl implements RentDao {
	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@192.168.0.77:1521:xe";
	final static String USER = "scott";
	final static String PASS = "tiger";

	// Connection con;

	public RentDaoImpl() throws Exception {
		// 1. 드라이버로딩
		Class.forName(DRIVER);
		System.out.println("드라이버로딩 성공");
		// // 2. Connection 연결객체 얻어오기
		// Connection con = null;
		// PreparedStatement ps = null;
		// try {
		// con = DriverManager.getConnection(URL, USER, PASS);
		// // 3. sql 문장 만들기
		// String sql = "SELECT * FROM VIDEO WHERE VNO = ?";
		//
		// // 4. sql 전송객체 (PreparedStatement)
		// ps = con.prepareStatement(sql);
		// // ?세팅 -#
		// ps.setString(1, );
		//
		// // 5. sql 전송
		// ps.executeQuery();

		// 6. 닫기
		// } finally {
		// // 6. 닫기
		// ps.close();
		// con.close();
		//
		// }
		//
	}
	@Override
	public void rentVideo(String tel, int vnum) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			String sql = "INSERT INTO RENTAL(RNO,VNO,TEL,BW_DATE,STATUS) VALUES  "
					+ "  (seq_rent_no.nextval, ?,?,SYSDATE,'N')";
			// 4. sql 전송객체 (PreparedStatement)
			ps = con.prepareStatement(sql);
			// ?세팅 -#
			ps.setInt(1, vnum);
			ps.setString(2, tel);
			// 5. sql 전송
			ps.executeUpdate();
			// 6. 닫기
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	}
	public void retrunVideo(int vnum) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			String sql = "UPDATE RENTAL SET STATUS ='Y' WHERE VNO = ? AND STATUS = 'N'";
			// 4. sql 전송객체 (PreparedStatement)
			ps = con.prepareStatement(sql);
			// ?세팅 -#
			ps.setInt(1, vnum);
			// 5. sql 전송
			ps.executeUpdate();
			// 6. 닫기
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	}
	@Override
	public ArrayList selectList() throws Exception {
		ArrayList data = new ArrayList();
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			// 3. sql문장
			String sql = "SELECT V.VNO AS VNO, V.TITLE AS TITLE ,C.NAME AS NAME,C.TEL AS TEL ,R.BW_DATE+3 AS BW_DATE, 'N' AS N   "
					+ "  FROM RENTAL R INNER JOIN CUSTOMER C   " + "                ON R.TEL = C.TEL    "
					+ "                 INNER JOIN VIDEO V   " + "                ON R.VNO = V.VNO    "
					+ "  AND R.STATUS = 'N' ";
			System.out.println(sql);
			// 4 전송객체
			ps = con.prepareStatement(sql);
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("VNO"));
				temp.add(rs.getString("TITLE"));
				temp.add(rs.getString("NAME"));
				temp.add(rs.getString("TEL"));
				temp.add(rs.getString("BW_DATE"));
				temp.add(rs.getString("N"));
				data.add(temp);
			}
			return data;
			// 6. 닫기
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	}
	public String selectName(String tel) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		String name = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			// 3. sql문 불러오기
			String sql = "SELECT name FROM CUSTOMER WHERE TEL = ?";
			// 4. sql 전송객체 (PreparedStatement)
			ps = con.prepareStatement(sql);
			// ?세팅 -#
			ps.setString(1, tel);
			// 5. sql 전송
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				name = rs.getString("name");
			}
			// 6. 닫기
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
		return name;
	}
	@Override
	public void returnVideo(int vnum) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}