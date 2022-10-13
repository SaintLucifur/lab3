import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testFilter(){
    double[] input1 = {1};
    assertEquals(0,ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }
}
