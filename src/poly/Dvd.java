package poly;

public class Dvd extends Item {

	private String act;
	private String dir;

	public Dvd() {

	}

	public Dvd(String act, String dir) {
		this.act = act;
		this.dir = dir;
	}

	public void output() {
		System.out.println("배우 : " + act);
		System.out.println("감독 : " + dir);
	}
}
