import java.util.Scanner;

import org.junit.Test;
public class Fibo7 {
	@Test
	 public  void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        //nth element input
	        System.out.print("Enter the Fibonacci sequence number: ");
	        int n = scan.nextInt();
	        
	        
	        System.out.println("Fibonacci recursion:");
	        
	        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fib7(n));
	        
	     
	 }static int fib7(int  n) {
	            if ((n == 1) || (n == 0)) {
	                return n;
	            }
	            return fib7(n - 1) + fib7(n - 2);
	        }
	   	      
	        
}






