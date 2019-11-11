package pack1;

import java.util.*;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args)
	{
	    List<Integer> a=new ArrayList<Integer>();
	    
	    for(int i=10;i<=100;i+=10)
	    {
	    	a.add(i);
	    }
	    System.out.println(a);
	    System.out.println(a.getClass());
	    
	    Iterator<Integer> n=a.iterator();
	    
	    while(n.hasNext())
	    {
	    	if(n.next()==20)
	    		n.remove();
	    }
	    System.out.println("after removing 20\n"+a);
	    

	}

}
