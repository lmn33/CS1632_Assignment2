import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.Test;
import static org.mockito.Mockito.*;


public class coffeeTest {
	Drink drinkTester;
	Move moveTester;
	//Mocks Drink and stubs getSugar

	@Test
	public void testVerifyDrink()  
	{
		  // create and configure mock
		  drinkTester = mock(Drink.class);
		  when(drinkTester.getSugar()).thenReturn(true);
	}
	//Mocks Move and stubs goNorth
	@Test
	public void testVerifyCream()
	{
		drinkTester = mock(Drink.class);
		when(drinkTester.getCream()).thenReturn(true);
	}
	
	@Test
	public void testVerifyMove()  
	{
		  // create and configure mock
		  moveTester = mock(Move.class);
		  when(moveTester.goNorth()).thenReturn(true);
	}
	//Mocks Move and stubs north
	@Test
	public void testVerifyMoveNorth()  
	{
		  // create and configure mock
		  moveTester = mock(Move.class);
		  when(moveTester.north()).thenReturn(true);
	}
	//Mocks Drink class and stubs goNorth
	@Test
	public void testIsSugarReturnsFalse()  
	{
		  // create and configure mock
		  moveTester = mock(Move.class);
		  when(moveTester.goNorth()).thenReturn(false);
	}
	//Makes sure oyu fail when you have nothing and drink
	@Test
	public void testDrinkNoIngredients(){
		Drink drink = new Drink();
		assertFalse(drink.drinkCoffee());
		}
	//Makes sure you pass when you have everything
	@Test
	public void testDrinkSugarCreamCoffeeTester()
	{
		Drink drink = mock(Drink.class);
		when (drink.getCoffee()).thenReturn(true);
	}
	
	@Test
	public void testDrinkSugarTester()
	{
		Drink drink = mock(Drink.class);
		when (drink.getSugar()).thenReturn(true);
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
	//Makes sure you fail whne you drink just sugar and cream
	@Test
	public void testDrinkSugarCream()
	{
		Drink drink = new Drink();
		drink.look(0);
		drink.look(5);
		assertFalse(drink.drinkCoffee());
	}
	//makes sure yiu fail when you drink only sugar and coffee
	@Test
	public void testDrinkSugarCoffee()
	{
		Drink drink = new Drink();
		drink.look(2);
		drink.look(5);
		assertFalse(drink.drinkCoffee());
	}
	//Makes sure you fail just drinking coffee and cream
	@Test
	public void testDrinkCreamCoffee()
	{
		Drink drink = new Drink();
		drink.look(0);
		drink.look(2);
		assertFalse(drink.drinkCoffee());
	}
	//Makes sure you fail just drinking cream
	@Test
	public void testDrinkCream()
	{
		Drink drink = new Drink();
		drink.look(0);
		assertFalse(drink.drinkCoffee());
	}
	//Makes sure you fail with drinking just coffee
	@Test
	public void testDrinkCoffee()
	{
		Drink drink = new Drink();
		drink.look(2);
		assertFalse(drink.drinkCoffee());
	}
	//Makes sure you fail with just sugar
	@Test
	public void testDrinkSugar()
	{
		Drink drink = new Drink();
		drink.look(5);
		assertFalse(drink.drinkCoffee());
	}
	//Makes sure you can go north from the start
	@Test
	public void testGoNorth()
	{
		Move move = new Move();
		assertTrue(move.goNorth());
		
	}
	//Makes sure you can not keep going north when you reach the last room
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
	//Makes sure that the start can go north
	@Test
	public void testNorth()
	{
		Move move = new Move();
		assertTrue(move.north());
		
	}
	//Makes sure that you cannot leave the sixth room
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
	//Tests to make sure you cannot go south from start
	@Test
	public void testGoSouthFail()
	{
		Move move = new Move();
		assertFalse(move.goSouth());
		
	}
	//Tests to make sure you can go south
	@Test
	public void testGoSouth()
	{
		Move move = new Move();
		move.goNorth();
		move.goNorth();
		assertTrue(move.goSouth());
	}
	//Tests to make sure there it is not possible to go south from start room
	@Test
	public void testSouthFail()
	{
		Move move = new Move();
		assertFalse(move.south());
		
	}
	//Tests to make sure you can go south
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
	//Sees if start room is room 0
	@Test
	public void testRoomNumberOne()
	{
		Move move = new Move();
		assertEquals(0, move.roomNumber());
	}
	//Makes sure you can not go to a negative room
	@Test
	public void testRoomNumberNegative()
	{
		Move move = new Move();
		move.goSouth();
		assertNotEquals(-1, move.roomNumber());
	}
	//Makes sure you can go to room 2
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
	//Tests to make sure you do not find sugar in position 0
	@Test
	public void getSugarFalse()
	{
		Drink drink = new Drink();
		drink.look(0);
		assertFalse(drink.getSugar());
	}
	//Tests to make sure you find cream in position 0
	@Test
	public void getCreamTrue()
	{
		Drink drink = new Drink();
		drink.look(0);
		assertTrue(drink.getCream());
	}
	//Tests to make sure you do not get cream in position 2
	@Test
	public void getCreamFalse()
	{
		Drink drink = new Drink();
		drink.look(2);
		assertFalse(drink.getCream());
	}
	//Test to see if we can find coffee
	@Test
	public void getCoffeeTrue()
	{
		Drink drink = new Drink();
		drink.look(2);
		assertTrue(drink.getCoffee());
	}
	//Tests to see if we fail to win if we just drink sugar
	@Test
	public void getCoffeeFalse()
	{
		Drink drink = new Drink();
		drink.look(5);
		assertFalse(drink.getCoffee());
	}
}

