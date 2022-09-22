package singleton;

/**** Singleton pattern */

public class DBConnect {

	 private DBConnect() {
		System.out.println("실제 DB 연결");
	}
	 
	 private static DBConnect con = null;
	 
	 public static DBConnect getInstance() {
		if(con == null) {	//초기화 되어 들어온 값은...
		   con = new DBConnect();
	 }
		return con;// 데이터 값은 if 문에서 조건문에 해당되지 않아 처음 초기화 되어 들어가면 값은 더이상 
					//변경되지 않음. 리턴되어 con에 있는 주소값만 반환하게 된다.
	 }
}