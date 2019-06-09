import org.junit.Test;

public class Fibonacci 
{
	@Test
	
    public static  int fib(int n) 
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("n must be >= 0");
        }
	else if (n < 2)
	{
	    return n;
	}
	else 
	{
	    return fib(n - 1) + fib(n - 2);
	}
    }

  
    public  void print_usage()
    {
        System.out.println("Usage: java math.Fibonacci N");
        System.out.println("  where N >= 0");
    }

    public  void main(String[] args) 
    {
        if (args.length < 1)
        {
            print_usage();
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0)
        {
            print_usage();
            System.exit(2);
        }
        int fibonacci = Fibonacci.fib(n);
        System.out.print("fib(" + n + ") = " + fibonacci + "\n");
    }
}