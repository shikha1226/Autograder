import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class fibotest1 {

  private final int number;
  private final int values;
  private final double sam;

  public fibotest1(FiboInput1 input) {
    this.number = input.number;
    this.values = input.values;
    this.sam = input.sam;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> fiboData() {
    return Arrays.asList(new Object[][]{
      {new FiboInput1(1, Arrays.asList(1))},
      {new FiboInput1(2, Arrays.asList(1, 1))},
      {new FiboInput1(3, Arrays.asList(1, 1, 2))},
      {new FiboInput1(4, Arrays.asList(1, 1, 2, 3))},
      {new FiboInput1(10, Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55))},
    });
  }
  @Test
  public void testfib1() {
 	 Fibo1 fibo = new Fibo1();
 	 int result = Fibo1.fib1(this.number);
 	 assertEquals(this.values, result);
  }
  
  @Test
  public void testfib2() {
    Fibonacci instance = new Fibonacci();
    int result = Fibo2.fib2(this.number);
    assertEquals(this.values, result);
  }
 @Test
 public void testfib3() {
	 Fibo3 fi = new Fibo3();
	 int result = Fibo3.fib3(this.number);
	 assertEquals(this.values, result);
 }
  
 @Test
 public void testfibonacci() {
	 Fibonacci fibo = new Fibonacci();
	 int result = Fibonacci.fib(this.number);
	 assertEquals(this.values, result);
 }
 @Test
 public void testfib4() {
	 Fibo4 fibo = new Fibo4();
	 int result = Fibo4.fib4(this.number);
	 assertEquals(this.values, result);
 }
 @Test
 public void testfib5() {
	 Fibo5 fibo = new Fibo5();
	 int result = Fibo5.fib5(this.number);
	 assertEquals(this.values, result);
 } 

 @Test
 public void testfib6() {
	 Fibo6 fibo = new Fibo6();
	 int result = Fibo6.fib6(this.number);
	 assertEquals(this.values, result);
 }
 
 @Test
 public void testfib7() {
	 Fibo7 fibo1 = new Fibo7();
	 int result = Fibo7.fib7(this.number);
	 assertEquals(this.values, result);
 }
 
@Test
  public void test() {
	plagdetection detection = new plagdetection();
	double result = plagdetection.sam;
	assertGreater(40.00, sam);
	
  }

private void assertGreater(double d, double sam2) {
	// TODO Auto-generated method stub
	
}

private void assertTrue(double d, double sam2) {
	// TODO Auto-generated method stub
	
}

}

 class FiboInput1 {

  public double sam;
public int number;
  public int values;

  public FiboInput1(int number, int values) {
    this.number = number;
    this.values = values;
  }

public FiboInput1(int number2, List<Integer> asList) {
	// TODO Auto-generated constructor stub
}
}