package ch04;

import java.util.LinkedHashSet;

public class RunLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> countryList = new LinkedHashSet<String>();
		//Add element into LinkedHashSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Cambodia");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		//Retrieve all elements in LinkedHashSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
		//Check if element exist in LinkedHashSet
		System.out.println("Checking Brunei: " + countryList.contains("Brunei"));
		System.out.println("Checking brunei: " + countryList.contains("brunei"));
		//Remove element from LinkedHashSet
		countryList.remove("Brunei");
		System.out.println("(2) " + countryList);
	}

}
