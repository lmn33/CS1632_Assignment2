package Java;

import java.util.*;
import java.io.*;
import Java.Move;

public class coffeemaker
{	
	public static void main(String [] args) throws IOException
	{
		String[] room_descriptions={"Small room","Funny room","Refinanced room","Dumb room","Bloodthirsty room","Rough room"};
		String[] room_decor={"Quaint Sofa","Sad Record Player","Tight pizza","Flat energy drink","Beautiful bag of money","Perfect air hockey table"};
		String[] north_doors={"Magneta door","Beige door","Dead door","Vivacious door","Purple door"};
		String[] south_doors={"Massive door","Smart door","Slim door","Sandy door","Minimalist door"};
		String s="INSTRUCTIONS (N,S,L,I,D,H) >";

		Move nextMove=new Move();
		System.out.println("Coffee Maker Quest 1.0");
		Scanner reader = new Scanner(System.in);
		Drink newDrink=new Drink();
		//int i=0;
		String input="";
		while(!input.equals("d"))
		//for(int i=0;i<6;++i)
		{
			if(nextMove.goSouth()!=false&&nextMove.goNorth()!=false)
			{
				System.out.println("\nYou see a "+ room_descriptions[nextMove.roomNumber()] + ".\nIt has a "+ room_decor[nextMove.roomNumber()] + ".\nA "+ north_doors[nextMove.roomNumber()]+ " leads North.\nA "+ south_doors[nextMove.roomNumber()]+" leads South.");
			}
			else if(nextMove.goSouth()==false)
			{
				
			}
			else if(nextMove.goNorth()==false)
			{
				
			}
			
			System.out.println(s);
			input = reader.next();
			input=input.toLowerCase();
			if(input.equals("s"))
			{
				if(!nextMove.goSouth())
				{
					System.out.println("\nThere is no door to go South");
				}
				else
				{
					
				}
			}
			else if(input.equals("s"))
			{
				nextMove.goSouth();
			}
			else if(input.equals("n"))
			{
				nextMove.goSouth();
			}
			else if(input.equals("i"))
			{
				
			}
			else if(input.equals("l"))
			{
				newDrink.look(nextMove.roomNumber());
			}
			else if(input.equals("d"))
			{
				newDrink.drinkCoffee();
			}
			else if(input.equals("h"))
			{
					
			}
				
		}
	}
	
}