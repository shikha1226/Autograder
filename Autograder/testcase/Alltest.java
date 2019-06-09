import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ fibotest1.class,Fibonaccitest.class, Fibotest.class, fibotest2.class, fibotest3.class,
		fibotest4.class, levensh.class})
public class Alltest {

}
