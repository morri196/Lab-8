package Lab20Bonus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab20Bonus {
	
	String universalVariable = "inventory";//this is a class variable. Which means all methods can use it. it goes between the {} scope under class.

	public static void main(String[] args) {
		//key is item as a string
		//value is price as a double
		HashMap<String, Double> inventory = new HashMap<String, Double>();
		ArrayList<String> shoppingCart = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		String cont;
		
		//useful in the beginning when building out your code. The following below, was moved to fillInventory method for easier readability
		//"Enter item name: "
		//"Enter another item? "
		//key is item as a string
		//value is price as a double
		//inventory.put("apple", 0.99);
		//inventory.put("avocado", 0.69);
		//inventory.put("spinach", 5.99);
		//inventory.put("coconut water", 1.50);
		//inventory.put("fish", 6.99);
		//inventory.put("milk", 2.99);
		//inventory.put("cucumber", 1.75);
		//inventory.put("butter", 3.00);
		
		//Fills the inventory
		inventory = fillInventory(inventory);
		
		//display inventory
		displayInventory(inventory);
		
		//missing a method
		
		//pass to method- scanner, inventory, prompt,
		//could return a String, then add to shoppingCart
		do {
		//"Enter item name: "   need validator
		String prompt ="What would you like to order? ";
		String newItem = enterItem(scnr, inventory, prompt);
		
			//create shoppingCart ArrayList
		
		//add that item to the shoppingCart
		shoppingCart.add(newItem);
		//"add another item? " 
			//System.out.println("Add another item? ");
			cont = Validator.getStringMatchingRegex(scnr, "Add another item? ", "[yYnN]");//getting String method from validator...calling the validator
			//cont = cont.toLowerCase();
			//if yes, then repeat to the top
		} while (cont.equals("y"));
		
		//if no, display
		System.out.println("This is your cart");
		System.out.println(shoppingCart);
		
		//average(); this displays average price of all items
		average(shoppingCart, inventory);
		
		//highest(); this displays highest price item
		highest(shoppingCart, inventory);
		
		//lowest(); this displays lowest price item
		lowest(shoppingCart, inventory);
	
	}
	
	private static void lowest(ArrayList<String> shoppingCart, HashMap<String, Double> inventory) {
		// TODO Auto-generated method stub
		
	}

	private static void highest(ArrayList<String> shoppingCart, HashMap<String, Double> inventory) {
		double highest = 0.0;
		for (String fruit : shoppingCart) {
			
			if (highest < inventory.get(fruit) ) {
				highest = inventory.get(fruit);
			}
		}	System.out.println(inventory + " cost the most.");
		
	}

	private static void average(ArrayList<String> shoppingCart, HashMap<String, Double> inventory) {
		double sum = 0;
		int count = 0;
		for ( String fruit : shoppingCart ) {
			//sum gets from the inventory, the value of the "key" in this case fruit!
			sum += inventory.get(fruit);
			count++;
		}
		System.out.println(sum/count);
	}

	private static String enterItem(Scanner scnr, HashMap<String, Double> inventory, String prompt) {
		String userInput;
		System.out.println(prompt);
		
		userInput = scnr.nextLine();
		//if userInput is in out inventory, then return userInput
		if (inventory.containsKey(userInput) == true) {
			System.out.println("Confirmation! " + userInput + " added to cart!");
			//else method
		}	else {
				System.out.println("Sorry, we cannot help you find you " + userInput + "! :(");
				enterItem(scnr, inventory, prompt);
		}
		return userInput;
	}

	private static HashMap<String, Double> fillInventory(HashMap<String, Double> inventory) {
		// TODO Auto-generated method stub
		inventory.put("apple", 0.99);
		inventory.put("avocado", 0.69);
		inventory.put("spinach", 5.99);
		inventory.put("coconut water", 1.59);
		inventory.put("fish", 6.99);
		inventory.put("milk", 2.99);
		inventory.put("cucumber", 1.75);
		inventory.put("butter", 3.00);
		return inventory;
	}

	
	private static void displayInventory(HashMap<String, Double> inventory) {
		//we want to use a for loop
		String format = "%-10s\t\t%s";//%-10s (setting the amount to tab to 10) \t (tab once) \t (tab twice) %s (expect a String)
		String format2 ="%-10s  %10s";
		System.out.printf(format2, "Item", "Price"); //System.out.printf(); because we are printing format hence f and not ln.
		System.out.println();
		System.out.println("==============");
		//looping through our inventory
		for (String fruit : inventory.keySet()) {
			//this line prints out for each individual fruit
			System.out.println(fruit + " " + inventory.get(fruit));
		}
	}

}
