
public class Drink {
	private boolean hasCream;
	private boolean hasSugar;
	private boolean hasCoffee;
	//Drink object
	public Drink()
	{
		hasSugar=false;
		hasCream=false;
		hasCoffee=false;
	}
	//The look operation
	public void look(int check)
	{
		
		if(check==0)
		{
			hasCream=true;
			System.out.println("There might be something here...");
			System.out.println("You've found some creamy Cream!");
		}
		else if(check==2)
		{
			hasCoffee=true;
			System.out.println("There might be something here...");
			System.out.println("You've found some caffeinated Coffee!");
		}
		else if(check==5)
		{
			hasSugar=true;
			System.out.println("There might be something here...");
			System.out.println("You've found some sweet Sugar!");
		}
		else
		{
				System.out.println("You don't see anything out of the ordinary.");
		}
	}
	//will return true if you have everything else return false
	public boolean drinkCoffee()
	{
		if(hasSugar&&hasCream&&hasCoffee)
		{
			System.out.println("You drink the beverage and are ready to study. ");
			System.out.println("You win!");
			return true;
		}
		else if(hasSugar && hasCream)
		{
			System.out.println("You drink the sweetened Cream, but without caffeine, you can not study.");
			System.out.println("You lose!");
		}
		else if(hasCream && hasCoffee)
		{
			System.out.println("Without the Sugar, the Coffee is too bitter. You can not study.");
			System.out.println("You lose.");
			return false;
		}
		else if(hasSugar==true)
		{
			System.out.println("You eat the sugar, but without caffeine, you can not study.");
			System.out.println("You lose.");
			return false;
		}
		//else if(hasCream==false)
		else if(hasCream == true)
		{
			System.out.println("You drink the Cream, but without caffeine, you can not study.");
			System.out.println("You lose!");
			return false;
		}
		else if(hasCoffee==true)
		{
			System.out.println("You fail, you don't have coffee");
			return false;
		}
		else if(hasSugar == false && hasCream == false && hasCoffee == false){
			System.out.println("You drink the air, as you have no Coffee, Sugar or Cream.");
			System.out.println("The air is invigorating, but not invigorating enough. You can not study.");
			System.out.println("You lose!");
			return false;
		}
		return false;
	}
	//sees if you have sugar
	public boolean getSugar(){
		return hasSugar;
	}
	//sees if you have coffee
	public boolean getCoffee(){
		return hasCoffee;
	}
	//sees if you have cream
	public boolean getCream(){
		return hasCream;
	}
}
