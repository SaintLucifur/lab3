import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace_2() {
    int[] input1 = {};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{}, input1);
  }

  @Test
  public void testReverseInPlace_3() {
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }

  @Test
  public void testReverseInPlace_4() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
  }

  @Test
  public void testReversed_2(){
    int[] input1 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed_3(){
    int[] input1 = {1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed_4(){
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {5,2,3,4,1};
    assertEquals(3.5,ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }

  @Test
  public void testAverageWithoutLowest_2(){
    double[] input1 = {};
    assertEquals(0,ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }

  @Test
  public void testAverageWithoutLowest_3(){
    double[] input1 = {1};
    assertEquals(0,ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }

  @Test
  public void testAverageWithoutLowest_4(){
    double[] input1 = {1,1,1,1,1};
    assertEquals(1,ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }
}
