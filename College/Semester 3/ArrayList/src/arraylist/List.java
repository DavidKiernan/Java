package arraylist;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {

		ArrayList<String> listItems = new ArrayList<String>();

		listItems.add("red"); // append an item to the list
		listItems.add(0, "yellow"); // insert the value at index 0

		System.out.print("Display list contents with counter-controlled loop:");

		// display the colors in the list

		for (int i = 0; i < listItems.size(); i++) {
			System.out.printf(" %s", listItems.get(i));
		}

		display(listItems,
				"\nDisplay list contents with enhanced for statement:");
		listItems.add("green"); // add "green" to the end of the list
		listItems.add("yellow"); // add "yellow" to the end of the list
		display(listItems, "List with two new elements:");

		listItems.remove("yellow"); // remove the first "yellow"
		display(listItems, "Remove first instance of yellow:");
		listItems.remove(1); // remove item at index 1
		display(listItems, "Remove second list element (green):");

		// check if value is in the List
		if (listItems.contains("red")) {
			System.out.printf("\"red\" is in the list\n");
		} else {
			System.out.printf("\"red\" is not in the list\n");
		}
		System.out.printf("Size: %s\n", listItems.size());
	}

	// display the ArrayList's elements on the console
	public static void display(ArrayList<String> items, String header) {
		System.out.print(header); // display header
		// display each element in items
		for (String item : items)
			System.out.printf(" %s", item);
		System.out.println(); // display end of line
	} // end method display
} // end class ArrayListCollection