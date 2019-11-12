package pack2;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		for(int i=2;i<=20;i=i+3)
		{
			p.add(i);
		}
		System.out.println(p);
		
	    p.remove(14);
		
		System.out.println(p);
		

	}

}
