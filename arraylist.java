package pack1;

import java.util.*;

public class arraylist
{

	public static void main(String... args) 
  
	{

		ArrayList a = new ArrayList();

		for(int i=10;i<=100;i=i+10)
		{
			  a.add(i);
		}
		  System.out.println(a);
      
		  a.remove(7);        //removing opertaion in array list with providing the index
		  System.out.println(a);
      
	  	a.add("hi");        //adding differnt data type
		  System.out.println(a);
      
		  a.add(10.5);        //adding float value in array list
		  System.out.println(a);
		
	}	
 }
