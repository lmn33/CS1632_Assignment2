public class Move
{
	private int numberOfRooms;
	private int roomNumber;
	public Move()
	{
		numberOfRooms=5;
		roomNumber=0;
	}
	public boolean goNorth()
	{
		if(roomNumber==5)
		{
			return false;
		}
		else
		{
			++roomNumber;
			return true;
		}
	}
	public boolean goSouth()
	{
		if(roomNumber==0)
		{
			return false;
		}
		else
		{
			--roomNumber;
			return true;
		}
	}
	public int roomNumber()
	{
		return roomNumber;
	}
}