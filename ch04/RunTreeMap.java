package ch04;

import java.util.TreeMap;

public class RunTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> capitalList = new TreeMap<String, String>();
		//Add elements into TreeMap
		capitalList.put("Brunei", "Bandar Seri Begawan");
		capitalList.put("Malaysia", "Kuala Lumpur");
		capitalList.put("Indonesia", "Jakarta");
		capitalList.put("Thailand", "Bangkok");
		capitalList.put("Phillippines", "Manila");
		System.out.println("(1) " + capitalList);
		//Retrieve element from TreeMap
		System.out.println("Retrieve: " + capitalList.get("Thailand"));
		//Remove element from TreeMap
		capitalList.remove("Malaysia");
		System.out.println("(2) " + capitalList);
		//Get all keys inside TreeMap
		System.out.println(capitalList.keySet());
		//Retrieve all elements from TreeMap
		for(String country : capitalList.keySet()) {
			System.out.println("Retrieve: " + capitalList.get(country));
		}
		//Retrieve all values from TreeMap
		System.out.println(capitalList.values());
		for(String capital : capitalList.values()) {
			System.out.println("Retrieve: " + capital);
		}
	}

}
