package ch04;

import java.util.HashSet;

public class RunHashSet {

	public static void main(String[] args) {
		HashSet<String> countryList = new HashSet<String>();
		//Add element into HashSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Cambodia");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		//Retrieve all elements in HashSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
		//Check if element exist in HashSet
		System.out.println("Checking Brunei: " + countryList.contains("Brunei"));
		System.out.println("Checking brunei: " + countryList.contains("brunei"));
		//Remove element from HashSet
		countryList.remove("Brunei");
		System.out.println("(2) " + countryList);
	}

}
