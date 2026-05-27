package POJOandJavaBean;

import java.io.Serializable;

public class JavaBeanClass implements Serializable{

	private int id;
	private String name;
	private String Gender; 
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
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	JavaBeanClass()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
