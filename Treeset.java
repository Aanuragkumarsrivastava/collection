package pack2;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts=new TreeSet<Integer>();
		//insertion order won't preserve
		//sorted by default
		ts.add(8);
		ts.add(9);
		ts.add(2);
		ts.add(1);
		System.out.println(ts);
	}

}
