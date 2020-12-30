package CS335_Lab_Week10;

public class NapoliPizza extends MealDeals
{
	private  Pizza pizza;
	public NapoliPizza()
	{
		buildPizza();
		
	}
	private void buildPizza()
    {
        pizza = new SimplyVegPizza(); //add toppings
        pizza = new FetaCheese(pizza);
        pizza = new Spinach(pizza);
        pizza = new RomaTomatoes(pizza);	
        pizza= new GreenOlives(pizza);
    }
	public Pizza getPizza()
	{
		return pizza;
	}
}