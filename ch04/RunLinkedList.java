package ch04;

import java.util.LinkedList;
import java.util.ListIterator;

public class RunLinkedList {

	public static void main(String[] args) {
		LinkedList<String> countryList = new LinkedList<String>();
		ListIterator<String> countryIterator = countryList.listIterator();
		//Add element using ListIterator
		countryIterator.add("Brunei");
		System.out.println("(1) " + countryList);
		countryIterator.add("Vietnam");
		System.out.println("(2) " + countryList);
		countryIterator.add("Philippines");
		countryIterator.add("Thailand");
		countryIterator.add("Malaysia");
		System.out.println("(3) " + countryList);
		System.out.println("--Moving Iterator--");
		while(countryIterator.hasPrevious()) {
			System.out.println("Traversed Country: " + countryIterator.previous());
		}
		System.out.println("--Moving Iterator--");
		while(countryIterator.hasNext()) {
			System.out.println("Traversed Country: " + countryIterator.next());
		}
		System.out.println("--Moving Iterator--");
		int counter = 0;
		while(counter != countryList.size()/2 && countryIterator.hasPrevious()) {
			System.out.println("Traversed Country: " + countryIterator.previous());
			counter++;
		}
		
		countryIterator.remove();
		System.out.println("(4) " + countryList);
		
		if(countryIterator.hasPrevious()) {
			System.out.println("Traversed Country: " + countryIterator.previous());
		}
		
		countryIterator.set("Indonesia");
		System.out.println("(5) " + countryList);
	}
	
}
