package pack2;

import java.util.*;

public class Treesetusingcompartaor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here it will sort in descending order
        TreeSet<String> t = new TreeSet<String>(new Comparator<String>() {

			
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		t.add("ram");
		t.add("mohan");
		t.add("shyam");
		t.add("harry");
		
		System.out.println(t);
		

	}

}
