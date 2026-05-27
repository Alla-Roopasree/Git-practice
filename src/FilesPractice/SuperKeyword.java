package FilesPractice;

public class SuperKeyword extends Question4{
	int n=10;
	int p;
	
	
	SuperKeyword(int num)
	{
		super(num);
		super.method1();
		p = super.n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SuperKeyword tc = new SuperKeyword(7);
		
	}
	
	
	

}
