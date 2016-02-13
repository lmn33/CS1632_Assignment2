package Java;

import java.util.*;
import java.io.*;

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
			if(move.goSouth()!=false&&move.goNorth()!=false)
			{
				System.out.println("\nYou see a "+ room_descriptions[newMove.roomNumber()] + ".\nIt has a "+ room_decor[newMove.roomNumber()] + ".\nA "+ north_doors[newMove.roomNumber()]+ " leads North.\nA "+ south_doors([newMove.roomNumber()])+" leads South.");
			}
			else if(move.goSouth()==false)				
			{
				
			}
			else if(move.goNorth()==false)				
			{
				
			}
			
			System.out.println(s);
			input = reader.next();
			if(input.toLowerCase().equals("s"))
			{
				if(!newMove.goSouth())
				{
					System.out.println("\nThere is no door to go South");
				}
				else
				{
					
				}
			}
			else if(input.toLowerCase().equals("s"))
			{
				newMove.goSouth();
			}
			else if(input.toLowerCase().equals("n"))
			{
				newMove.goSouth();
			}
			else if(input.toLowerCase().equals("i"))
			{
				
			}
			else if(input.toLowerCase().equals("l"))
			{
				newDrink.look(newMove.roomNumber());
			}
			else if(input.toLowerCase().equals("d"))
			{
				newDrink.drinkCoffee();
			}
			else if(input.toLowerCase().equals("h"))
			{
					
			}
				
		}
	}
	
}