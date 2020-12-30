package CS335_Lab_Week10;
import java.text.DecimalFormat;
public class TestDecoratorPattern
{
	public static void main(String[] args) 
	{
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();
		
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		
		pizza = new SimplyNonVegPizza();
		
		pizza = new Meat(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		
		//this is for exercise 2 demonstrating the new toppings added
		pizza = new SimplyVegPizza();
		
		pizza = new Mushrooms(pizza);
		pizza = new Peppers(pizza);
		pizza = new Pineapple(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		
		//this is for exercise 3 demonstrating the three meal deals
		//Texas Grill
		TexasGrillPizza texas= new TexasGrillPizza();
		System.out.println("Desc: " +texas.getPizza().getDesc());
		System.out.println("Price of texas Grill Meal Deal: " + texas.getPizza().getPrice());
		
		//Vegetarian delight
		VegetarianDelightPizza veg= new VegetarianDelightPizza();
		double original=veg.getPizza().getPrice();
		double discount=original*0.8;
		System.out.println("Desc: " + veg.getPizza().getDesc());
		System.out.println("Price of Vegetarian Delight Meal Deal before discount: " + original + " after: " + discount);
		
		//Napoli 
		NapoliPizza napoli= new NapoliPizza();
		double original2=napoli.getPizza().getPrice();
		double discount2=original2*0.8;
		System.out.println("Desc: "+ napoli.getPizza().getDesc());
		System.out.println("Price of Napoli Delight Meal Deal before discount: " + original2 + " after: " + discount2);
		
	}
}
