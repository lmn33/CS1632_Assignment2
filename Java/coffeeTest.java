import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.Test;
import static org.mockito.Mockito.*;


public class coffeeTest {
	Drink drinkTester;
	Move moveTester;
	@Test
	public void testVerifyDrink()  
	{
		  // create and configure mock
		  drinkTester = mock(Drink.class);
		  when(drinkTester.getSugar()).thenReturn(true);
	}
	@Test
	public void testVerifyMove()  
	{
		  // create and configure mock
		  moveTester = mock(Move.class);
		  when(moveTester.goNorth()).thenReturn(true);
	}
	
	@Test
	public void testVerifyMoveNorth()  
	{
		  // create and configure mock
		  moveTester = mock(Move.class);
		  when(moveTester.north()).thenReturn(true);
	}
	
	@Test
	public void testIsSugarReturnsFalse()  
	{
		  // create and configure mock
		  drinkTester = mock(Drink.class);
		  when(moveTester.goNorth()).thenReturn(true);
	}
	
	@Test
	public void testDrinkNoIngredients(){
		Drink drink = new Drink();
		assertFalse(drink.drinkCoffee());
		}
	
	@Test
	public void testDrinkSugarCreamCoffee()
	{
		Drink drink = new Drink();
		drink.look(0);
		drink.look(2);
		drink.look(5);
		assertTrue(drink.drinkCoffee());
		
	}
	
	@Test
	public void testDrinkSugarCream()
	{
		Drink drink = new Drink();
		drink.look(0);
		drink.look(5);
		assertFalse(drink.drinkCoffee());
	}
	
	@Test
	public void testDrinkSugarCoffee()
	{
		Drink drink = new Drink();
		drink.look(2);
		drink.look(5);
		assertFalse(drink.drinkCoffee());
	}
	
	@Test
	public void testDrinkCreamCoffee()
	{
		Drink drink = new Drink();
		drink.look(0);
		drink.look(2);
		assertFalse(drink.drinkCoffee());
	}
	
	@Test
	public void testDrinkCream()
	{
		Drink drink = new Drink();
		drink.look(0);
		assertFalse(drink.drinkCoffee());
	}
	
	@Test
	public void testDrinkCoffee()
	{
		Drink drink = new Drink();
		drink.look(2);
		assertFalse(drink.drinkCoffee());
	}
	
	@Test
	public void testDrinkSugar()
	{
		Drink drink = new Drink();
		drink.look(5);
		assertFalse(drink.drinkCoffee());
	}
	
	@Test
	public void testGoNorth()
	{
		Move move = new Move();
		assertTrue(move.goNorth());
		
	}
	
	@Test
	public void testGoNorthFail()
	{
		Move move = new Move();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();		
		assertFalse(move.goNorth());
	}
	
	@Test
	public void testNorth()
	{
		Move move = new Move();
		assertTrue(move.north());
		
	}
	
	@Test
	public void testNorthFail()
	{
		Move move = new Move();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();	
		assertFalse(move.north());
		
	}
	
	@Test
	public void testGoSouthFail()
	{
		Move move = new Move();
		assertFalse(move.goSouth());
		
	}
	
	@Test
	public void testGoSouth()
	{
		Move move = new Move();
		move.goNorth();
		move.goNorth();
		assertTrue(move.goSouth());
	}
	
	@Test
	public void testSouthFail()
	{
		Move move = new Move();
		assertFalse(move.south());
		
	}
	
	@Test
	public void testSouth()
	{
		Move move = new Move();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		assertTrue(move.south());
		
	}
	
	@Test
	public void testRoomNumberOne()
	{
		Move move = new Move();
		assertEquals(0, move.roomNumber());
	}
	
	@Test
	public void testRoomNumberNegative()
	{
		Move move = new Move();
		move.goSouth();
		assertNotEquals(-1, move.roomNumber());
	}
	
	@Test
	public void testRoomNumberTwo()
	{
		Move move = new Move();
		move.goNorth();
		assertEquals(1, move.roomNumber());
	}
	
	@Test//In array it is index 6, but room 5.
	public void testRoomNumberFive()
	{
		Move move = new Move();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		assertEquals(5, move.roomNumber());
	}
	
	@Test//testing for room 7 which does not exist, but in the array it is in index 6.
	public void testRoomNumberSeven()
	{
		Move move = new Move();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		move.goNorth();
		assertNotEquals(6, move.roomNumber());
	}
	
	@Test//Looking in room 5 which contains the sugar.
	public void getSugarTrue()
	{		
		Drink drink = new Drink();
		drink.look(5);
		assertTrue(drink.getSugar());
	}
	
	@Test
	public void getSugarFalse()
	{
		Drink drink = new Drink();
		drink.look(0);
		assertFalse(drink.getSugar());
	}
	
	@Test
	public void getCreamTrue()
	{
		Drink drink = new Drink();
		drink.look(0);
		assertTrue(drink.getCream());
	}
	
	@Test
	public void getCreamFalse()
	{
		Drink drink = new Drink();
		drink.look(2);
		assertFalse(drink.getCream());
	}
	
	@Test
	public void getCoffeeTrue()
	{
		Drink drink = new Drink();
		drink.look(2);
		assertTrue(drink.getCoffee());
	}
	
	@Test
	public void getCoffeeFalse()
	{
		Drink drink = new Drink();
		drink.look(5);
		assertFalse(drink.getCoffee());
	}
}

