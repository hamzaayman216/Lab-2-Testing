import org.junit.Test;
import static org.junit.Assert.*;
public class MinMaxFinderTest {
    @Test
    public void firstCase(){
        MinMaxFinder y = new MinMaxFinder();
        int[] x = {1,2,3,4,8,90,124,65785,241231233};
        assertEquals(1,y.MinFinder(x));
        assertEquals(241231233, y.MaxFinder(x));
        }
    @Test
    public void secondCase(){
        MinMaxFinder y = new MinMaxFinder();
        int[] x = {8573,34,23,22,21,10,7,0};
        assertEquals(0,y.MinFinder(x));
        assertEquals(8573, y.MaxFinder(x));
    }
    @Test
    public void thirdCase(){
        MinMaxFinder y = new MinMaxFinder();
        int[] x = {1,11};
        assertEquals(1,y.MinFinder(x));
        assertEquals(11, y.MaxFinder(x));
    }
    @Test
    public void fourthCase(){
        MinMaxFinder y = new MinMaxFinder();
        int[] x = {9};
        assertEquals(9,y.MinFinder(x));
        assertEquals(9, y.MaxFinder(x));
    }
    @Test
    public void fifthCase(){
        MinMaxFinder y = new MinMaxFinder();
        int[] x = {23,434,2123,44543,112,2343,5675,434,44543};
        assertEquals(23,y.MinFinder(x));
        assertEquals(44543, y.MaxFinder(x));
    }

    }
