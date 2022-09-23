package poly;

public class Cd extends Item {

	private String singer;

	public Cd() {

	}

	public Cd(String singer) {
		this.singer = singer;
	}

	public void output() {
		System.out.println("가수 : " + singer);
	}
}
