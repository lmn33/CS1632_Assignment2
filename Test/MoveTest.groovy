package Test

import Java.Move
import org.junit.Assert;
/**
 * Created by Luke on 2/13/2016.
 */
class MoveTest extends GroovyTestCase {

    void testGoNorth()
    {
        Move testMove=new Move();
        assertTrue(testMove.goNorth(0));
    }

    void testGoSouth()
    {
        Move testSouth=new Move();
    }

    void testRoomNumber()
    {

    }
}
