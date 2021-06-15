package OOPConcepts;

public class Person1 {
	
	static int count=0;
	private String pname;
	int page;
	char pgender;
	
	public Person1() {
		count++;
	}
	
	public String getPname() {
		return pname;
	}
			

	public void setPname(String pname) {
		this.pname=pname;
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page=page;
	}
	
	public char getPgender() {
		return pgender;
	}
	
	public void setPgender(char pgender) {
		this.pgender=pgender;
	}
}

