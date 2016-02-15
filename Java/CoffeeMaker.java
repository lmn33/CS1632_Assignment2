import java.util.*;
import java.io.*;

public class CoffeeMaker {

	public static void main(String[] args) 
	{
		String[] room_descriptions={"Small room","Funny room","Refinanced room","Dumb room","Bloodthirsty room","Rough room"};
		String[] room_decor={"Quaint Sofa","Sad Record Player","Tight pizza","Flat energy drink","Beautiful bag of money","Perfect air hockey table"};
		String[] north_doors={"Magneta door","Beige door","Dead door","Vivacious door","Purple door"};
		String[] south_doors={"Massive door","Smart door","Slim door","Sandy door","Minimalist door"};
		String s="INSTRUCTIONS (N,S,L,I,D,H) ";

		Move nextMove = new Move();
		System.out.println("Coffee Maker Quest 1.0\n");
		Scanner reader = new Scanner(System.in);
		Drink newDrink=new Drink();
		String input="";
		
		while(!input.equals("d"))
		
		{
			if(nextMove.south()==true && nextMove.north()==true)
			{
				System.out.println("You see a "+ room_descriptions[nextMove.roomNumber()]+"." );
				System.out.println("It has a "+ room_decor[nextMove.roomNumber()] + ".");
				System.out.println("A "+ north_doors[nextMove.roomNumber()]+ " leads North.");
				System.out.println("A "+ south_doors[nextMove.roomNumber() - 1]+" leads South.");
			}
			else if(nextMove.south()==false)
			{
				System.out.println("You see a "+ room_descriptions[nextMove.roomNumber()]+"." );
				System.out.println("It has a "+ room_decor[nextMove.roomNumber()] + ".");
				System.out.println("A "+ north_doors[nextMove.roomNumber()]+ " leads North.");
			}
			else if(nextMove.north()==false)
			{
				System.out.println("You see a "+ room_descriptions[nextMove.roomNumber()]+"." );
				System.out.println("It has a "+ room_decor[nextMove.roomNumber()] + ".");
				System.out.println("A "+ south_doors[nextMove.roomNumber()-1]+" leads South.");
			}
			
			System.out.println(s);
			input = reader.next();
			input=input.toLowerCase();
			if(input.toLowerCase().equals("s"))
			{
				if(!nextMove.goSouth())
				{
					System.out.println("\nThere is no door to go South.");
				}
				
			}
			else if(input.toLowerCase().equals("n"))
			{
				if(!nextMove.goNorth())
				{
					System.out.println("\nThere is no North door!!!");
				}
				
			}
			else if(input.toLowerCase().equals("i"))
			{
				if (newDrink.getSugar() && newDrink.getCream() && newDrink.getCoffee())
				{
					System.out.println("You have collected Sugar, Cream and Coffee.");
				}
				else if(newDrink.getSugar() && newDrink.getCream())
				{
					System.out.println("You have collected Sugar and Cream.");
				}
				else if(newDrink.getCream() && newDrink.getCoffee())
				{
					System.out.println("You have collected Cream and Coffee.");
				}
				else if(newDrink.getSugar() && newDrink.getCoffee())
				{
					System.out.println("You have collected Sugar and Coffee.");
				}
				else if(newDrink.getSugar())
				{
					System.out.println("You have collected Sugar.");
				}
				else if(newDrink.getCream())
				{
					System.out.println("You have collected Cream.");
				}
				else if(newDrink.getCoffee()){
					System.out.println("You have collected Coffee.");
				}
				else
				{
					System.out.println("You have not collected anything.");
				}
				
			}
			else if(input.toLowerCase().equals("l"))
			{
				newDrink.look(nextMove.roomNumber());
			}
			else if(input.toLowerCase().equals("d"))
			{
				newDrink.drinkCoffee();
			}
			else if(input.toLowerCase().equals("h"))
			{
				System.out.println(s);
				System.out.println("Type \"N\" to go North.");
				System.out.println("Type \"S\" to go South.");
				System.out.println("Type \"L\" to Look for items." );
				System.out.println("Type \"I\" for Inventory.");
				System.out.println("Type \"H\" for Help.");
				System.out.println("Type \"D\" to Drink.");
			}
			else{
				System.out.println("You must enter "+ s);
			}
				
		}
	}
	
}


