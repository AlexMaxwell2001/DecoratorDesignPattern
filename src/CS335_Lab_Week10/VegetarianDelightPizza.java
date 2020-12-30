package CS335_Lab_Week10;

public class VegetarianDelightPizza extends MealDeals
{
	private  Pizza pizza;
	public VegetarianDelightPizza()
	{
		buildPizza();
		
	}
	private void buildPizza()
    {
        pizza = new SimplyVegPizza(); //add toppings
        pizza = new Spinach(pizza);
        pizza = new RedOnions(pizza);
        pizza = new GreenOlives(pizza);	
        pizza= new Broccoli(pizza);
    }
	public Pizza getPizza()
	{
		return pizza;
	}
}
