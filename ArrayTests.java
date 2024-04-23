import static org.junit.Assert.*;

import org.junit.Test;

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
  public void testReversed1(){
    int[] arr = {2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2 }, ArrayExamples.reversed(arr));
  }

  @Test
  public void testReverseInPlace2(){
    int[] arr = {2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2 }, ArrayExamples.reversed(arr));
  }
}
