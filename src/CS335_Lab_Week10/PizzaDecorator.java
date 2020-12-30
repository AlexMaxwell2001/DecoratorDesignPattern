package CS335_Lab_Week10;

public abstract class PizzaDecorator implements Pizza 
{
	@Override
	public String getDesc() 
	{
		return "Toppings";
	}
}

