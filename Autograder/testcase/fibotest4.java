import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class fibotest4 {

  private final int number;
  private final int values;

  public fibotest4(FiboInput4 input) {
    this.number = input.number;
    this.values = input.values;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> fiboData() {
    return Arrays.asList(new Object[][]{
      {new FiboInput4(1, Arrays.asList(1))},
      {new FiboInput4(2, Arrays.asList(1, 1))},
      {new FiboInput4(3, Arrays.asList(1, 1, 2))},
      {new FiboInput4(4, Arrays.asList(1, 1, 2, 3))},
      {new FiboInput4(10, Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55))},
    });
  }

  @Test
  public void testGetFiboSeries() {
    Fibonacci instance = new Fibonacci();
    int result = Fibonacci.fib(this.number);
    int result1 = Fibonacci.fib(this.number);
    int result2 = Fibonacci.fib(this.number);
    assertEquals(this.values, result);
    assertEquals(this.values, result1);
    assertEquals(this.values, result2);
    
  }

}

class FiboInput4 {

  public int number;
  public int values;

  public FiboInput4(int number, int values) {
    this.number = number;
    this.values = values;
  }

public FiboInput4(int number2, List<Integer> asList) {
	// TODO Auto-generated constructor stub
}
}