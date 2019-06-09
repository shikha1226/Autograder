import java.util.*;

import org.junit.Test; 

public class fibo22 {
	@Test
	public static  int fibonacci(int n) { 
		
		if (n == 1) {
			return 1; 
			} 
		if (n == 2) {
			return 1; 
			}
	int	fib= fibonacci(n - 1) + fibonacci(n - 2);
	return fib;
		}
 }