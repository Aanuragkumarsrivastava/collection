package pack2;

import java.util.TreeMap;

public class TreeMapdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<String,String> m=new TreeMap<String,String>();
		
		m.put("ram","bangalore");
		m.put("mike","london");
		m.put("mahesh","bangladesh");
		m.put("suresh","bhopal");
		m.put("ramesh","newyork");
		
		System.out.println(m);//by default ascending order
		
	    System.out.println(m.descendingMap());	//navigable can be arranged
	}

}
