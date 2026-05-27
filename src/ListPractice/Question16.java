package ListPractice;

public class Question16 {
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String EmpName;
	private int id;

	double salary;
	String country;
	
	public Question16(double salary,String country)
	{
		this.salary =salary;
		this.country=country;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	

}
