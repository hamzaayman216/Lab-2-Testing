import org.junit.Test;
import static org.junit.Assert.*;
public class EvenAndOddCheckerTest {

    @Test
    public void firstEven(){
        EvenAndOddChecker x = new EvenAndOddChecker();
        int n = 6;
        assertEquals("The number is Even",x.checking(n));
    }
    @Test
    public void secondEven(){
        EvenAndOddChecker x = new EvenAndOddChecker();
        int n = 40;
        assertEquals("The number is Even",x.checking(n));
    }
    @Test
    public void thirdEven(){
        EvenAndOddChecker x = new EvenAndOddChecker();
        int n = 0;
        assertEquals("The number is Even",x.checking(n));
    }
    @Test
    public void firstOdd(){
        EvenAndOddChecker x = new EvenAndOddChecker();
        int n = 5;
        assertEquals("The number is Odd",x.checking(n));
    }
    @Test
    public void secondOdd(){
        EvenAndOddChecker x = new EvenAndOddChecker();
        int n = 121;
        assertEquals("The number is Odd",x.checking(n));
    }
    @Test(expected = IllegalArgumentException.class)
    public void negative(){
        EvenAndOddChecker x = new EvenAndOddChecker();
        int n = -10;
        x.checking(n);
    }


}
