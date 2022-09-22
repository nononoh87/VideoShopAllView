package singleton;

public class WorkC {

	DBConnect con;

	public WorkC() {
		con = DBConnect.getInstance();
	}

	public void use() {
		System.out.println("C 작업");

	}

}
