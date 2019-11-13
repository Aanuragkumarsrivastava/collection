package pack2;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();

		// duplicate keys not allowed
		// if you put duplicate key the it will replace previous key and value

		m.put(1, "ram");
		m.put(3, "shayam");
		m.put(2, "lorry");
		m.put(1, "mohan");

		System.out.println(m);

		System.out.println(m.get(3));// this will display value of desired key

		m.remove(2);

		System.out.println("after removing key value=2\n" + m);

		// adding two maps map2(m2) elements in map(m)

		Map<Integer, String> m2 = new HashMap<Integer, String>();

		m2.put(5, "tomas");
		m2.put(6, "jerry");
		m.putAll(m2);

		System.out.println("after putting all elements of maps\n" + m);

		// Returns true if this map maps one or more keys to the specified value
		System.out.println("check tomas is there or not?\n " + m.containsValue("tomas"));

		System.out.println("check weather key 78 present or not?\n" + m.containsKey(78));

		String gettingvalue = m.get(6);
		System.out.println("value for key 6 is " + gettingvalue);
	}

}
