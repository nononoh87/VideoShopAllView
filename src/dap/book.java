package dap;

public class book {
	
	private String name;
	private String aut;
	private String ph;
	
	book(){
		
	}
	book(String name, String aut, String ph){
		this.name = name;
		this.aut = aut;
		this.ph = ph;
	}
	
	String getName() {
		return name;
	}
	String getAut() {
		return aut;
	}
	String getPh() {
		return ph;
		
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAut(String aut) {
		this.aut = aut;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
}
