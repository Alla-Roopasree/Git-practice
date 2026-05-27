package ListPractice;

import java.util.Vector;

public class POJOclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Question16 q16 = new Question16((double)32000,"india");
		q16.setId(101);
		q16.setEmpName("Roopa");
		Question16 q17 = new Question16((double)22000,"india");
		q16.setId(102);
		q16.setEmpName("Abinaya");
		Vector<Question16> v = new Vector<>();
		v.add(q16);
		v.add(q17);
		double sum = 0;
		
		for(Question16 obj:v)
		{
			 sum += obj.salary;
		}
		System.out.println("Salary : "+sum);
	}
	
	

}
