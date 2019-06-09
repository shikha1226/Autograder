import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class fibotest3 {

  private final int number;
  private final int values;

  public fibotest3(FiboInput3 input) {
    this.number = input.number;
    this.values = input.values;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> fiboData() {
    return Arrays.asList(new Object[][]{
      {new FiboInput3(1, Arrays.asList(1))},
      {new FiboInput3(2, Arrays.asList(1, 1))},
      {new FiboInput3(3, Arrays.asList(1, 1, 2))},
      {new FiboInput3(4, Arrays.asList(1, 1, 2, 3))},
      {new FiboInput3(10, Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55))},
    });
  }

  @Test
  public void testGetFiboSeries() {
    Fibonacci instance = new Fibonacci();
    int result = Fibo2.fib2(this.number);
    assertEquals(this.values, result);
  }

}

class FiboInput3 {

  public int number;
  public int values;

  public FiboInput3(int number, int values) {
    this.number = number;
    this.values = values;
  }

public FiboInput3(int number2, List<Integer> asList) {
	// TODO Auto-generated constructor stub
}
}