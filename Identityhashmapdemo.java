package pack2;

import java.util.IdentityHashMap;

public class Identityhashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdentityHashMap<Integer,String> m=new IdentityHashMap<Integer,String>();
		
		//here it will allow two identical keys having two different values
		
		m.put(new Integer(11),"manohar");
		m.put(new Integer(11),"manoj");
		
		System.out.println(m);
		
		

	}

}
