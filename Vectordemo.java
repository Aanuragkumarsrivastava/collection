package pack1;

import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args)
	{
		Vector v = new Vector();
		for(int i=0;i<=180;i=i+20)
		{
			v.addElement(i);
		}
		System.out.println(v);

		System.out.println(v.size()+"   "+v.capacity());
		
		//after adding 1 more element at 11th position let's see the capacity it will be doubled means 2*10=20 
		//this is one of the property of vector it size gets doubled after adding some addition elements
		v.add(200);
		
		System.out.println("after adding one more element\n");
		
		System.out.println(v);
		
		System.out.println(v.size()+"     "+v.capacity());
	}

}
