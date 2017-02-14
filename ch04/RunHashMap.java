package ch04;

import java.util.HashMap;

public class RunHashMap {
	
	public static void main(String[] args) {
		HashMap<String, String> capitalList = new HashMap<String, String>();
		//Add elements into HashMap
		capitalList.put("Brunei", "Bandar Seri Begawan");
		capitalList.put("Malaysia", "Kuala Lumpur");
		capitalList.put("Indonesia", "Jakarta");
		capitalList.put("Thailand", "Bangkok");
		capitalList.put("Phillippines", "Manila");
		System.out.println("(1) " + capitalList);
		//Retrieve element from HashMap
		System.out.println("Retrieve: " + capitalList.get("Thailand"));
		//Remove element from HashMap
		capitalList.remove("Malaysia");
		System.out.println("(2) " + capitalList);
		//Get all keys inside HashMap
		System.out.println(capitalList.keySet());
		//Retrieve all elements from HashMap
		for(String country : capitalList.keySet()) {
			System.out.println("Retrieve: " + capitalList.get(country));
		}
		//Retrieve all values from HashMap
		System.out.println(capitalList.values());
		for(String capital : capitalList.values()) {
			System.out.println("Retrieve: " + capital);
		}
	}
	
}
