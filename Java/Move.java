
public class Move {

    private int numberOfRooms;
    private int roomNumber;
    //Move object
    public Move()
    {
    	numberOfRooms=5;
        roomNumber=0;
    }
	//sees if you can go south
    public boolean south(){
    	if(roomNumber == 0){
    		//System.out.println("something");
    		return false;
    	}
    	return true;
    }
	//sees if you can go north
    public boolean north(){
    	if(roomNumber == 5){
    		return false;
    	}
    	return true;
    }
	//goes north if true
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
	//goes south if true
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
	//returns that room Number
    public int roomNumber()
    {
        return roomNumber;
    }
}
