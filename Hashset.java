package pack2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset 
{

	public static void main(String[] args)
	{
		//insertion order won't preserve here
		Set<Integer> obj = new HashSet<Integer>();
		for (int i = 2; i <= 20; i = i + 2) {
			obj.add(i);
		}
		obj.add(10);//it won't add 10 as it is duplicate so it will replace that value setb won't allow duplicates
		System.out.println(obj);
		
		//we will remove 4 using the iterator
		
		Iterator<Integer> iterator=obj.iterator();
		while(iterator.hasNext())
		{
			if(iterator.next()==4)
			iterator.remove();
		}
		obj.add(null);//null is allowed in hashset
		System.out.println("after removing\n"+obj);
	}

}
