package poly;

abstract public class Item {

	protected String num;
	protected String ti;
	
	public Item(){
		
	}
	public Item(String num, String ti) {
		this.num = num;
		this.ti = ti;
		
	}
	abstract public void output();
	
	
}
