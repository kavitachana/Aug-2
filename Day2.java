package com.kavita.assignment;

public class Day2 {

	public static void main(String[] args) {

		String hello = "Hello World";
		int year = 1492;
		boolean dogAthome = true;
		String todaysDate = "8/2/2016";
		float cost = 5.45f;
		char letter = 'X';

		String[] favFoods = {"ice cream", "cookies", "cakes", "cupcakes", "pizza", "pasta", "chicken", "chocolate",
				"coffee", "tacos"};
		String[] favDrinks = {"vodka", "coconut rum", "moscato", "tequila", "whiskey", "red wine", "port", "gin",
				"scotch", "burbon"};

		System.out.println(hello);
		System.out.println("Columbus sailed the world in " + year + ".");
		System.out.println("It is " + dogAthome + " that I have a dog at home.");
		System.out.println("Today is " + todaysDate + ".");
		System.out.println("I spent $" + cost + " on a cheeseburger.");
		System.out.println(letter + " marks the spot.\n");

		
	//Multi-Dimensional Array (you know I had help with this)
		
		int row = 10;
		int column = 10;
		
		String[][] myFavThings = new String[row][column];
		
		for(int i = 0; i < column ; i++){
			myFavThings[0][i]= favFoods[i] + " " + favDrinks[i];
			
			System.out.println(myFavThings[0][i]);
		}
		
	}

	// 10 Methods

	private int numOfDays(int daysInAMonth) {

		return 30;
	}

	public String movie(boolean MustSee) {

		if (MustSee) {

			return "Yes";

		}

		return "No";
	}

	private float cost(int onSale) {

		return .99f;

	}

	private void winners(String name) {

		System.out.println("You win!");
	}

	public boolean toKeep(String date) {

		return true;

	}

	public void addBoat(double length) {

		for (int i = 0; i < 5; i++) {

			System.out.println("Add a boat");
		}
	}

	private String feels(float temperature) {

		if (temperature > 85.0) {

			return "It's Hot!";
		}

		else if (temperature > 60.0) {

			return "It's Nice!";
		}

		return "It's Cold!";
	}

	public int numOfPeople(String[] guestList) {

		return 100;
	}

	public void menu(String[] foodItem, float[] price) {

		for (int j = 0; j < price.length; j++) {
			System.out.println("The cost of the " + foodItem[j] + "is " + price[j]);
		}
	}

	private String willFail(boolean failed) {

		return "Failed";
	}

}
