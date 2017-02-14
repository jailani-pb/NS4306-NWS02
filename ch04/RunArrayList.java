package ch04;

import java.util.ArrayList;

public class RunArrayList {

	public static void main(String[] args) {
		ArrayList<String> countryList = new ArrayList<String>();
		System.out.println("(1)" + countryList);
		//Add element into ArrayList
		countryList.add("Brunei");
		countryList.add("Malaysia");
		System.out.println("(2)" + countryList);
		//Add element to the front of ArrayList
		countryList.add(0, "Vietnam");
		System.out.println("(3)" + countryList);
		//Remove element from ArrayList.
		String removed = countryList.remove(0);
		System.out.println("(4)" + countryList + " Removed: " + removed);
		//Remove last element in ArrayList.
		
		
	}

}
