package POJOandJavaBean;

public class Employee {

	private int id;
	private int Salary=10;
	String name;
	Employee(String name)
	{
		this.name=name;
	}
	Employee()
	{
//		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
//	public void setSalary(int salary) {
//		Salary = salary;
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
