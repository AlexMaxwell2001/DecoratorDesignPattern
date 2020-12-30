package CS335_Lab_Week10;

public class TexasGrillPizza extends MealDeals
{
	private Pizza pizza;
	public TexasGrillPizza()
	{
		buildPizza();
		getPizza();
	}
	private void buildPizza()
    {
        pizza = new SimplyNonVegPizza(); //add toppings
        pizza = new Chicken(pizza);
        pizza = new Peppers(pizza);
        pizza = new RedOnions(pizza);	
    }
	@Override
	public   Pizza getPizza()
	{
		return pizza;
	}
}
