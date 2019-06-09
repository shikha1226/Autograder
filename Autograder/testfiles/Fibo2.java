import java.util.Scanner;

import org.junit.Test;
public class Fibo2 {
	@Test
	 public  void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        //nth element input
	        System.out.print("Enter the Fibonacci sequence number: ");
	        int n = scan.nextInt();
	        
	        
	        System.out.println("Fibonacci recursion:");
	        
	        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fib2(n));
	        
	     
	 }static int fib2(int  n) {
	            if ((n == 1) || (n == 0)) {
	                return n;
	            }
	            return fib2(n - 1) + fib2(n - 2);
	        }
	   	      
	        
}






