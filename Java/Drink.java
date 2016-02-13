package Java;

public class Drink
{
	private boolean hasCream;
	private boolean hasSugar;
	private boolean hasCoffee;
	
	public Drink()
	{
		hasSugar=false;
		hasCream=false;
		hasCoffee=false;
	}
	
	public void look(int check)
	{
		if(check==0)
		{
			hasCream=true;
			System.out.println("You've found Cream :D");
		}
		else if(check==2)
		{
			hasCoffee=true;
			System.out.println("You've found Coffee :D");
		}
		else if(check==5)
		{
			hasSugar=true;
			System.out.println("You've found sugar :D");
		}
		else
		{
				System.out.println("You don't see anything of interest");
		}
	}
	
	public boolean drinkCoffee()
	{
		if(hasSugar&&hasCream&&hasCoffee)
		{
			System.out.println("You win. You've made your coffee for tonight");
			return true;
		}
		else if(hasSugar==false)
		{
			System.out.println("You fail, you don't have sugar");
			return false;
		}
		else if(hasCream==false)
		{
			System.out.println("You fail, you don't have cream");
			return false;
		}
		else if(hasCoffee==false)
		{
			System.out.println("You fail, you don't have coffee");
			return false;
		}
	}
}