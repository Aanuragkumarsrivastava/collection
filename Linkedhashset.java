package pack2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args)
	{
		//insertion order is preserved
		Set<Integer> obj=new LinkedHashSet<Integer>();
		obj.add(2);
		obj.add(7);
		obj.add(1);
		obj.add(null);
		
		System.out.println(obj);
		
		//removing any element using iterator
		
		Iterator<Integer> iterator=obj.iterator();
		while(iterator.hasNext())
		{
			if(iterator.next()==null)
				iterator.remove();
		}
		System.out.println("after removing \n"+obj);

	}

}
