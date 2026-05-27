package ListPractice;

import java.util.LinkedList;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		list.add(4);
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(8);
		list.add(0);
		list.add(5);
		list.add(8);
//		list.add(1);
		list.add(1);
		list.add(8);
		list.add(6);
		int temp;
		for(int i=1;i<list.size()-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(list.get(j) > list.get(j+1))
				{
					temp=list.get(j);
					list.set(i,list.get(j+1));
					list.set(j+1,temp);
				}
			}	
		}
		System.out.println(list);
		
		
		
	}

}
