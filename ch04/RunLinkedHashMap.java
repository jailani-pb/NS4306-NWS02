package ch04;

import java.util.LinkedHashMap;

public class RunLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> capitalList = new LinkedHashMap<String, String>();
		//Add elements into LinkedHashMap
		capitalList.put("Brunei", "Bandar Seri Begawan");
		capitalList.put("Malaysia", "Kuala Lumpur");
		capitalList.put("Indonesia", "Jakarta");
		capitalList.put("Thailand", "Bangkok");
		capitalList.put("Phillippines", "Manila");
		System.out.println("(1) " + capitalList);
		//Retrieve element from LinkedHashMap
		System.out.println("Retrieve: " + capitalList.get("Thailand"));
		//Remove element from LinkedHashMap
		capitalList.remove("Malaysia");
		System.out.println("(2) " + capitalList);
		//Get all keys inside LinkedHashMap
		System.out.println(capitalList.keySet());
		//Retrieve all elements from LinkedHashMap
		for(String country : capitalList.keySet()) {
			System.out.println("Retrieve: " + capitalList.get(country));
		}
		//Retrieve all values from LinkedHashMap
		System.out.println(capitalList.values());
		for(String capital : capitalList.values()) {
			System.out.println("Retrieve: " + capital);
		}
	}

}
