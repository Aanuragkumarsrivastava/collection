package pack1;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(2);
		l.add(4);
		l.add(8);
		l.add(10);
		l.add(12);
		System.out.println(l);
		
		
		//linkedlist specific few methods
		
		l.addFirst(5);
		l.addLast(100);
		l.add(5,105);
		
		System.out.println(l);
		
		

	}

}
