package selen;

public class Stringreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Today is Tuesday";
		int j = 0;
		for(int i=0; i<=str.length();i++)
		{
		if(str.charAt(i)==' ')
		{
		j=i;
		}
		for(int k=j-1;str.charAt(k)!=' '||k>0;k--)
		{
		System.out.print(str.charAt(k));
		}
		System.out.print(" ");
		}
		str.trim();
	}

}
