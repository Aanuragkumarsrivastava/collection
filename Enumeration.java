package pack1;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationdemo {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		for(int i=10;i<=100;i+=10)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		//creating enumeration object using vector object
		Enumeration e = v.elements();
		
		System.out.println("\n"+e.getClass());//from which class
		
		while(e.hasMoreElements())//Tests if this enumeration contains more elements
		{
			System.out.println(e.nextElement());//Returns the next element of this enumeration if this enumeration object has at least one more element to provide
		}
		
	}

}
