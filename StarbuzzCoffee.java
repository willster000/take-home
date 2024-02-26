package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;
import java.util.Collections;

import java.util.ArrayList;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + String.format("%.2f", beverage.cost()));
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + String.format("%.2f", beverage2.cost()));
 
		Beverage beverage3 = new HouseBlend(Beverage.Size.VENTI); // now you can pass it in the constructor
		// beverage3.setSize(Beverage.Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + String.format("%.2f", beverage3.cost()));


		// Testing the sorting of beverages
		ArrayList<Beverage> beverages = new ArrayList<Beverage>();
		beverages.add(beverage);
		beverages.add(beverage2);
		beverages.add(beverage3);
		beverages.add(new Decaf(Beverage.Size.GRANDE));
		beverages.add(new DarkRoast(Beverage.Size.TALL));

		System.out.println("\nSorting beverages by cost");
		Collections.sort(beverages);

		int i;
		for (i=0; i<beverages.size(); i++) {
			System.out.println(beverages.get(i).getDescription() + 
			" $" + String.format("%.2f", beverages.get(i).cost()));
		}

		// Testing the sorting of beverages by size using a lambda
		System.out.println("\nSorting beverages by size");
		beverages.sort((Beverage b1, Beverage b2) -> b1.getSize().compareTo(b2.getSize()));

		int j;
		for (j=0; j<beverages.size(); j++) {
			System.out.println(beverages.get(j).getDescription() + 
			" $" + beverages.get(j).getSize());
		}
	}
}
