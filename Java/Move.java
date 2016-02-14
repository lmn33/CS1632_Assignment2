
public class Move {

    private int numberOfRooms;
    private int roomNumber;
    
    public Move()
    {
    	numberOfRooms=5;
        roomNumber=0;
    }
    public boolean south(){
    	if(roomNumber == 0){
    		//System.out.println("something");
    		return false;
    	}
    	return true;
    }
    public boolean north(){
    	if(roomNumber == 5){
    		return false;
    	}
    	return true;
    }
    public boolean goNorth()
    {
        if(roomNumber==5)
        {
        	//System.out.println("There is no north door.");
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
        	//System.out.println("There is no south door.");
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
