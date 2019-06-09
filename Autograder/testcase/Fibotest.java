import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class Fibotest {

  private final int number;
  private final int values;

  public Fibotest(FiboInput input) {
    this.number = input.number;
    this.values = input.values;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> fiboData() {
    return Arrays.asList(new Object[][]{
      {new FiboInput(1, Arrays.asList(1))},
      {new FiboInput(2, Arrays.asList(1, 1))},
      {new FiboInput(3, Arrays.asList(1, 1, 2))},
      {new FiboInput(4, Arrays.asList(1, 1, 2, 3))},
      {new FiboInput(10, Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55))},
    });
  }

  @Test
  public void testGetFiboSeries() {
    Fibonacci instance = new Fibonacci();
    int result = Fibo3.fib3(this.number);
    assertEquals(this.values, result);
  }

}

class FiboInput {

  public int number;
  public int values;

  public FiboInput(int number, int values) {
    this.number = number;
    this.values = values;
  }

public FiboInput(int number2, List<Integer> asList) {
	// TODO Auto-generated constructor stub
}



}


