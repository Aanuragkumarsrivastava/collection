package pack1;

import java.util.*;

public class Arraylist1
{

	public static void main(String[] args)
	{
  
		ArrayList<Integer> a1= new ArrayList<Integer>();
    
		for(int i=20;i<=200;i=i+10)
		{
    
			a1.add(i);
      
		}
    
		System.out.println(a1);
    
		System.out.println(a1.size());	//this will display the size of arraylist
    
		a1.add(19,201);//here we have provided the index value and value to add
    
		a1.add(18,202);//here it will sit at 18th place and next elements will be shifted 1place apart
    
		System.out.println(a1);
	}

}
