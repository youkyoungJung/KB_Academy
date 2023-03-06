package java0307;

public class Emp extends Person{

	private String buseo;
	
	public Emp() {
		super();
	}
	
	public Emp(String name, int age, String buseo) {
		super(name, age);
		this.buseo = buseo;
		// TODO Auto-generated constructor stub
	}
	
	public String getBuseo() {
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" buseo="+buseo;
	}

}
