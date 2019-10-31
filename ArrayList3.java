package pack1;

import java.util.ArrayList;
import java.util.HashSet;

public class Ararylist2 {

	public static void main(String[] args) 
	{
		ArrayList a =new ArrayList();
		
		HashSet hs =new HashSet();
		
		//hashset will arrage in order 
		
		hs.add(1);
		hs.add(2);
		hs.add(7);
		hs.add(5);
		System.out.println(hs);
		
		
		//this is now converted into arraylist 
		ArrayList<Integer> a2=new ArrayList<Integer>(hs);
		
		System.out.println(a2);
		
		

	}

}
