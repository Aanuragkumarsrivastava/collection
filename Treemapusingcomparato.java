package pack2;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemapusingcomparato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> m = new TreeMap<String, String>(new Comparator<String>() {
			public int compare(String o1,String o2)
			{return -o1.compareTo(o2);}
		});

		m.put("ram", "bangalore");
		m.put("mike", "london");
		m.put("mahesh", "bangladesh");
		m.put("suresh", "bhopal");
		m.put("ramesh", "newyork");

		System.out.println(m);// by default ascending order
	}

}
