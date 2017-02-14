package ch04;

import java.util.TreeSet;

public class RunTreeSet {

	public static void main(String[] args) {
		TreeSet<String> countryList = new TreeSet<String>();
		//Add element into TreeSet
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		countryList.add("Vietnam");
		countryList.add("Cambodia");
		countryList.add("Vietnam");
		System.out.println("(1) " + countryList);
		//Retrieve all elements in TreeSet
		for(String country : countryList) {
			System.out.println("Retrieved: " + country);
		}
		//Check if element exist in TreeSet
		System.out.println("Checking Brunei: " + countryList.contains("Brunei"));
		System.out.println("Checking brunei: " + countryList.contains("brunei"));
		//Remove element from TreeSet
		countryList.remove("Brunei");
		System.out.println("(2) " + countryList);
	}

}
